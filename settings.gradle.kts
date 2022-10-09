rootProject.name = "SweetBerriesFucker"

pluginManagement {
    plugins {
        kotlin("jvm") version "1.7.10" apply false
        java
        id("net.minecrell.plugin-yml.bukkit") version "0.5.1" apply false
    }

    repositories {
        gradlePluginPortal()
        mavenLocal()
    }
}

include("bukkit")