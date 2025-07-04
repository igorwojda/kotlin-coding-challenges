
import com.igorwojda.challenge.utils.TestUtils
import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
    kotlin("jvm") version "1.9.25"
    id("com.adarshr.test-logger") version "3.2.0"
    id("com.diffplug.spotless") version "6.25.0"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.13.3")
    testImplementation("org.amshove.kluent:kluent:1.73")
    testImplementation("org.jetbrains.kotlin:kotlin-compiler:1.9.25")
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
    jvmToolchain(19)
}

spotless {
    kotlin {
        ktlint()

        indentWithSpaces()
        endWithNewline()
    }
}
