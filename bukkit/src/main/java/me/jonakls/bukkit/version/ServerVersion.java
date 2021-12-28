package me.jonakls.bukkit.version;

import me.jonakls.api.PacketModel;
import me.jonakls.packets.v1_10_R1;
import me.jonakls.packets.v1_11_R1;
import me.jonakls.packets.v1_13_R1;
import me.jonakls.packets.v1_14_R1;
import me.jonakls.packets.v1_15_R1;
import me.jonakls.packets.v1_16_R1;
import me.jonakls.packets.v1_17_R1;
import me.jonakls.packets.v1_8_R3;
import me.jonakls.packets.v1_9_R2;
import me.jonakls.packets.v1_12_R1;
import org.bukkit.Bukkit;

import java.util.HashMap;
import java.util.Map;

public class ServerVersion {

    private final Map<String, PacketModel> packetModelMap = new HashMap<>();

    public ServerVersion(){
        startVersion("1.8", new v1_8_R3())
                .startVersion("1.9", new v1_9_R2())
                .startVersion("1.10", new v1_10_R1())
                .startVersion("1.11", new v1_11_R1())
                .startVersion("1.12", new v1_12_R1())
                .startVersion("1.13", new v1_13_R1())
                .startVersion("1.14", new v1_14_R1())
                .startVersion("1.15", new v1_15_R1())
                .startVersion("1.16", new v1_16_R1())
                .startVersion("1.17", new v1_17_R1());

    }

    public PacketModel getModelVersion() {

        String version = Bukkit.getServer().getClass().getName();
        String versionName = version.split("\\.")[3].substring(0, version.split("\\.")[3].indexOf("_", 3));

        return packetModelMap.get(versionName);

    }

    public ServerVersion startVersion(String version, PacketModel packetModel){
        packetModelMap.put(version, packetModel);
        return this;
    }

}
