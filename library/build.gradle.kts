plugins {
    kotlin("multiplatform") version("1.5.30-dev-2689")
}

group = "local.atyrin"
version = "1.0-SNAPSHOT"

kotlin {
    jvm()
    linuxX64()
}