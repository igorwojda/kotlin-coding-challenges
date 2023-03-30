
import com.igorwojda.challenge.utils.TestUtils
import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
    kotlin("jvm") version "1.8.10"
    id("com.adarshr.test-logger") version "3.2.0"
    id("com.diffplug.spotless") version "6.17.0"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    testImplementation("org.amshove.kluent:kluent:1.72")
    testImplementation("org.jetbrains.kotlin:kotlin-compiler:1.8.20")
}

tasks.test {
    useJUnitPlatform()

    testLogging {
        events("failed")

        // log full stacktrace of failed test (assertion library descriptive error)
        exceptionFormat = TestExceptionFormat.FULL
    }
}

task("generateTests") {
    group = "verification"

    TestUtils.generateTestFiles(project)
}

kotlin {
    jvmToolchain(17)
}

spotless {
    kotlin {
        ktlint()

        indentWithSpaces()
        endWithNewline()
    }
}
