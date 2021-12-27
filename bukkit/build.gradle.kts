dependencies {
    arrayOf(
        "adapt-v1_8_R3",
        "adapt-v1_9_R2",
        "adapt-v1_17_R1"
    ).forEach {
        implementation(project(":versions:$it"))
    }
    compileOnly(project(":api"))
    compileOnly("org.spigotmc:spigot:1.8.8-R0.1-SNAPSHOT")
}

tasks {
    shadowJar {
        archiveBaseName.set("nightmare-text-bukkit.jar")
        minimize()
    }
}