import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
    kotlin("jvm") version "1.8.10"
    id("com.adarshr.test-logger") version "3.2.0"
    id("com.diffplug.spotless") version "6.17.0"
}

repositories {
    mavenCentral()
    maven("https://plugins.gradle.org/m2/")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    testImplementation("org.amshove.kluent:kluent:1.72")
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
    jvmToolchain(17)
}

spotless {
    kotlin {
        target("test/com/igorwojda/**/*.kt")
        ktlint()

        indentWithSpaces()
        endWithNewline()
    }
}
