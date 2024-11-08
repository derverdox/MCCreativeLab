package de.verdox.mccreativelab.wrapper.platform.adapter;

import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;

/**
 * Used to convert any object from platform specific objects to {@link MCCKeyedWrapper} objects.
 * <p>
 * Before conversion these methods are called to check if the elements are convertible by this adapter.
 * This is especially useful to implement custom types of certain wrappers like {@link de.verdox.mccreativelab.wrapper.item.MCCItemType}.
 * If you want to create your own implementation you simply create a new {@link WrapperAdapter} and register it to the {@link MCCAdapter} of {@link de.verdox.mccreativelab.wrapper.item.MCCItemType}.
 *
 * @param <F> The platform type
 * @param <T> the api type
 */
public interface VariantAdapter<F, T> extends WrapperAdapter<F, T> {
    /**
     * Checks if the adapter is the right one for conversion
     *
     * @param platformElement the platform element
     * @return true if this adapter is the right one to use
     */
    boolean isRightAdapterForPlatformElement(F platformElement);

    /**
     * Checks if the adapter is the right one for conversion
     *
     * @param wrappedElement the platform element
     * @return true if this adapter is the right one to use
     */
    boolean isRightAdapterForApiElement(T wrappedElement);
}
