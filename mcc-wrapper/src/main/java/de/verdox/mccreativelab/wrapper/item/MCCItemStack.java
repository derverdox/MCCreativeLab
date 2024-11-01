package de.verdox.mccreativelab.wrapper.item;

import de.verdox.mccreativelab.wrapper.item.components.ItemComponentEditor;
import de.verdox.mccreativelab.wrapper.item.components.MCCItemComponentType;

import java.util.function.Consumer;

public interface MCCItemStack {
    <T extends MCCItemComponentType> void edit(Consumer<ItemComponentEditor<T>> editor);
}
