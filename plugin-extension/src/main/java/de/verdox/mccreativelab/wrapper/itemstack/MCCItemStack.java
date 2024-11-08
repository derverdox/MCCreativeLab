package de.verdox.mccreativelab.wrapper.itemstack;

import de.verdox.mccreativelab.wrapper.MCCWrapped;

public interface MCCItemStack extends MCCWrapped {
    int amount();
    MCCItemStack copy();
}
