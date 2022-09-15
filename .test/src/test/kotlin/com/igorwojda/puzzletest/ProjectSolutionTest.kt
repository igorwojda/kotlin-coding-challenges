package com.igorwojda.puzzletest

import com.igorwojda.puzzletest.utils.PuzzleUtils
import com.igorwojda.puzzletest.utils.SolutionFile
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.io.File

class ProjectSolutionTest {

    @ParameterizedTest(name = "Puzzle file exists: {0}")
    @MethodSource("getPuzzleDirectories")
    fun `Puzzle file exists`(puzzleDirectoryPath: File) {
        val solutions = getSolutions(puzzleDirectoryPath)
        val challenge = getChallenge(puzzleDirectoryPath)

        solutions.forEach { solution ->
            writeTestFile(puzzleDirectoryPath, solution)
        }

        val a = 3
    }

    /**
     * Create a test files for a given puzzle by combining challenge file with available solutions
     */
    private fun writeTestFile(puzzleDirectoryPath: File, solution: Solution) {
        val sourceChallengeFile = getPuzzleFile(puzzleDirectoryPath, SolutionFile.CHALLENGE_KT)
        val generatedTestDirectory = PuzzleUtils.getGeneratedTestDirectory()
        val testFileName = "Test${solution.name}"

        val targetChallengeDirectory = File("${generatedTestDirectory.path}/${solution.relativePath}/")
        targetChallengeDirectory.mkdirs()

        val targetChallengeFile = File("${targetChallengeDirectory.path}/$testFileName.kt")

        val targetChallengeFileLines = getTargetChallengeFileLines(sourceChallengeFile, solution)
        targetChallengeFile.writeText(targetChallengeFileLines.joinToString(separator = "\n"))
    }

    /**
     * Return source challenge file with modified
     */
    private fun getTargetChallengeFileLines(sourceFile: File, solution: Solution): MutableList<String> {
        val lines = mutableListOf<String>()

        var skipLine = false
        sourceFile.forEachLine {
            if (it.trimStart() == "TODO(\"not implemented\")") {
                lines.removeLast()
                lines.addAll(solution.lines)
                skipLine = true
            } else {
                if (skipLine) {
                    // remove line after "...not implemented..." line
                    skipLine = false
                } else {
                    lines.add(it)
                }
            }
        }

        return lines
    }

    /**
     * Return list of available solutions.
     */
    private fun getSolutions(puzzleDirectoryPath: File): MutableList<Solution> {
        val file = getPuzzleFile(puzzleDirectoryPath, SolutionFile.SOLUTIONS_KT)

        var objectFound = false
        var solutionLines = mutableListOf<String>()
        val solutions = mutableListOf<Solution>()
        var curlyBracketsCount = 0
        var relativePath = ""

        file.forEachLine { line ->
            if (relativePath.isEmpty()) {
                relativePath = getPackagePath(line)
            }

            if (line.contains("object Solution")) {
                if (objectFound) {
                    throw RuntimeException("Object already found. Nested objects are not allowed for solutions.")
                }

                objectFound = true
                solutionLines = mutableListOf()
                curlyBracketsCount = 0
            }

            if (objectFound) {
                solutionLines.add(line)
                curlyBracketsCount += line.count { char -> char == '{' }
                curlyBracketsCount -= line.count { char -> char == '}' }
            }

            if (curlyBracketsCount == 0 && objectFound) {
                objectFound = false
                val solution = Solution(solutionLines, relativePath)
                solutions.add(solution)
            }
        }

        return solutions
    }

    private fun getPackagePath(packageLine: String) = packageLine
        .replace(".", "/")
        .replaceFirst("package ", "")

    private fun getPuzzleFile(puzzleDirectoryPath: File, solutionFile: SolutionFile): File {
        val path = "${puzzleDirectoryPath.path}/${solutionFile.fileName}"
        return File(path)
    }

    companion object {
        @JvmStatic
        fun getPuzzleDirectories() = PuzzleUtils
            .getPuzzleDirectories().take(1)
    }

    /**
     * Challenge is represented by list of lines (retrieved from Challenge.kt file).
     */
    private fun getChallenge(puzzleDirectoryPath: File): Challenge {
        val file = getPuzzleFile(puzzleDirectoryPath, SolutionFile.CHALLENGE_KT)
        val lines = file.readLines()
        return Challenge(lines)
    }
}

/**
 * Challenge is represented by list of lines (retrieved from Challenge.kt file).
 */
class Challenge(val fileLines: List<String>) {

}

/**
 * Solution is represented by list of lines (retrieved from Solutions.kt file).
 */
class Solution(fileLines: List<String>, val relativePath: String) {

    val lines = fileLines
        .drop(1)
        .dropLast(1)
        .map { it.replaceFirst("    ", "") }

    /**
     * Derives name from 1st line
     * "private object Solution1 {" -> "Solution1"
     */
    val name = if (lines.isEmpty()) {
        ""
    } else {
        check(!fileLines.contains("private object ")) { "Incorrect Solution 1st line: $fileLines" }

        val line = fileLines[0]
        line.replaceFirst("private object ", "")
            .replaceFirst(" {", "")
    }
}
