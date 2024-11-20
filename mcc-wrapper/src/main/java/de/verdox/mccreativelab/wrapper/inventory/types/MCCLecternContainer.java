package de.verdox.mccreativelab.wrapper.inventory.types;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuTypes;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.jetbrains.annotations.Nullable;

public interface MCCLecternContainer extends MCCContainer<MCCBlockContainerSource> {

    /**
     * Gets the lectern's held book.
     *
     * @return book set in the lectern
     */
    @Nullable
    default MCCItemStack getBook() {
        return getItem(0);
    }

    /**
     * Sets the lectern's held book.
     *
     * @param book the new book
     */
    default void setBook(@Nullable MCCItemStack book) {
        setItem(0, book);
    }

    /**
     * Gets the page that the LecternView is on.
     *
     * @return The page the book is on
     */
    int getPage();

    /**
     * Sets the page of the lectern book.
     *
     * @param page the lectern book page
     */
    void setPage(final int page);

    @Override
    default MCCMenuType getType() {
        return MCCMenuTypes.LECTERN;
    }

    @Override
    default boolean canBeOpened() {
        return true;
    }
}
