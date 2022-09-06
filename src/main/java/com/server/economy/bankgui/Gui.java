package com.server.economy.bankgui;

import com.server.economy.Economy;
import com.server.economy.util.ColorCode;
import dev.simplix.cirrus.common.business.PlayerWrapper;
import dev.simplix.cirrus.common.configuration.MenuConfiguration;
import dev.simplix.cirrus.common.effects.RGBColorChangeAnimation;
import dev.simplix.cirrus.common.item.CirrusItem;
import dev.simplix.cirrus.common.menu.AbstractConfigurableMenu;
import dev.simplix.cirrus.common.model.CallResult;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.Inventory;

import java.awt.*;
import java.util.Locale;


public class Gui extends AbstractConfigurableMenu{

    private Inventory inv;
    ColorCode colorCodes = new ColorCode();

    public Gui(PlayerWrapper player, MenuConfiguration configuration) {
        super(player, configuration, Locale.ENGLISH);
        registerActionHandler("tnt", click -> {
            topContainer().itemMap().remove(click.slot());
            title("Hello, {viewer}");
            build();
            player().sendMessage("It simply works :)");
            return CallResult.DENY_GRABBING;
        });

        set(configuration.businessItems().get("test"));

        set(CirrusItem.animated(RGBColorChangeAnimation.fat("test", Color.green, Color.red)));

        set(CirrusItem
                .animated(RGBColorChangeAnimation.fat("test", Color.green, Color.red))
                .slot(1, 2, 3)
                .glow()
        );
    }

}
