package de.verdox.mccreativelab.command;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public interface CommandInput<T> {
    T parse(CommandSender sender, String[] arguments);

    int getArgumentLength();

    class OnlinePlayer implements CommandInput<Player> {
        @Override
        public Player parse(CommandSender sender, String[] arguments) {
            Player player = Bukkit.getPlayer(arguments[0]);
            if (player == null) {
                //TODO: Translatable messages
                return null;
            }
            return Bukkit.getPlayer(arguments[0]);
        }

        @Override
        public int getArgumentLength() {
            return 1;
        }
    }
}
