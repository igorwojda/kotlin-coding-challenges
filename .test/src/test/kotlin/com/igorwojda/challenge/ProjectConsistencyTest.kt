package com.igorwojda.challenge

import com.igorwojda.challenge.utils.ChallengeFile
import com.igorwojda.challenge.utils.KotlinParserUtils
import com.igorwojda.challenge.utils.TestUtils
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeGreaterOrEqualTo
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtObjectDeclaration
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.opentest4j.AssertionFailedError
import java.io.File
import java.nio.file.Files
import kotlin.io.path.Path

class ProjectConsistencyTest {

    @ParameterizedTest(name = "chalenge file exists: {0}")
    @MethodSource("getChallengeRequiredFilePaths")
    fun `challenge file exists`(challengeFilePath: String) {
        val path = Path(challengeFilePath)
        require(Files.exists(path)) { "Missing file $path" }
    }

    @ParameterizedTest(name = "solution kt file has solution objects: {0}")
    @MethodSource("getSolutionFiles")
    fun `solution kt file has solution objects`(ktFile: KtFile) {
        // given
        val solutions = ktFile
            .children
            .filterIsInstance<KtObjectDeclaration>()

        // then
        solutions.size shouldBeGreaterOrEqualTo 1
    }

    @ParameterizedTest(name = "solution kt file has solution objects with correct names: {0}")
    @MethodSource("getSolutionFiles")
    fun `solution kt file has solution objects with correct names`(ktFile: KtFile) {
        // given
        val solutionNames = ktFile
            .children
            .filterIsInstance<KtObjectDeclaration>()
            .map { it.name ?: "" }
            .filterNot { it == "KtLintWillNotComplain" }

        // then
        solutionNames.forEach {
            if (!it.startsWith("Solution")) {
                throw AssertionFailedError("Solution object name does not contains 'Solution' prefix $it")
            }
        }
    }

    @ParameterizedTest(name = "challenge kt file has one at most one top level Test class: {0}")
    @MethodSource("getChallenge")
    fun `challenge kt file has one top level Test class`(ktFile: KtFile) {
        // given
        val classes = ktFile
            .children
            .filterIsInstance<KtClass>().filter { it.name == "Test" }

        // then
        classes.size shouldBeEqualTo 1
    }

    companion object {
        @JvmStatic
        fun getSolutionFiles() = TestUtils
            .getChellengeDirectories()
            .map { KotlinParserUtils.getChallengeKtFile(it, ChallengeFile.SOLUTIONS_KT) }

        @JvmStatic
        fun getChallenge() = TestUtils
            .getChellengeDirectories()
            .map { KotlinParserUtils.getChallengeKtFile(it, ChallengeFile.CHALLENGE_KT) }

        @JvmStatic
        fun getChallengeRequiredFilePaths() = TestUtils
            .getChellengeDirectories()
            .flatMap { getProjectRequiredFiles(it) }

        private fun getProjectRequiredFiles(challengeDirectory: File) = ChallengeFile
            .values()
            .map { "${challengeDirectory.path}/${it.fileName}" }
    }
}
