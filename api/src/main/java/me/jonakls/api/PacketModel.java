package me.jonakls.api;

import me.jonakls.api.components.ActionBarModel;
import me.jonakls.api.components.TitleModel;
import org.bukkit.entity.Player;

public interface PacketModel {
    
    void sendTitle(Player player, TitleModel titleModel);
    void sendActionBar(Player player, ActionBarModel actionBarModel);
    void sendPacket(Player player, Object packet);

}
