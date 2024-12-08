package de.verdox.mccreativelab.wrapper.inventory.types.menu;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCSharedContainerMenu;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.jetbrains.annotations.Nullable;

public interface MCCLecternContainerMenu extends MCCSharedContainerMenu<MCCBlockContainerSource, MCCContainer> {

    /**
     * Gets the lectern's held book.
     *
     * @return book set in the lectern
     */
    @Nullable
    default MCCItemStack getBook() {
        return getContainer().getItem(0);
    }

    /**
     * Sets the lectern's held book.
     *
     * @param book the new book
     */
    default void setBook(@Nullable MCCItemStack book) {
        getContainer().setItem(0, book);
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
}
