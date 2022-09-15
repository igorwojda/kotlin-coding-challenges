import com.igorwojda.challenge.utils.TestUtils
import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.7.10"
}

repositories {
	mavenCentral()
}

dependencies {
	testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
	testImplementation("org.amshove.kluent:kluent:1.68")
	testImplementation("org.jetbrains.kotlin:kotlin-compiler:1.7.10")
}

tasks.test {
	useJUnitPlatform()

	testLogging {
		events("failed")

		// log full stacktrace of failed test (assertion library descriptive error)
		exceptionFormat = TestExceptionFormat.FULL
	}
}

tasks.withType<KotlinCompile>().configureEach {
	kotlinOptions.jvmTarget = "11"
}

task("generateTests") {
	group = "verification"

	afterEvaluate {
		TestUtils.generateTestFiles(project)
	}

//	afterEvaluate {
//		// Filter modules with "lintDebug" task (non-Android modules do not have lintDebug task)
//		val lintTasks = subprojects.mapNotNull { "${it.name}:lintDebug" }
//
//		// Get modules with "testDebugUnitTest" task (app module does not have it)
//		val testTasks = subprojects.mapNotNull { "${it.name}:testDebugUnitTest" }
//			.filter { it != "app:testDebugUnitTest" }
//
//		// All task dependencies
//		val taskDependencies =
//			mutableListOf("app:assembleAndroidTest", "ktlintCheck", "detekt").also {
//				it.addAll(lintTasks)
//				it.addAll(testTasks)
//			}
//
//		// By defining Gradle dependency all dependent tasks will run before this "empty" task
//		dependsOn(taskDependencies)
//	}
}

