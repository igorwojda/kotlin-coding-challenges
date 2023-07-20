import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
    kotlin("jvm") version "1.9.0"
    id("com.adarshr.test-logger") version "3.2.0"
    id("com.diffplug.spotless") version "6.20.0"
}

repositories {
    mavenCentral()
    maven("https://plugins.gradle.org/m2/")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
    testImplementation("org.amshove.kluent:kluent:1.73")
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
        target("test/com/igorwojda/**/*.kt")
        ktlint()

        indentWithSpaces()
        endWithNewline()
    }
}
