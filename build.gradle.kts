plugins {
//    kotlin("multiplatform") version "1.6.0-dev-1396"
    kotlin("multiplatform") version "1.6.0-dev-2459"
}

group = "local.atyrin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
}

kotlin {
    macosX64() {
        compilations.getByName("main") {
            cinterops {
                create("dummy") {
                    headers("libs/include/dummy/dummy.h")
                    compilerOpts.add("-Ilibs/include")
                }
            }
        }
    }
    linuxX64(){
        compilations.getByName("main") {
            cinterops {
                create("dummy") {
                    headers("libs/include/dummy/dummy.h")
                    compilerOpts.add("-Ilibs/include")
                }
            }
        }
    }

    sourceSets {
        val commonMain by getting

        val macosX64Main by getting
        val linuxX64Main by getting

        val upperMain by creating {
            dependsOn(commonMain)
        }

        val lowerMain by creating {
            dependsOn(upperMain)
            macosX64Main.dependsOn(this)
            linuxX64Main.dependsOn(this)
        }
    }
}

