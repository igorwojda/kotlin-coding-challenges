import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
    kotlin("jvm") version "1.8.10"
    id("com.adarshr.test-logger") version "3.2.0"
    id("com.diffplug.spotless") version "6.22.0"
}

repositories {
    mavenCentral()
    maven("https://plugins.gradle.org/m2/")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
    testImplementation("org.amshove.kluent:kluent:1.73")
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
        target("test/com/igorwojda/**/*.kt")
        ktlint()

        indentWithSpaces()
        endWithNewline()
    }
}
