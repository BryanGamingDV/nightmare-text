plugins {
    java
    `maven-publish`
    id("com.github.johnrengelman.shadow") version("7.1.1")
}

group = "me.jonakls"
version = "0.0.1-SNAPSHOT"

subprojects {
    apply(plugin = "java-library")
    apply(plugin = "com.github.johnrengelman.shadow")

    repositories {
        mavenCentral()
        maven("https://repo.codemc.io/repository/nms/")
    }

    tasks {
        java {
            toolchain {
                languageVersion.set(
                    JavaLanguageVersion.of(
                        project.property("java").toString()
                    )
                )
            }
        }
    }
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks {
    shadowJar {
        archiveBaseName.set("nightmare-text-root")
        destinationDirectory.set(file("$rootDir/bin/"))
        minimize()

    }

    clean {
        delete("${rootDir}/bin/")
    }
}