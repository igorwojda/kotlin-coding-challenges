import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.test.logger)
    alias(libs.plugins.spotless)
}

repositories {
    mavenCentral()
    maven("https://plugins.gradle.org/m2/")
}

dependencies {
    testImplementation(libs.junit.jupiter)
    testImplementation(libs.kluent)
    testRuntimeOnly(libs.junit.platform.launcher)
}

sourceSets {
    test {
        java {
            srcDirs.add(File("src/test"))
        }
    }
}

tasks.test {
    useJUnitPlatform()

    testLogging {
        events("failed")

        // log full stacktrace of failed test (assertion library descriptive error)
        exceptionFormat = TestExceptionFormat.FULL
    }
}

kotlin {
    jvmToolchain(19)
}

spotless {
    kotlin {
        target("src/test/kotlin/com/igorwojda/**/*.kt")

        ktlint().editorConfigOverride(
            mapOf(
                "ktlint_code_style" to "intellij_idea",
                // Every solution for a challenge lives in one Solution.kt
                "ktlint_standard_filename" to "disabled",
            ),
        )

        leadingTabsToSpaces()
        endWithNewline()
    }
}
