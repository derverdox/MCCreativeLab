package de.verdox.mccreativelab.wrapper;

/**
 * Base class for all wrappers in MCCreativeLab
 */
public interface MCCWrapped {
    /**
     * Returns true when the wrapped element is from vanilla minecraft
     * @return true if the element is vanilla
     */
    default boolean isVanilla(){
        return true;
    }

    /**
     * Checks if the two wrappers wrap the same element
     * @param mccWrapped the other wrapped element
     * @return true if they wrap the same element
     */
    default boolean matches(MCCWrapped mccWrapped) {
        return equals(mccWrapped);
    }
}
