plugins {
    kotlin("multiplatform").apply(false) version "1.6.0-M1-382"
//    kotlin("multiplatform").apply(false) version "1.5.30"
    id("org.jlleitschuh.gradle.ktlint") version "10.2.0"
}

group = "local.atyrin"
version = "1.0-SNAPSHOT"

allprojects {
    apply(plugin = "org.jlleitschuh.gradle.ktlint")


    repositories {
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
    }
}
