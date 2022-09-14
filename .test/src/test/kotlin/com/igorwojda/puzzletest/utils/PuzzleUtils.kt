package com.igorwojda.puzzletest.utils

import java.io.File

object PuzzleUtils {

    /**
     * Return repository root directory File
     */
    private val repoRootDirectoryFile by lazy {
        val scriptDirectory = File("")
        println(scriptDirectory.absolutePath)
        scriptDirectory.absoluteFile.parentFile
    }

    /**
     * Return list of project names
     */
    fun getPuzzleDirectories(): List<File> {
        val puzzleDirectoryPath = "${repoRootDirectoryFile.path}/src/test"
        val puzzleDirectory = File(puzzleDirectoryPath)
        val miscDirectoryName = "misc"

        return puzzleDirectory
            .walk()
            .filter { it.isDirectory }
            .filter { it.name != miscDirectoryName }
            .filter { it.isHighLevelDirectory }
            .toList()
    }

    /**
     * Checks whatever or not directory is high level directory (puzzle grouping directory)
     */
    private val File.isHighLevelDirectory get() = this.isDirectory && this.listFiles().none { it.isDirectory }
}
