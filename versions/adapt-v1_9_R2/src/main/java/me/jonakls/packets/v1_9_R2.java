package me.jonakls.packets;

import me.jonakls.api.PacketModel;
import me.jonakls.api.components.ActionBarModel;
import me.jonakls.api.components.TitleModel;
import net.minecraft.server.v1_9_R2.*;
import org.bukkit.craftbukkit.v1_9_R2.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class v1_9_R2 implements PacketModel {

    @Override
    public void sendTitle(Player player, TitleModel titleModel) {
        PacketPlayOutTitle titlePacket = new PacketPlayOutTitle(
                PacketPlayOutTitle.EnumTitleAction.TITLE,
                new ChatMessage(titleModel.getTitle()),
                titleModel.getFadeIn(),
                titleModel.getStay(),
                titleModel.getFadeOut()
        );

        PacketPlayOutTitle subTitlePacket = new PacketPlayOutTitle(
                PacketPlayOutTitle.EnumTitleAction.SUBTITLE,
                new ChatMessage(titleModel.getSubTitle()),
                titleModel.getFadeIn(),
                titleModel.getStay(),
                titleModel.getFadeOut()
        );

        sendPacket(player, titlePacket);
        sendPacket(player, subTitlePacket);

    }

    @Override
    public void sendActionBar(Player player, ActionBarModel actionBarModel) {
        PacketPlayOutChat actionBarPacket = new PacketPlayOutChat(
                IChatBaseComponent.ChatSerializer.a("{\"text\":\"" + actionBarModel.getActionBar() + "\"}"),
                (byte) 2
        );

        sendPacket(player, actionBarPacket);
    }

    @Override
    public void sendPacket(Player player, Object packet) {
        ((CraftPlayer) player).getHandle().playerConnection.sendPacket((Packet) packet);
    }
}
