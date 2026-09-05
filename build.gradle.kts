import jdk.internal.vm.vector.VectorSupport.test
import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
    kotlin("jvm") version "2.4.10"
    id("com.adarshr.test-logger") version "4.0.0"
    id("com.diffplug.spotless") version "8.10.2"
}

repositories {
    mavenCentral()
    maven("https://plugins.gradle.org/m2/")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:6.1.3")
    testImplementation("org.amshove.kluent:kluent:1.73")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
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
