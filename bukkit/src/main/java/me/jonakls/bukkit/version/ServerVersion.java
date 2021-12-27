package me.jonakls.bukkit.version;

import me.jonakls.api.PacketModel;
import me.jonakls.packets.v1_17_R1;
import me.jonakls.packets.v1_8_R3;
import me.jonakls.packets.v1_9_R2;
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
        return new v1_17_R1();

    }

}
