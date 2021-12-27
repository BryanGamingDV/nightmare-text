package me.jonakls.bukkit.version;

import me.jonakls.api.PacketModel;
import me.jonakls.packets.v1_10_R1;
import me.jonakls.packets.v1_11_R1;
import me.jonakls.packets.v1_13_R1;
import me.jonakls.packets.v1_14_R1;
import me.jonakls.packets.v1_15_R1;
import me.jonakls.packets.v1_16_R1;
import me.jonakls.packets.v1_17_R1;
import me.jonakls.packets.v1_18_R1;
import me.jonakls.packets.v1_8_R3;
import me.jonakls.packets.v1_9_R2;
import me.jonkls.packets.v1_12_R1;
import org.bukkit.Bukkit;

public class ServerVersion {

    public PacketModel getModelVersion() {
        String version = Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3];

        if (version.contains("1_8_R3")) {
            return new v1_8_R3();
        }
        if (version.contains("1_9_R2")) {
            return new v1_9_R2();
        }
        if (version.contains("1_10_R1")) {
            return new v1_10_R1();
        }
        if (version.contains("1_11_R1")) {
            return new v1_11_R1();
        }
        if (version.contains("1_12_R1")) {
            return new v1_12_R1();
        }
        if (version.contains("1_13_R1")) {
            return new v1_13_R1();
        }
        if (version.contains("1_14_R1")) {
            return new v1_14_R1();
        }
        if (version.contains("1_15_R1")) {
            return new v1_15_R1();
        }
        if (version.contains("1_16_R1")) {
            return new v1_16_R1();
        }
        if (version.contains("1_17_R1")) {
            return new v1_17_R1();
        }
        return new v1_18_R1();

    }

}
