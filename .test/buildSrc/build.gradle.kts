buildscript {
    repositories {
        maven("https://plugins.gradle.org/m2/")
    }

    dependencies {
        classpath("com.adarshr:gradle-test-logger-plugin:3.2.0")
    }
}

plugins {
    `kotlin-dsl`
    id("com.adarshr.test-logger") version "3.2.0"
}

// The kotlin-dsl plugin requires a repository to be declared
repositories {
    mavenCentral()
}


dependencies {
    implementation("org.jetbrains.kotlin:kotlin-compiler:1.7.10")
}
