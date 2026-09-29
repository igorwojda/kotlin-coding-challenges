package com.igorwojda.konsist

import com.lemonappdev.konsist.api.Konsist
import com.lemonappdev.konsist.api.declaration.KoFileDeclaration
import com.lemonappdev.konsist.api.verify.assertTrue
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File

class ChallengeKonsistTest {
    @Test
    fun `every challenge has Challenge_kt, Solution_kt and README_md files`() {
        val missingFiles =
            challengeDirectories.flatMap { directory ->
                REQUIRED_FILES
                    .map { File(directory, it) }
                    .filterNot { it.isFile }
                    .map { it.path }
            }

        assertEquals(emptyList<String>(), missingFiles, "Missing challenge files")
    }

    @Test
    fun `solution file declares solution objects`() {
        solutionFiles.assertTrue { it.hasObjects(includeNested = false) }
    }

    @Test
    fun `solution objects are named Solution1, Solution2 and so on`() {
        solutionFiles.assertTrue { file ->
            val names =
                file
                    .objects(includeNested = false)
                    .map { it.name }
                    .filterNot { it == KTLINT_WORKAROUND_OBJECT }

            names == List(names.size) { "Solution${it + 1}" }
        }
    }

    @Test
    fun `challenge declares exactly one top level Test or Tests class`() {
        challengeFiles.assertTrue { challengeFile ->
            val directory = File(challengeFile.path).parent

            scope.files
                .filter { File(it.path).parent == directory && it.nameWithExtension in TEST_CLASS_FILES }
                .flatMap { it.classes(includeNested = false) }
                .count { it.name in TEST_CLASS_NAMES } == 1
        }
    }

    private companion object {
        const val CHALLENGE_KT = "Challenge.kt"
        const val SOLUTION_KT = "Solution.kt"
        const val README_MD = "README.md"
        const val KTLINT_WORKAROUND_OBJECT = "KtLintWillNotComplain"

        val REQUIRED_FILES = listOf(CHALLENGE_KT, SOLUTION_KT, README_MD)
        val TEST_CLASS_FILES = setOf(CHALLENGE_KT, "Tests.kt")
        val TEST_CLASS_NAMES = setOf("Test", "Tests")

        val scope by lazy { Konsist.scopeFromDirectory("src/test/kotlin/com/igorwojda") }

        // Every directory that contains Kotlin files is a challenge
        val challengeDirectories by lazy { scope.files.map { File(it.path).parentFile }.distinct() }

        val challengeFiles by lazy { scope.files.named(CHALLENGE_KT) }

        val solutionFiles by lazy { scope.files.named(SOLUTION_KT) }

        fun List<KoFileDeclaration>.named(nameWithExtension: String) = filter { it.nameWithExtension == nameWithExtension }
    }
}
