package de.verdox.mccreativelab.features.gui;

import de.verdox.mccreativelab.generator.resourcepack.types.gui.ClickableItem;
import de.verdox.mccreativelab.generator.resourcepack.types.gui.CustomGUIBuilder;
import de.verdox.mccreativelab.generator.resourcepack.types.lang.LanguageInfo;
import de.verdox.mccreativelab.generator.resourcepack.types.lang.Translation;
import de.verdox.mccreativelab.generator.resourcepack.types.rendered.RenderedElementBehavior;
import de.verdox.mccreativelab.generator.resourcepack.types.rendered.util.ScreenPosition;
import de.verdox.mccreativelab.util.io.StringAlign;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.typed.MCCDataComponentTypes;
import de.verdox.mccreativelab.wrapper.typed.MCCItems;
import net.kyori.adventure.text.Component;
import org.bukkit.NamespacedKey;

import java.util.function.Consumer;

public class YesNoGui extends CustomGUIBuilder {
    private static YesNoGui INSTANCE;

    public static final Translation YES = new Translation(LanguageInfo.ENGLISH_US, "yes", "Yes");
    public static final Translation NO = new Translation(LanguageInfo.ENGLISH_US, "no", "No");

    public YesNoGui() {
        super(new NamespacedKey("oneblock", "yes_no_gui"), 5);
        INSTANCE = this;

        withMultiLineText("question", 10, 30, 8, StringAlign.Alignment.CENTER, new ScreenPosition(50, 50, 0, 80, 1), 1f,
            RenderedElementBehavior.createWhileOpen((activeGUI, renderedGroupMultiLineText) -> {

                String question = activeGUI.getTemporaryDataOrDefault("question", String.class, "This is an example question to show how the YesNoGui looks like!");
                if(question == null || question.isEmpty()) {
                    renderedGroupMultiLineText.clearText();
                    return;
                }
                renderedGroupMultiLineText.setRawText(StringAlign.formatStringToLines(question, 30, StringAlign.Alignment.CENTER));
            }));

        new ClickableItem.Builder(MCCItems.LIME_DYE.get()).edit(stack -> stack.edit(MCCDataComponentTypes.ITEM_NAME.get(), editor -> editor.set(Component.translatable(YES.key()))));
    }


    public static class Builder {
        private String question;
        private final ClickableItem.Builder yesButton = new ClickableItem.Builder(MCCItems.LIME_DYE.get()).edit(stack -> stack.edit(MCCDataComponentTypes.ITEM_NAME.get(), editor -> editor.set(Component.translatable(YES.key()))));
        private final ClickableItem.Builder noButton = new ClickableItem.Builder(MCCItems.RED_DYE.get()).edit(stack -> stack.edit(MCCDataComponentTypes.ITEM_NAME.get(), editor -> editor.set(Component.translatable(NO.key()))));

        public Builder withQuestion(String question) {
            this.question = question;
            return this;
        }

        public Builder withYesButton(Consumer<ClickableItem.Builder> yesButton) {
            yesButton.accept(this.yesButton);
            return this;
        }

        public Builder withNoButton(Consumer<ClickableItem.Builder> noButton) {
            noButton.accept(this.noButton);
            return this;
        }

        public void open(MCCPlayer player) {
            INSTANCE.createMenuForPlayer(player, activeGUI -> {
                activeGUI.addTemporaryData("question", question);

                activeGUI.addClickableItem(29, noButton.build());
                activeGUI.addClickableItem(33, yesButton.build());
            });
        }
    }
}
