package de.verdox.mccreativelab.generator.resourcepack.types.gui;

import de.verdox.mccreativelab.generator.resourcepack.CustomResourcePack;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ClickableItem {
    private final MCCItemStack stack;
    private final BiConsumer<GUIClickAction, ActiveGUI> onClick;
    private final Builder builder;

    protected ClickableItem(MCCItemStack stack, BiConsumer<GUIClickAction, ActiveGUI> onClick, Builder builder) {
        this.stack = stack;
        this.onClick = onClick;
        this.builder = builder;
    }

    public Builder getBuilder() {
        return builder;
    }

    public BiConsumer<GUIClickAction, ActiveGUI> getOnClick() {
        return onClick;
    }

    public MCCItemStack getStack() {
        return stack;
    }

    public static class Builder {
        private BiConsumer<GUIClickAction, ActiveGUI> onClick = (inventoryClickEvent, activeGUI) -> {
        };
        private MCCItemStack item = CustomResourcePack.EMPTY_ITEM.createItem();
        public boolean popGUIStack = false;
        public boolean clearGUIStackAndClose = false;
        private Consumer<MCCItemStack> itemSetup;

        public Builder(MCCItemStack stack) {
            this.item = stack.copy();
        }

        public Builder(MCCItemType material) {
            this.item = material.createItem();
        }

        public Builder() {
        }

        public Builder withClick(BiConsumer<GUIClickAction, ActiveGUI> onClick) {
            this.onClick = onClick;
            return this;
        }

        public Builder edit(Consumer<MCCItemStack> itemSetup){
            this.itemSetup = itemSetup;
            return this;
        }

        public Builder withItem(MCCItemStack stack) {
            this.item = stack;
            return this;
        }

        public Builder createCopy() {
            var copy = new Builder();
            copy.onClick = this.onClick;
            copy.item = this.item.copy();
            copy.popGUIStack = this.popGUIStack;
            copy.clearGUIStackAndClose = this.clearGUIStackAndClose;
            copy.itemSetup = this.itemSetup;
            return copy;
        }

        public Builder backToLastScreenOnClick() {
            popGUIStack = true;
            return this;
        }

        public Builder openGUI(Supplier<CustomGUIBuilder> supplyGUI){
            return withClick((clickAction, activeGUI) -> {
                CustomGUIBuilder customGUIBuilder = supplyGUI.get();
                customGUIBuilder.asNestedGUI(clickAction.getEntityClicking(), activeGUI, activeGUI::copyTemporaryDataFromGUI);
            });
        }

        public Builder openGUI(CustomGUIBuilder customGUIBuilder){
            return openGUI(() -> customGUIBuilder);
        }

        public Builder closeGUI() {
            clearGUIStackAndClose = true;
            return this;
        }

        MCCItemStack createStack() {
            MCCItemStack stack = this.item.copy();
            if(this.itemSetup != null){
                itemSetup.accept(stack);
            }
            return stack;
        }

        public ClickableItem build() {
            return new ClickableItem(createStack(), onClick, this);
        }
    }

}
