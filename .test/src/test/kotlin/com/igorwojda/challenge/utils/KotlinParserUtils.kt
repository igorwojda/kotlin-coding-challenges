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
            EnvironmentConfigFiles.JVM_CONFIG_FILES,
        ).project
    }

    private fun getChallengeFile(challengeDirectoryPath: File, chalengeFile: ChallengeFile): File {
        val path = "${challengeDirectoryPath.path}/${chalengeFile.fileName}"
        return File(path)
    }

    fun getChallengeKtFile(pchallengeDirectoryPath: File, ChallengeFile: ChallengeFile): KtFile {
        val file = getChallengeFile(pchallengeDirectoryPath, ChallengeFile)
        val fullFileName = "${pchallengeDirectoryPath.path}/${ChallengeFile.fileName}"
        return getChallengeKtFile(file.readText(), fullFileName)
    }

    private fun getChallengeKtFile(codeString: String, fileName: String) =
        PsiManager.getInstance(project)
            .findFile(
                LightVirtualFile(fileName, KotlinFileType.INSTANCE, codeString),
            ) as KtFile
}
