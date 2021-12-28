## Nightmare text
This is a simple lib that help to create, titles, actionbars, hovers and click actions chat components.
# Setup
```java
public final class TestingPlugin extends JavaPlguin {
    
    private NightmareText nightmareText;

    @Override
    public void onEnable() {
        nightmareText = new NightmareText();
    }

    public PacketModel getModelText() {
        return nightmareText.getPacketModel();
    }
}
```

# Create Title
```java
public class PlayerJoinListener implements Listener {
    private final TestingPlugin plugin;

    public PlayerJoinListener(TestingPlugin plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    private void onJoinServer(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        TitleModel titleModel = new TitleModel(
                "Test Title",
                "Test subtitle text",
                2,
                5,
                2
        );
        plugin.getModelText().sendTitle(player, titleModel);
    }
}
```

# Create actionbar

```java
public class PlayerJoinListener implements Listener {
    private final TestingPlugin plugin;

    public PlayerJoinListener(TestingPlugin plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    private void onJoinServer(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        ActionBarModel actionBarModel = new ActionBarModel("Actionbar test text");
        plugin.getModelText().sendActionBar(player, actionBarModel);
    }
}
```