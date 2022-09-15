package com.igorwojda.challenge.utils

import org.gradle.api.Project
import java.io.File

object TestUtils {

    fun generateTestFiles(project: Project) {
        getChallengeDirectories(project).forEach {
            generateTestFiles(it)
        }
    }

    /**
     * Generate test files for a given challenge by combining challenge file with available solutions
     */
    private fun generateTestFiles(challengeDirectoryPath: File) {
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
    private fun getChallengeDirectories(project: Project): List<File> {
        val path = "${project.rootDir.path}/../src/test/kotlin/com/igorwojda"
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
