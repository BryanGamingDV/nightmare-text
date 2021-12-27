dependencies {
    arrayOf(
        "adapt-v1_8_R3",
        "adapt-v1_9_R2",
        "adapt-v1_10_R1",
        "adapt-v1_11_R1",
        "adapt-v1_12_R1",
        "adapt-v1_13_R1",
        "adapt-v1_14_R1",
        "adapt-v1_15_R1",
        "adapt-v1_16_R1",
        "adapt-v1_17_R1",
        "adapt-v1_18_R1"
    ).forEach {
        implementation(project(":versions:$it"))
    }
    compileOnly(project(":api"))
    compileOnly("org.spigotmc:spigot:1.8.8-R0.1-SNAPSHOT")
}

tasks {
    shadowJar {
        archiveBaseName.set("nightmare-text-bukkit")
        minimize()
    }
}