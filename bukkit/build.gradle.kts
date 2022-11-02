plugins {
    kotlin("jvm")
    id("com.vjh0107.bukkit-resource-generator")
    id("com.vjh0107.bukkit-executor")
}

group = "com.vjh0107"
version = "1.0.0"

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.19.2-R0.1-SNAPSHOT")
    compileOnly("dev.jorel:commandapi-shade:8.5.1")

    compileOnly("com.vjh0107:barcodeframework-core:1.0.0") { isTransitive = true }
    compileOnly("com.vjh0107:barcodeframework-common:1.0.0") { isTransitive = true }
    compileOnly("com.vjh0107:barcodeframework-database:1.0.0") { isTransitive = true }
}

barcodeTasks {
    archiveTask = tasks.jar

    bukkitResourceGenerator {
        name = "SweetBerriesFucker"
        main = "com.vjh0107.sweetberriesfucker.SweetBerriesFuckerPlugin"
        depend = listOf("BarcodeFramework")
        author = "vjh0107"
        website = "http://github.com/SurvivalTweaks"
        apiVersion = "1.19"
    }
    bukkitExecutor {
        this.bukkitDir.set(file("localBukkit"))
        this.bukkitFileName.set("paper.jar")
        this.enabled.set(false)
    }
}