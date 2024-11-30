package de.verdox.mccreativelab.wrapper.entity.player.client;

import net.kyori.adventure.translation.Translatable;
import net.kyori.adventure.util.Index;

public class MCCClientOption<T> {

    public static final MCCClientOption<SkinParts> SKIN_PARTS = new MCCClientOption<>(SkinParts.class);
    public static final MCCClientOption<Boolean> CHAT_COLORS_ENABLED = new MCCClientOption<>(Boolean.class);
    public static final MCCClientOption<ChatVisibility> CHAT_VISIBILITY = new MCCClientOption<>(ChatVisibility.class);
    public static final MCCClientOption<String> LOCALE = new MCCClientOption<>(String.class);
    public static final MCCClientOption<MainHand> MAIN_HAND = new MCCClientOption<>(MainHand.class);
    public static final MCCClientOption<Integer> VIEW_DISTANCE = new MCCClientOption<>(Integer.class);
    public static final MCCClientOption<Boolean> ALLOW_SERVER_LISTINGS = new MCCClientOption<>(Boolean.class);
    public static final MCCClientOption<Boolean> TEXT_FILTERING_ENABLED = new MCCClientOption<>(Boolean.class);

    private final Class<T> type;

    private MCCClientOption(final Class<T> type) {
        this.type = type;
    }

    public Class<T> getType() {
        return this.type;
    }

    public enum ChatVisibility implements Translatable {
        FULL("full"),
        SYSTEM("system"),
        HIDDEN("hidden"),
        UNKNOWN("unknown");

        public static final Index<String, ChatVisibility> NAMES = Index.create(ChatVisibility.class, chatVisibility -> chatVisibility.name);
        private final String name;

        ChatVisibility(final String name) {
            this.name = name;
        }

        @Override
        public String translationKey() {
            if (this == UNKNOWN) {
                throw new UnsupportedOperationException(this.name + " doesn't have a translation key");
            }
            return "options.chat.visibility." + this.name;
        }
    }

    public enum MainHand {
        LEFT,
        RIGHT
    }

    public interface SkinParts {

        boolean hasCapeEnabled();

        boolean hasJacketEnabled();

        boolean hasLeftSleeveEnabled();

        boolean hasRightSleeveEnabled();

        boolean hasLeftPantsEnabled();

        boolean hasRightPantsEnabled();

        boolean hasHatsEnabled();

        int getRaw();
    }

}
