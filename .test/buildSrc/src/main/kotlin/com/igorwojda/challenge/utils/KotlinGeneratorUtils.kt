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
        val testsKtFile = File(challengeDirectoryPath, "Tests.kt")
            .takeIf { it.isFile }
            ?.let { KotlinParserUtils.getKtFile(it) }
        val challengeName = getChallengeName(challengeKtFile)

        val solutions = getSolutions(solutionKtFile)

        return solutions.map {
            getTestFile(challengeName, challengeKtFile, solutionKtFile, testsKtFile, it)
        }
    }

    private fun getTestFile(
        challengeName: String,
        challengeKtFile: KtFile,
        solutionKtFile: KtFile,
        testsKtFile: KtFile?,
        solution: KtObjectDeclaration,
    ): TestFile {

        val solutionName = checkNotNull(solution.name) { "Solution name is null" }
        val packageStr = getPackage(challengeKtFile, solutionName)
        val imports = getImports(*listOfNotNull(solutionKtFile, challengeKtFile, testsKtFile).toTypedArray())
        val solutionMembers = getSolutionMembers(solution)
        val tests = getTests(listOfNotNull(challengeKtFile, testsKtFile))
        val solutionMemberNames = solution.declarations.mapNotNull { it.name }.toSet()
        val sharedDeclarations = challengeKtFile.declarations
            .filterNot { it.name in solutionMemberNames || it.name in setOf("Test", "Tests") }
            .map { it.text }

        val lines = listOf(
            listOf(packageStr),
            listOf("\n"),
            imports,
            listOf("\n"),
            sharedDeclarations,
            listOf("\n"),
            solutionMembers,
            listOf("\n"),
            tests
        ).flatten()

        val testrSolutionFileName = getFileName(solution, challengeName)
        val relativePath = solutionName.lowercase()

        return TestFile(testrSolutionFileName, relativePath, lines)
    }

    private fun getChallengeName(challengeKtFile: KtFile) =
        challengeKtFile
            .packageFqName
            .toString()
            .removePrefix("com.igorwojda.")
            .replace(".", "_")

    private fun getTests(ktFiles: List<KtFile>): List<String> {
        val tests = ktFiles
            .flatMap { it.declarations }
            .filterIsInstance<KtClass>()
            .filter { it.name == "Test" || it.name == "Tests" }

        check(tests.size == 1) {
            "Expected exactly one 'Test' or 'Tests' class in ${ktFiles.joinToString { it.name }}, found ${tests.size}"
        }
        return tests.single().text.lines()
    }

    private fun getImports(
        vararg ktFiles: KtFile,
    ) = ktFiles.flatMap { it.children.toList() }
        .filterIsInstance<KtImportList>()
        .flatMap { it.imports }
        .map { it.text }
        .toSet()
        .toList()

    private fun getPackage(ktFile: KtFile, solutionName: String) =
        "package generated.${ktFile.packageFqName}.$solutionName".lowercase()

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
