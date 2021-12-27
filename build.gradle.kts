plugins {
    java
    `maven-publish`
    id("com.github.johnrengelman.shadow") version("7.1.1")
}

group = "me.jonakls"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

subprojects {
    apply(plugin="java")
    apply(plugin="com.github.johnrengelman.shadow")

    repositories {
        mavenCentral()
        maven("https://repo.codemc.io/repository/nms/")
    }
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}