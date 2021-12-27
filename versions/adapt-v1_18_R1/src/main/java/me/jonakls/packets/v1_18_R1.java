package me.jonakls.packets;

import me.jonakls.api.PacketModel;
import me.jonakls.api.components.ActionBarModel;
import me.jonakls.api.components.TitleModel;
import net.minecraft.network.chat.IChatBaseComponent;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundSetActionBarTextPacket;
import net.minecraft.network.protocol.game.ClientboundSetSubtitleTextPacket;
import net.minecraft.network.protocol.game.ClientboundSetTitleTextPacket;
import net.minecraft.network.protocol.game.ClientboundSetTitlesAnimationPacket;
import org.bukkit.craftbukkit.v1_18_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class v1_18_R1 implements PacketModel {

    @Override
    public void sendTitle(Player player, TitleModel titleModel) {


        ClientboundSetTitleTextPacket titlePacket = new ClientboundSetTitleTextPacket(
                IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + titleModel.getTitle() + "\"}")
        );

        ClientboundSetSubtitleTextPacket subTitlePacket = new ClientboundSetSubtitleTextPacket(
                IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + titleModel.getSubTitle() + "\"}")
        );

        ClientboundSetTitlesAnimationPacket titlesAnimationPacket = new ClientboundSetTitlesAnimationPacket(
                titleModel.getFadeIn(), titleModel.getStay(), titleModel.getFadeOut()
        );

        sendPacket(player, titlePacket);
        sendPacket(player, subTitlePacket);
        sendPacket(player, titlesAnimationPacket);

    }

    @Override
    public void sendActionBar(Player player, ActionBarModel actionBarModel) {
        ClientboundSetActionBarTextPacket actionBarPacket = new ClientboundSetActionBarTextPacket(
                IChatBaseComponent.ChatSerializer.a("{\"text\":\"" + actionBarModel.getActionBar() + "\"}")
        );

        sendPacket(player, actionBarPacket);
    }

    @Override
    public void sendPacket(Player player, Object packet) {
        ((CraftPlayer) player).getHandle().b.a((Packet<?>) packet);
    }
}
