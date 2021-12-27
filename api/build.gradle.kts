dependencies {
    compileOnly("org.spigotmc:spigot:1.8.8-R0.1-SNAPSHOT")
}

tasks {
    shadowJar {
        archiveBaseName.set("nightmare-text-api")
        destinationDirectory.set(file("$rootDir/bin/"))
        minimize()

    }

    clean {
        delete("${rootDir}/bin/")
    }
}