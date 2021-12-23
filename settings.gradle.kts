rootProject.name= "nightmare-text"

include(":bukkit", ":core", ":api")

arrayOf(
    "adapt-v1_8_R3",
    "adapt-v1_9_R2"
).forEach {
    include(":versions:$it")
}