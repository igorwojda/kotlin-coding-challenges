package com.igorwojda.challenge.utils

import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtClassBody
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtImportList
import org.jetbrains.kotlin.psi.KtObjectDeclaration
import java.io.File

object KotlinGeneratorUtils {
    fun getTestFiles(challengeDirectoryPath: File): List<TestFile> {
        val challengeKtFile =
            KotlinParserUtils.getChallengeKtFile(challengeDirectoryPath, ChallengeFile.CHALLENGE_KT)
        val solutionKtFile =
            KotlinParserUtils.getChallengeKtFile(challengeDirectoryPath, ChallengeFile.SOLUTIONS_KT)
        val challengeName = getChallengeName(challengeKtFile)

        val solutions = getSolutions(solutionKtFile)

        return solutions.map {
            getTestFile(challengeName, challengeKtFile, solutionKtFile, it)
        }
    }

    private fun getTestFile(
        challengeName: String,
        challengeKtFile: KtFile,
        solutionKtFile: KtFile,
        solution: KtObjectDeclaration,
    ): TestFile {

        val solutionName = checkNotNull(solution.name) { "Solution name is null" }
        val packageStr = getPackage(challengeKtFile, solutionName)
        val imports = getImports(solutionKtFile, challengeKtFile)
        val solutionMembers = getSolutionMembers(solution)
        val tests = getTests(challengeKtFile)

        val lines = listOf(
            listOf(packageStr),
            listOf("\n"),
            imports,
            listOf("\n"),
            solutionMembers,
            listOf("\n"),
            tests
        ).flatten()

        val testrSolutionFileName = getFileName(solution, challengeName)
        val relativePath = solutionName.toLowerCase()

        return TestFile(testrSolutionFileName, relativePath, lines)
    }

    private fun getChallengeName(challengeKtFile: KtFile) =
        challengeKtFile
            .packageFqName
            .toString()
            .removePrefix("com.igorwojda.")
            .replace(".", "_")

    private fun getTests(challengeKtFile: KtFile): List<String> {
        val tests = challengeKtFile
            .children
            .filterIsInstance<KtClass>()
            .firstOrNull { it.name == "Test" }
            .also { checkNotNull(it) { "Missing 'Test' class in ${challengeKtFile.name}" } }
            ?.text
            ?.split("\n")

        return tests ?: listOf()
    }

    private fun getImports(
        solutionKtFile: KtFile,
        challengeKtFile: KtFile,
    ) = (solutionKtFile.children.toList() + challengeKtFile.children.toList())
        .filterIsInstance<KtImportList>()
        .flatMap { it.imports }
        .map { it.text }
        .toSet()
        .toList()

    private fun getPackage(ktFile: KtFile, solutionName: String) =
        "package generated.${ktFile.packageFqName}.$solutionName".toLowerCase()

    private fun getFileName(solution: KtObjectDeclaration, challengeName: String): String {
        val solutionName = checkNotNull(solution.name) { "Solution name is null" }
        return "Test_${challengeName}_$solutionName.kt"
    }

    private fun getSolutions(ktFile: KtFile) = ktFile
        .children
        .filterIsInstance<KtObjectDeclaration>()
        .filterNot { it.name == "KtLintWillNotComplain" }

    private fun getSolutionMembers(solution: KtObjectDeclaration) = solution
        .children
        .filterIsInstance<KtClassBody>()
        .first()
        .children
        .joinToString(separator = "\n\n") { it.text }
        .split("\n")
}

data class TestFile(
    val fileName: String,
    val relativePath: String,
    val lines: List<String>,
)
