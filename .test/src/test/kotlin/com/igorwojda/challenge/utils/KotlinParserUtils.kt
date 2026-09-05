package com.igorwojda.challenge.utils

import org.jetbrains.kotlin.K1Deprecation
import org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles
import org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment
import org.jetbrains.kotlin.com.intellij.openapi.util.Disposer
import org.jetbrains.kotlin.com.intellij.psi.PsiManager
import org.jetbrains.kotlin.com.intellij.testFramework.LightVirtualFile
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.idea.KotlinFileType
import org.jetbrains.kotlin.psi.KtFile
import java.io.File

object KotlinParserUtils {
    @OptIn(K1Deprecation::class, CompilerConfiguration.Internals::class)
    private val project by lazy {
        KotlinCoreEnvironment.createForProduction(
            Disposer.newDisposable(),
            CompilerConfiguration(),
            EnvironmentConfigFiles.JVM_CONFIG_FILES,
        ).project
    }

    private fun getChallengeFile(
        challengeDirectoryPath: File,
        challengeFile: ChallengeFile,
    ): File {
        val path = "${challengeDirectoryPath.path}/${challengeFile.fileName}"
        return File(path)
    }

    fun getChallengeKtFile(
        challengeDirectoryPath: File,
        challengeFile: ChallengeFile,
    ): KtFile {
        val file = getChallengeFile(challengeDirectoryPath, challengeFile)
        return getKtFile(file)
    }

    fun getKtFile(file: File): KtFile = getChallengeKtFile(file.readText(), file.path)

    private fun getChallengeKtFile(
        codeString: String,
        fileName: String,
    ) = PsiManager.getInstance(project)
        .findFile(
            LightVirtualFile(fileName, KotlinFileType.INSTANCE, codeString),
        ) as KtFile
}
