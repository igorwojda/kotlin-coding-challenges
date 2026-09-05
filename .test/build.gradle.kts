
import com.igorwojda.challenge.utils.TestUtils
import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
    kotlin("jvm") version "2.4.10"
    id("com.adarshr.test-logger") version "4.0.0"
    id("com.diffplug.spotless") version "8.10.2"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.14.4")
    testImplementation("org.amshove.kluent:kluent:1.73")
    testImplementation("org.jetbrains.kotlin:kotlin-compiler-embeddable:2.4.10")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()

    testLogging {
        events("failed")

        // log full stacktrace of failed test (assertion library descriptive error)
        exceptionFormat = TestExceptionFormat.FULL
    }
}

tasks.register("generateTests") {
    group = "verification"

    doLast {
        TestUtils.generateTestFiles(project)
    }
}

kotlin {
    jvmToolchain(19)
}

spotless {
    kotlin {
        ktlint().editorConfigOverride(
            mapOf(
                "ktlint_code_style" to "intellij_idea",
            ),
        )

        leadingTabsToSpaces()
        endWithNewline()
    }
}
