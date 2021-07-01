plugins {
    kotlin("multiplatform") version "1.5.30-dev-2892"
}

group = "local.atyrin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
}

kotlin {
    jvm()
//    js(LEGACY) {
//        browser()
//    }

    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting
        val jvmTest by getting

//        val jsMain by getting
//        val jsTest by getting
    }
}
