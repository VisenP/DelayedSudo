package games.visen.delayedsudo;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

import java.util.LinkedList;

public class Main extends JavaPlugin {

    private static Main instance;

    private static final LinkedList<BukkitTask> commands = new LinkedList<>();

    @Override
    public void onEnable() {
        instance = this;
    }

    public Main getInstance() {
        return instance;
    }

    public static LinkedList<BukkitTask> getCommands() {
        return commands;
    }
}
