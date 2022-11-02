rootProject.name = "SweetBerriesFucker"

pluginManagement {
    plugins {
        kotlin("jvm") version "1.7.10" apply false
        java
        id("com.vjh0107.bukkit-resource-generator") version "1.0.1-beta1" apply false
        id("com.vjh0107.bukkit-executor") version "1.0.1-beta4" apply false
    }

    repositories {
        gradlePluginPortal()
        mavenLocal()
    }
}

include("bukkit")