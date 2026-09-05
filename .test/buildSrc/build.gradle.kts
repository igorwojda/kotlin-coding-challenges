plugins {
    `kotlin-dsl`
}

// The kotlin-dsl plugin requires a repository to be declared
repositories {
    mavenCentral()
}


dependencies {
    implementation("org.jetbrains.kotlin:kotlin-compiler-embeddable:2.4.10")
}
