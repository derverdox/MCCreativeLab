package de.verdox.mccreativelab.generator.resourcepack.types.gui;

import de.verdox.mccreativelab.generator.resourcepack.CustomResourcePack;
import de.verdox.mccreativelab.generator.resourcepack.types.lang.LanguageInfo;
import de.verdox.mccreativelab.generator.resourcepack.types.lang.Translatable;
import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.typed.MCCDataComponentTypes;
import net.kyori.adventure.text.Component;
import org.apache.commons.lang3.function.TriFunction;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;

public class GUIUtil {
    private static final Integer MIN_PAGES = 1;

    private static final Translatable LEFT = new Translatable("gui.scroller.left")
        .withAdditionalTranslation(LanguageInfo.GERMAN, "Links")
        .withAdditionalTranslation(LanguageInfo.ENGLISH_US, "Left");

    private static final Translatable RIGHT = new Translatable("gui.scroller.right")
        .withAdditionalTranslation(LanguageInfo.GERMAN, "Rechts")
        .withAdditionalTranslation(LanguageInfo.ENGLISH_US, "Right");
    private static final Translatable CURRENT_PAGE = new Translatable("gui.pagination.current")
        .withAdditionalTranslation(LanguageInfo.GERMAN, "Seite: ")
        .withAdditionalTranslation(LanguageInfo.ENGLISH_US, "Page: ");

    private static final Translatable NEXT_PAGE = new Translatable("gui.pagination.next")
        .withAdditionalTranslation(LanguageInfo.GERMAN, "Nächste Seite")
        .withAdditionalTranslation(LanguageInfo.ENGLISH_US, "Next page");

    private static final Translatable PREVIOUS_PAGE = new Translatable("gui.pagination.previous")
        .withAdditionalTranslation(LanguageInfo.GERMAN, "Vorherige Seite")
        .withAdditionalTranslation(LanguageInfo.ENGLISH_US, "Previous page");

    public static void install(CustomResourcePack customResourcePack) {
        customResourcePack.getLanguageStorage().addTranslation(CURRENT_PAGE);
        customResourcePack.getLanguageStorage().addTranslation(NEXT_PAGE);
        customResourcePack.getLanguageStorage().addTranslation(PREVIOUS_PAGE);
        customResourcePack.getLanguageStorage().addTranslation(LEFT);
        customResourcePack.getLanguageStorage().addTranslation(RIGHT);
    }

    public abstract static class GUIElementProvider<T> {
        protected final TriFunction<ActiveGUI, Integer, T, ClickableItem> itemCreator;
        protected final int[] slotsForElements;
        protected final int amountsPerPage;
        private boolean enabled = true;

        public GUIElementProvider(TriFunction<ActiveGUI, Integer, T, ClickableItem> itemCreator, int... slotsForElements) {
            this.itemCreator = itemCreator;
            this.slotsForElements = slotsForElements;
            this.amountsPerPage = this.slotsForElements.length;
        }

        public final void renderIntoGUI(ActiveGUI activeGUI, Collection<T> elements) {
            if (!enabled)
                return;
            render(activeGUI, elements);
        }

        protected abstract void render(ActiveGUI activeGUI, Collection<T> elements);

        protected void onEnable(ActiveGUI activeGUI, Collection<T> elements) {
        }

        protected void onDisable(ActiveGUI activeGUI) {
        }

        public final void disable(ActiveGUI activeGUI) {
            if (!enabled) return;
            enabled = false;
            for (int slot : slotsForElements)
                activeGUI.removeClickableItem(slot);
            onDisable(activeGUI);
        }

        public final void enable(ActiveGUI activeGUI, Collection<T> elements) {
            this.enabled = true;
            renderIntoGUI(activeGUI, elements);
            if (!this.enabled)
                onEnable(activeGUI, elements);
        }
    }

    public static class HorizontalGUIPagination<T> extends GUIElementProvider<T> {
        private final int lastPageIndex;
        private final int nextPageIndex;
        private final MCCItemStack leftArrow;
        private final MCCItemStack rightArrow;

        public HorizontalGUIPagination(TriFunction<ActiveGUI, Integer, T, ClickableItem> itemCreator, int lastPageIndex, int nextPageIndex, MCCItemStack leftArrow, MCCItemStack rightArrow, int... slotsForElements) {
            super(itemCreator, slotsForElements);
            this.lastPageIndex = lastPageIndex;
            this.nextPageIndex = nextPageIndex;
            this.leftArrow = leftArrow;
            this.rightArrow = rightArrow;
        }

        @Override
        protected void render(ActiveGUI activeGUI, Collection<T> elements) {
            int currentPage = getCurrentPage(activeGUI);

            int counter = 0;
            for (T element : elements.stream().skip((long) (currentPage - 1) * amountsPerPage).limit(amountsPerPage).toList()) {

                int index = slotsForElements[counter];

                activeGUI.addClickableItem(index, itemCreator.apply(activeGUI, counter, element));
                counter++;
            }

            for (int i = counter; i < slotsForElements.length; i++) {
                activeGUI.removeClickableItem(slotsForElements[i]);
            }

            if (hasNextPage(activeGUI, elements))
                activeGUI.addClickableItem(nextPageIndex, createNextPage(activeGUI, elements));
            else
                activeGUI.removeClickableItem(nextPageIndex);
            if (hasPreviousPage(activeGUI, elements))
                activeGUI.addClickableItem(lastPageIndex, createPreviousPage(activeGUI, elements));
            else
                activeGUI.removeClickableItem(lastPageIndex);
        }

        @Override
        protected void onEnable(ActiveGUI activeGUI, Collection<T> elements) {

        }

        @Override
        protected void onDisable(ActiveGUI activeGUI) {
            activeGUI.removeClickableItem(nextPageIndex);
            activeGUI.removeClickableItem(lastPageIndex);
        }

        public boolean hasNextPage(@NotNull ActiveGUI activeGUI, Collection<T> elements) {
            return getCurrentPage(activeGUI) < getMaxPages(activeGUI, elements);
        }

        public boolean hasPreviousPage(@NotNull ActiveGUI activeGUI, Collection<T> elements) {
            return getCurrentPage(activeGUI) > MIN_PAGES;
        }

        private void setCurrentPage(@NotNull ActiveGUI activeGUI, int currentPage) {
            activeGUI.addTemporaryData("pagination_current", currentPage);
        }

        private int getMaxPages(@NotNull ActiveGUI activeGUI, Collection<T> elements) {
            int maxPages = elements.size() / amountsPerPage;
            if (elements.size() % amountsPerPage != 0)
                maxPages += 1;
            return maxPages;
        }

        private int getCurrentPage(@NotNull ActiveGUI activeGUI) {
            return activeGUI.getTemporaryDataOrDefault("pagination_current", Integer.class, MIN_PAGES);
        }

        private ClickableItem createNextPage(ActiveGUI activeGUI, Collection<T> elements) {
            MCCItemStack arrowItem = leftArrow.copy();
            arrowItem.components().edit(MCCDataComponentTypes.ITEM_NAME.get(), editor -> {
                    int currentPage = getCurrentPage(activeGUI);
                    editor.set(CURRENT_PAGE.asTranslatableComponent().append(Component.text(currentPage)));
                }).
                edit(MCCDataComponentTypes.LORE.get(), editor -> editor.with(mccItemLore -> mccItemLore.withLines(List.of(NEXT_PAGE.asTranslatableComponent()))));

            return new ClickableItem.Builder()
                .withItem(arrowItem)
                .withClick((inventoryClickEvent, activeGUI1) -> {
                    int currentPage = getCurrentPage(activeGUI1);
                    int maxPages = getMaxPages(activeGUI, elements);
                    if (!hasNextPage(activeGUI, elements))
                        return;
                    int nextPage = Math.min(maxPages, currentPage + 1);
                    setCurrentPage(activeGUI1, nextPage);
                })
                .build();
        }

        private ClickableItem createPreviousPage(ActiveGUI activeGUI, Collection<T> elements) {

            MCCItemStack arrowItem = rightArrow.copy();
            arrowItem.components().edit(MCCDataComponentTypes.ITEM_NAME.get(), editor -> {
                    int currentPage = getCurrentPage(activeGUI);
                    editor.set(CURRENT_PAGE.asTranslatableComponent().append(Component.text(currentPage)));
                })
                .edit(MCCDataComponentTypes.LORE.get(), editor -> editor.with(mccItemLore -> mccItemLore.withLines(List.of(PREVIOUS_PAGE.asTranslatableComponent()))));

            return new ClickableItem.Builder()
                .withItem(arrowItem)
                .withClick((inventoryClickEvent, activeGUI1) -> {
                    int currentPage = getCurrentPage(activeGUI1);
                    if (!hasPreviousPage(activeGUI, elements))
                        return;
                    int nextPage = Math.max(MIN_PAGES, currentPage - 1);
                    setCurrentPage(activeGUI1, nextPage);
                })
                .build();
        }
    }

    /**
     * Used to display elements in a custom gui with 2 scroll buttons that scroll one by one through the element list
     *
     * @param <T>
     */
    public static class HorizontalGUIScroller<T> extends GUIElementProvider<T> {
        private final int scrollToLeftIndex;
        private final int scrollToRightIndex;
        private final int selectionIndex;
        private final MCCItemStack leftArrow;
        private final MCCItemStack rightArrow;

        public HorizontalGUIScroller(TriFunction<ActiveGUI, Integer, T, ClickableItem> itemCreator, int scrollToLeftIndex, int scrollToRightIndex, int selectionIndex, MCCItemStack leftArrow, MCCItemStack rightArrow, int... slotsForElements) {
            super(itemCreator, slotsForElements);
            this.scrollToLeftIndex = scrollToLeftIndex;
            this.scrollToRightIndex = scrollToRightIndex;
            this.selectionIndex = selectionIndex;
            this.leftArrow = leftArrow;
            this.rightArrow = rightArrow;
        }

        @Override
        protected void render(ActiveGUI activeGUI, Collection<T> elements) {
            int skipped = getSkipIndex(activeGUI);

            int index = 0;
            for (T element : elements.stream().skip(skipped).limit(amountsPerPage).toList()) {
                int indexForItem = slotsForElements[index];

                if (selectionIndex == indexForItem)
                    activeGUI.addTemporaryData("selected_item", element);

                ClickableItem clickableItem = itemCreator.apply(activeGUI, index, element);
                activeGUI.addClickableItem(indexForItem, clickableItem);
                index++;
            }

            for (int i = index; i < slotsForElements.length; i++) {
                activeGUI.removeClickableItem(slotsForElements[i]);
            }

            if (canScrollLeft(activeGUI, elements))
                activeGUI.addClickableItem(scrollToLeftIndex, createScrollLeftButton(elements));
            else
                activeGUI.removeClickableItem(scrollToLeftIndex);
            if (canScrollRight(activeGUI, elements))
                activeGUI.addClickableItem(scrollToRightIndex, createScrollRightButton(elements));
            else
                activeGUI.removeClickableItem(scrollToRightIndex);
        }

        @Override
        protected void onEnable(ActiveGUI activeGUI, Collection<T> elements) {

        }

        @Override
        protected void onDisable(ActiveGUI activeGUI) {
            activeGUI.removeClickableItem(scrollToLeftIndex);
            activeGUI.removeClickableItem(scrollToRightIndex);
        }

        public T getSelectedElement(ActiveGUI activeGUI) {
            return (T) activeGUI.getTemporaryDataOrDefault("selected_item", Object.class, null);
        }

        private int getSkipIndex(ActiveGUI activeGUI) {
            return activeGUI.getTemporaryDataOrDefault("skipIndex", Integer.class, 0);
        }

        private void setSkipIndex(ActiveGUI activeGUI, int skipIndex) {
            if (skipIndex < 0)
                skipIndex = 0;
            activeGUI.addTemporaryData("skipIndex", skipIndex);
        }

        private boolean canScrollLeft(ActiveGUI activeGUI, Collection<T> elements) {
            return getSkipIndex(activeGUI) > 0;
        }

        private boolean canScrollRight(ActiveGUI activeGUI, Collection<T> elements) {
            return getSkipIndex(activeGUI) < elements.size() - 1;
        }

        private ClickableItem createScrollLeftButton(Collection<T> elements) {
            MCCItemStack arrow = leftArrow.copy();
            arrow.components().edit(MCCDataComponentTypes.ITEM_NAME.get(), editor -> editor.set(LEFT.asTranslatableComponent()));

            return new ClickableItem.Builder()
                .withItem(arrow)
                .withClick((inventoryClickEvent, activeGUI1) -> {
                    setSkipIndex(activeGUI1, getSkipIndex(activeGUI1) - 1);
                    renderIntoGUI(activeGUI1, elements);
                })
                .build();
        }

        private ClickableItem createScrollRightButton(Collection<T> elements) {
            MCCItemStack arrow = rightArrow.copy();
            arrow.components().edit(MCCDataComponentTypes.ITEM_NAME.get(), editor -> editor.set(RIGHT.asTranslatableComponent()));
            return new ClickableItem.Builder()
                .withItem(arrow)
                .withClick((inventoryClickEvent, activeGUI1) -> {
                    setSkipIndex(activeGUI1, getSkipIndex(activeGUI1) + 1);
                    renderIntoGUI(activeGUI1, elements);
                })
                .build();
        }
    }
}
