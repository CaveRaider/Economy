package com.server.economy.bankgui;

import dev.simplix.cirrus.common.Cirrus;
import dev.simplix.cirrus.common.business.PlayerWrapper;
import dev.simplix.cirrus.common.converter.Converters;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BankCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            final PlayerWrapper wrapper = Converters.getConverter(Player.class, PlayerWrapper.class).convert(player);
            new Gui(
                    wrapper,
                    Cirrus.configurationFactory().loadFile("plugins/Economy/menu.json")).open();
        }
        return false;
    }
}
