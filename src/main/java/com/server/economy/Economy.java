package com.server.economy;

import com.server.economy.bankgui.BankCommand;
import com.server.economy.bankgui.Gui;
import com.server.economy.bankgui.TestCommandExecutor;
import dev.simplix.cirrus.spigot.CirrusSpigot;
import org.bukkit.plugin.java.JavaPlugin;

public final class Economy extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        CirrusSpigot.init(this);
        getCommand("test").setExecutor(new TestCommandExecutor());
    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
