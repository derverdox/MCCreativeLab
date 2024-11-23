package de.verdox.mccreativelab.wrapper.item;

import de.verdox.mccreativelab.wrapper.item.components.ItemComponentEditor;
import de.verdox.mccreativelab.wrapper.item.components.MCCDataComponentType;
import net.kyori.adventure.text.Component;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Represents a minecraft item stack
 */
public interface MCCItemStack {
    /**
     * Edits an item component
     *
     * @param dataComponentType the component type
     * @param editor            the editor
     * @param <R>               the generic data type
     * @param <T>               the component data type
     * @return the same item but with changed components
     */
    <R, T extends MCCDataComponentType<R>> MCCItemStack edit(T dataComponentType, Consumer<ItemComponentEditor<R, T>> editor);

    /**
     * Edits an item component and returns a result. Can also be used as a getter.
     *
     * @param dataComponentType the component type
     * @param editor            the editor
     * @param <R>               the generic data type
     * @param <T>               the component data type
     */
    <R, T extends MCCDataComponentType<R>> R editAndGet(T dataComponentType, Function<ItemComponentEditor<R, T>, R> editor);

    /**
     * Edits an item component and returns a result. Can also be used as a getter.
     *
     * @param dataComponentType the component type
     * @param <R>               the generic data type
     * @param <T>               the component data type
     */
    <R, T extends MCCDataComponentType<R>> R get(T dataComponentType);

    /**
     * Gets the amount of this item stack.
     *
     * @return the amount
     */
    int getAmount();

    /**
     * Sets the amount of this item stack
     *
     * @param amount the amount
     */
    void setAmount(int amount);

    /**
     * Checks whether the two item stacks are similar but does not compare amounts
     *
     * @param mccItemStack the other item stack
     * @return true if they are similar
     */
    default boolean isSimilar(MCCItemStack mccItemStack) {
        var copy1 = this.withAmount(1);
        var copy2 = mccItemStack.withAmount(1);

        return copy1.equals(copy2);
    }

    /**
     * Returns a copy of this item stack but with the provided amount
     *
     * @param amount
     * @return
     */
    MCCItemStack withAmount(int amount);

    /**
     * Returns the name of the item
     *
     * @return the name
     */
    Component name();

    /**
     * Sets the name of the item
     *
     * @param name the name
     */
    void name(Component name);

    /**
     * Returns the custom name of the item
     *
     * @return the name
     */
    Component customName();

    /**
     * Sets the custom name of the item
     *
     * @param name the name
     */
    void customName(Component name);

    /**
     * Returns the type of the item
     *
     * @return the type
     */
    MCCItemType getType();

    /**
     * Copies the item
     *
     * @return a copy of the item
     */
    MCCItemStack copy();

    boolean isEmpty();
}
