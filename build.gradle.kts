plugins {
//    kotlin("multiplatform").apply(false) version "1.5.30"
    kotlin("multiplatform").apply(false) version "1.6.0-M1-110"
}

group = "local.atyrin"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
    }
}