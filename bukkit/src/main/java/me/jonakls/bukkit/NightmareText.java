package me.jonakls.bukkit;

import me.jonakls.api.PacketModel;
import me.jonakls.bukkit.version.ServerVersion;

public class NightmareText {

    private PacketModel packetModel;

    public void install() {
        ServerVersion version = new ServerVersion();
        packetModel = version.getModelVersion();
    }

    public PacketModel getPacketModel() {
        return packetModel;
    }
}