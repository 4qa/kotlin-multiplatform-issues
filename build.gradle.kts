plugins {
    kotlin("multiplatform") version "1.5.20"
}

group = "local.atyrin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm()

    sourceSets {
        val commonMain by getting {
            dependencies{
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
            }
        }
        val jvmMain by getting
    }
}
