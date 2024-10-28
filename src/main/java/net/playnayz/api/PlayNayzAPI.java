package net.playnayz.api;

import org.bukkit.plugin.java.JavaPlugin;

public class PlayNayzAPI extends JavaPlugin {
    private static PlayNayzAPI instance;

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("PlayNayzAPI erfolgreich aktiviert.");
    }

    public static PlayNayzAPI getInstance() {
        return instance;
    }
}
