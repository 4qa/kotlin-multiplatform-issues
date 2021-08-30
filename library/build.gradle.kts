plugins {
    kotlin("multiplatform")
}

group = "local.atyrin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    watchos()
    ios()

    sourceSets {
        val commonMain by getting
        val commonTest by getting

        val consumeDarwinMain by creating{
            dependsOn(commonMain)
        }
        val iosMain by getting{
            dependsOn(consumeDarwinMain)
        }

        val watchosMain by getting{
            dependsOn(consumeDarwinMain)
        }
    }
}