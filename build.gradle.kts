plugins {
    kotlin("multiplatform") version "1.5.30-RC-109"
//    kotlin("multiplatform") version "1.5.20"
}

group = "local.atyrin"
version = "1.0-SNAPSHOT"

allprojects{
repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
}}

kotlin {
    ios()
    watchos()

    sourceSets {
        val commonMain by getting

        val iosMain by getting
        val watchosMain by getting

        val sharedNativeMain by creating{
            dependsOn(commonMain)
            iosMain.dependsOn(this)
            watchosMain.dependsOn(this)
        }
    }
}
