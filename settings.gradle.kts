rootProject.name= "nightmare-text"

include(":bukkit", ":api")

arrayOf(
    "adapt-v1_8_R3",
    "adapt-v1_9_R2",
    "adapt-v1_17_R1"
).forEach {
    include(":versions:$it")
}