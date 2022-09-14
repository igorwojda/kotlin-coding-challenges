package com.igorwojda.puzzletest

import com.igorwojda.puzzletest.utils.PuzzleUtils
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.io.File
import java.nio.file.Files
import kotlin.io.path.Path

class ProjectConsistencyTests {

    @ParameterizedTest(name = "Puzzle file exists: {0}")
    @MethodSource("getPuzzleRequiredFilePaths")
    fun `Puzzle file exists`(puzzleFilePath: String) {
        val path = Path(puzzleFilePath)
        require(Files.exists(path)) { "Missing file $path" }
    }

    companion object {
        @JvmStatic
        fun getPuzzleRequiredFilePaths() = PuzzleUtils
            .getPuzzleDirectories()
            .flatMap {
                getProjectRequiredFiles(it)
            }

        private fun getProjectRequiredFiles(puzzleDirectory: File) = listOf(
            "desc.md",
            "challenge.kt",
            "solution.kt"
        ).map {
            "${puzzleDirectory.path}/$it"
        }
    }
}
