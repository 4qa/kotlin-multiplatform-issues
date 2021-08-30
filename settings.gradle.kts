pluginManagement{
    repositories{
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
    }
}

rootProject.name = "kotlin-multiplatform-issues"
include("library")
