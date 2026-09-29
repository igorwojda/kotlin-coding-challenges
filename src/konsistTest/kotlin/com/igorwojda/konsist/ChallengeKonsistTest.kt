package com.igorwojda.konsist

import com.lemonappdev.konsist.api.Konsist
import com.lemonappdev.konsist.api.declaration.KoFileDeclaration
import com.lemonappdev.konsist.api.verify.assertTrue
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import java.io.File
import java.util.stream.Stream

class ChallengeKonsistTest {
    @TestFactory
    fun `every challenge has Challenge_kt, Solution_kt and README_md files`(): Stream<DynamicTest> = challengeDirectories.stream().map { directory ->
        dynamicTest("${directory.challengeName} has Challenge.kt, Solution.kt and README.md files") {
            val missingFiles = REQUIRED_FILES.filterNot { File(directory, it).isFile }

            assertEquals(emptyList<String>(), missingFiles, "Missing challenge files")
        }
    }

    @TestFactory
    fun `solution file declares solution objects`(): Stream<DynamicTest> = solutionFiles.stream().map { solutionFile ->
        val testName = "${solutionFile.challengeName} Solution.kt declares solution objects"

        dynamicTest(testName) {
            solutionFile.assertTrue(testName = testName) { it.hasObjects(includeNested = false) }
        }
    }

    @TestFactory
    fun `solution objects are named Solution1, Solution2 and so on`(): Stream<DynamicTest> = solutionFiles.stream().map { solutionFile ->
        val testName = "${solutionFile.challengeName} solution objects are named Solution1, Solution2 and so on"

        dynamicTest(testName) {
            solutionFile.assertTrue(testName = testName) { file ->
                val names =
                    file
                        .objects(includeNested = false)
                        .map { it.name }
                        .filterNot { it == KTLINT_WORKAROUND_OBJECT }

                names == List(names.size) { "Solution${it + 1}" }
            }
        }
    }

    @TestFactory
    fun `challenge declares exactly one top level Test or Tests class`(): Stream<DynamicTest> = challengeFiles.stream().map { challengeFile ->
        val testName = "${challengeFile.challengeName} declares exactly one top level Test or Tests class"

        dynamicTest(testName) {
            challengeFile.assertTrue(testName = testName) {
                val directory = File(it.path).parent

                scope.files
                    .filter { file -> File(file.path).parent == directory && file.nameWithExtension in TEST_CLASS_FILES }
                    .flatMap { file -> file.classes(includeNested = false) }
                    .count { klass -> klass.name in TEST_CLASS_NAMES } == 1
            }
        }
    }

    private companion object {
        const val CHALLENGES_PATH = "src/test/kotlin/com/igorwojda"
        const val CHALLENGE_KT = "Challenge.kt"
        const val SOLUTION_KT = "Solution.kt"
        const val README_MD = "README.md"
        const val KTLINT_WORKAROUND_OBJECT = "KtLintWillNotComplain"

        val REQUIRED_FILES = listOf(CHALLENGE_KT, SOLUTION_KT, README_MD)
        val TEST_CLASS_FILES = setOf(CHALLENGE_KT, "Tests.kt")
        val TEST_CLASS_NAMES = setOf("Test", "Tests")

        val scope by lazy { Konsist.scopeFromDirectory(CHALLENGES_PATH) }

        val challengesRoot by lazy { File(CHALLENGES_PATH).absoluteFile }

        // Every directory that contains Kotlin files is a challenge
        val challengeDirectories by lazy { scope.files.map { File(it.path).parentFile }.distinct() }

        val challengeFiles by lazy { scope.files.named(CHALLENGE_KT) }

        val solutionFiles by lazy { scope.files.named(SOLUTION_KT) }

        fun List<KoFileDeclaration>.named(nameWithExtension: String) = filter { it.nameWithExtension == nameWithExtension }

        // Challenge path relative to challenges root, e.g. "string/ispalindrome/permutation"
        val File.challengeName: String
            get() = absoluteFile.relativeTo(challengesRoot).invariantSeparatorsPath

        val KoFileDeclaration.challengeName: String
            get() = File(path).parentFile.challengeName
    }
}
