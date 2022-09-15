package com.igorwojda.challenge.utils

import java.io.File

object TestUtils {

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
        val path = "${repoRootDirectoryFile.path}/src/test"
        val directory = File(path)
        val miscDirectoryName = "misc"

        return directory
            .walk()
            .filter { it.isDirectory }
            .filter { it.name != miscDirectoryName }
            .filter { it.isHighLevelDirectory }
            .toList()
//            .take(1)
    }

    val generatedTestDirectory = File("${repoRootDirectoryFile.path}/.test/src/test/kotlin/generated")

    /**
     * Checks whatever or not directory is high level directory (puzzle grouping directory)
     */
    private val File.isHighLevelDirectory get() = this.isDirectory && this.listFiles().none { it.isDirectory }
}
