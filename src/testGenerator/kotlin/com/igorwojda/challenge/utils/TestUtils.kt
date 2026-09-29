package com.igorwojda.challenge.utils

import java.io.File

/**
 * Entry point of the `generateTests` Gradle task. Expects repository root directory path as the first argument.
 */
fun main(args: Array<String>) {
    val rootDirectory = File(args.single())
    TestUtils.generateTestFiles(rootDirectory)
}

object TestUtils {

    fun generateTestFiles(rootDirectory: File) {
        getChallengeDirectories(rootDirectory).forEach {
            generateChallengeTestFiles(it)
        }
    }

    /**
     * Generate test files for a given challenge by combining challenge file with available solutions
     */
    private fun generateChallengeTestFiles(challengeDirectoryPath: File) {
        val generatedChallengeDirecotryPath = challengeDirectoryPath
            .path
            .replace("kotlin/com/igorwojda/", "kotlin/generated/com/igorwojda/")

        // May be already pre-cached by CI
        deleteDirectory(File(generatedChallengeDirecotryPath))

        val testFiles = KotlinGeneratorUtils.getTestFiles(challengeDirectoryPath)

        testFiles
            .forEach {
                createTestFile(generatedChallengeDirecotryPath, it)
            }
    }

    private fun deleteDirectory(directory: File) {
        if (directory.isDirectory) {
            val files = directory.listFiles()

            // if the directory contains any file
            if (files != null) {
                for (file in files) {
                    // recursive call if the subdirectory is non-empty
                    deleteDirectory(file)
                }
            }
        }
        directory.delete()
    }

    /**
     * Create a test files for a given challenge
     */
    private fun createTestFile(generatedChallengeDirecotryPath: String, testFile: TestFile) {
        val testDirectory = File("$generatedChallengeDirecotryPath/${testFile.relativePath}/")
        testDirectory.mkdirs()

        val targetChallengeFile = File("${testDirectory.path}/${testFile.fileName}")
        targetChallengeFile.writeText(testFile.lines.joinToString(separator = "\n"))
    }

    /**
     * Return list of project names
     */
    private fun getChallengeDirectories(rootDirectory: File): List<File> {
        val path = "${rootDirectory.path}/src/test/kotlin/com/igorwojda"
        val directory = File(path)
        val miscDirectoryName = "misc"

        return directory
            .walk()
            .filter { it.isDirectory }
            .filter { it.name != miscDirectoryName }
            .filter { it.isHighLevelDirectory }
            .toList()
    }

    /**
     * Checks whatever or not directory is high level directory (challenge grouping directory)
     */
    private val File.isHighLevelDirectory get() = this.isDirectory && this.listFiles().none { it.isDirectory }
}
