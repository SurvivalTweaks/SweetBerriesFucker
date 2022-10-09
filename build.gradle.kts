group = "com.vjh0107"
version = "1.0-SNAPSHOT"

subprojects {
    repositories {
        mavenCentral()
        mavenLocal()
        maven("https://www.jitpack.io")

        // Paper
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}