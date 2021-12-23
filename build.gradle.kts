plugins {
    java
}

subprojects {
    apply(plugin="java")

    repositories {
        mavenCentral()
        maven("https://repo.codemc.io/repository/nms/")
    }
}