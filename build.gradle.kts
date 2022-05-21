import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.6.21"
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1")
	testImplementation("org.junit.jupiter:junit-jupiter:5.7.1")
	testImplementation("org.amshove.kluent:kluent:1.65")
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
	kotlinOptions.jvmTarget = "1.8"
}
