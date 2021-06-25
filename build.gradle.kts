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
    js(LEGACY) {
        browser()
    }
    macosX64()
    linuxX64()
    mingwX64()

    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting
        val jvmTest by getting

        val jsMain by getting
        val jsTest by getting

        val macosX64Main by getting
        val macosX64Test by getting
        val linuxX64Main by getting
        val linuxX64Test by getting
        val mingwX64Main by getting
        val mingwX64Test by getting

        val sharedNativeMain by creating{
            dependsOn(commonMain)
            macosX64Main.dependsOn(this)
            linuxX64Main.dependsOn(this)
            mingwX64Main.dependsOn(this)
        }
    }
}
