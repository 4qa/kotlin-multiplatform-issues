pluginManagement{
    repositories{
        mavenCentral()
        jcenter()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
        maven("https://plugins.gradle.org/m2/")
    }
}

rootProject.name = "kotlin-multiplatform-issues"
include("library")
include("app")
