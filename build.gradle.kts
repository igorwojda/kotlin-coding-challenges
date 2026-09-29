import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.test.logger)
    alias(libs.plugins.spotless)
    `jvm-test-suite`
}

repositories {
    mavenCentral()
}

sourceSets {
    // Generates tests for every solution (see generateTests task)
    create("testGenerator")
}

dependencies {
    testImplementation(libs.junit.jupiter)
    testImplementation(libs.kluent)
    testRuntimeOnly(libs.junit.platform.launcher)

    "testGeneratorImplementation"(libs.kotlin.compiler.embeddable)
}

testing {
    suites {
        // Verifies structure of the challenges (file names, solution objects, test classes)
        register<JvmTestSuite>("konsistTest") {
            useJUnitJupiter(libs.versions.junit)

            dependencies {
                implementation(libs.konsist)
            }

            targets.all {
                testTask.configure {
                    // Konsist reads challenge sources directly, so re-run the task when they change
                    inputs
                        .dir("src/test/kotlin/com/igorwojda")
                        .withPathSensitivity(PathSensitivity.RELATIVE)
                }
            }
        }
    }
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()

    testLogging {
        events("failed")

        // log full stacktrace of failed test (assertion library descriptive error)
        exceptionFormat = TestExceptionFormat.FULL
    }
}

// Combines every Challenge.kt with each solution from Solution.kt into src/test/kotlin/generated
tasks.register<JavaExec>("generateTests") {
    group = "verification"

    val testGenerator = sourceSets["testGenerator"]
    classpath = testGenerator.runtimeClasspath
    mainClass = "com.igorwojda.challenge.utils.TestUtilsKt"
    args(rootDir.path)
}

kotlin {
    jvmToolchain(25)
}

spotless {
    kotlin {
        target(
            "src/test/kotlin/com/igorwojda/**/*.kt",
            "src/konsistTest/kotlin/**/*.kt",
            "src/testGenerator/kotlin/**/*.kt",
        )

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

    kotlinGradle {
        target("*.gradle.kts")

        ktlint()
    }
}
