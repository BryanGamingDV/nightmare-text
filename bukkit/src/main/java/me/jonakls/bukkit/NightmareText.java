package me.jonakls.bukkit;

import me.jonakls.api.PacketModel;
import me.jonakls.bukkit.version.ServerVersion;

public class NightmareText {

    private final PacketModel packetModel;

    public NightmareText() {
        ServerVersion version = new ServerVersion();
        this.packetModel = version.getModelVersion();

    }

    public PacketModel getPacketModel() {
        return packetModel;
    }
}