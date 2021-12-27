package me.jonakls.api;

import me.jonakls.api.components.ActionBarModel;
import me.jonakls.api.components.TitleModel;
import org.bukkit.entity.Player;

public interface PacketModel {

    /**
     * Send title to player according to title created.
     * @param player Player to whom title will be sent
     * @param titleModel Title template containing all attributes to be sent to player
     */
    void sendTitle(Player player, TitleModel titleModel);

    /**
     * Send action bar to player according to action bar created.
     * @param player Player to whom action bar will be sent
     * @param actionBarModel Action bar template containing all attributes to be sent to player
     */
    void sendActionBar(Player player, ActionBarModel actionBarModel);

    /**
     * Send packets to player.
     * @param player Player to whom action bar will be sent.
     * @param packet Packet to be sent to player
     */
    void sendPacket(Player player, Object packet);

}
