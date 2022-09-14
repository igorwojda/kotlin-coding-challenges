package com.igorwojda.puzzletest

import com.igorwojda.puzzletest.utils.KotlinParserUtils
import com.igorwojda.puzzletest.utils.PuzzleFile
import com.igorwojda.puzzletest.utils.TestUtils
import org.jetbrains.kotlin.psi.KtFile
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.io.File

class ProjectSolutionTest {

    @ParameterizedTest(name = "Puzzle file exists: {0}")
    @MethodSource("getPuzzleDirectories")
    fun `Puzzle file exists`(puzzleDirectoryPath: File) {
        val solutions = getSolutions(puzzleDirectoryPath)
        val challengeKtFile = getPuzzleKtFile(puzzleDirectoryPath, PuzzleFile.CHALLENGE_KT)

        solutions.forEach { solution ->
//            writeTestFile(puzzleDirectoryPath, solution)
        }

        val a = 3
    }

    /**
     * Create a test files for a given puzzle by combining challenge file with available solutions
     */
    private fun writeTestFile(puzzleDirectoryPath: File, solution: Solution) {
        val sourceChallengeFile = getPuzzleFile(puzzleDirectoryPath, PuzzleFile.CHALLENGE_KT)
        val generatedTestDirectory = TestUtils.generatedTestDirectory
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
        val file = getPuzzleKtFile(puzzleDirectoryPath, PuzzleFile.SOLUTIONS_KT)



        return mutableListOf()
    }

    private fun getPackagePath(packageLine: String) = packageLine
        .replace(".", "/")
        .replaceFirst("package ", "")

    private fun getPuzzleKtFile(puzzleDirectoryPath: File, puzzleFile: PuzzleFile): KtFile {
        val file = getPuzzleFile(puzzleDirectoryPath, puzzleFile)
        return KotlinParserUtils.getKtFile(file.readText(), puzzleFile.fileName)
    }

    private fun getPuzzleFile(puzzleDirectoryPath: File, puzzleFile: PuzzleFile): File {
        val path = "${puzzleDirectoryPath.path}/${puzzleFile.fileName}"
        return File(path)
    }

    companion object {
        @JvmStatic
        fun getPuzzleDirectories() = TestUtils
            .getPuzzleDirectories().take(1)
    }
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
