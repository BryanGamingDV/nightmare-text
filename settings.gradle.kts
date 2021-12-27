rootProject.name= "nightmare-text"

include(":bukkit", ":api")

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
    include(":versions:$it")
}