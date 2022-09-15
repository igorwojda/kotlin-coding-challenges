package com.igorwojda.challenge.utils

import com.intellij.openapi.util.Disposer
import com.intellij.psi.PsiManager
import com.intellij.testFramework.LightVirtualFile
import org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles
import org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.idea.KotlinFileType
import org.jetbrains.kotlin.psi.KtFile
import java.io.File

object KotlinParserUtils {

    private val project by lazy {
        KotlinCoreEnvironment.createForProduction(
            Disposer.newDisposable(),
            CompilerConfiguration(),
            EnvironmentConfigFiles.JVM_CONFIG_FILES
        ).project
    }

    private fun getPuzzleFile(puzzleDirectoryPath: File, puzzleFile: PuzzleFile): File {
        val path = "${puzzleDirectoryPath.path}/${puzzleFile.fileName}"
        return File(path)
    }

    fun getPuzzleKtFile(puzzleDirectoryPath: File, puzzleFile: PuzzleFile): KtFile {
        val file = getPuzzleFile(puzzleDirectoryPath, puzzleFile)
        val fullFileName = "${puzzleDirectoryPath.path}/${puzzleFile.fileName}"
        return getPuzzleKtFile(file.readText(), fullFileName)
    }

    private fun getPuzzleKtFile(codeString: String, fileName: String) =
        PsiManager.getInstance(project)
            .findFile(
                LightVirtualFile(fileName, KotlinFileType.INSTANCE, codeString)
            ) as KtFile
}
