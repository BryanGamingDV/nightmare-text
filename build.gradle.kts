plugins {
    java
    id("com.github.johnrengelman.shadow") version("7.1.1")
}

subprojects {
    apply(plugin="java")
    apply(plugin="com.github.johnrengelman.shadow")

    repositories {
        mavenCentral()
        maven("https://repo.codemc.io/repository/nms/")
    }
}