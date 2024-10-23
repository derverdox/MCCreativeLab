package de.verdox.mccreativelab.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.function.Function;

public interface CommandSuggestion<T> {
    Collection<T> suggest(CommandSender commandSender);

    String convertToSuggestion(T data);

    abstract class AbstractSuggestion<T> implements CommandSuggestion<T> {
        private final Function<CommandSender, Collection<T>> provider;

        public AbstractSuggestion(Function<CommandSender, Collection<T>> provider) {
            this.provider = provider;
        }

        @Override
        public Collection<T> suggest(CommandSender commandSender) {
            return provider.apply(commandSender);
        }
    }

    abstract class OnlinePlayer extends AbstractSuggestion<Player> {
        public OnlinePlayer(Function<CommandSender, Collection<Player>> provider) {
            super(provider);
        }

        @Override
        public String convertToSuggestion(Player data) {
            return data.getName();
        }
    }
}
