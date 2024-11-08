package de.verdox.mccreativelab.wrapper.block;

import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Tags are defined via data packs and are used to group elements of the same type together
 *
 * @param <T> the tag type
 */
public interface MCCTag<T extends MCCKeyedWrapper> {

    /**
     * Creates a new tag of blocks.
     * This does not add the tag to the native minecraft registries
     *
     * @param key  the key for this tag
     * @param tags the blocks
     * @return the new tag
     */
    static MCCTag<MCCBlockState> ofBlocks(Key key, MCCBlockState... tags) {
        return new BlockTags(key, Set.of(tags));
    }

    /**
     * Creates a new tag of item types
     * This does not add the tag to the native minecraft registries
     *
     * @param key  the key for this tag
     * @param tags the item types
     * @return the new tag
     */
    static MCCTag<MCCItemType> ofItems(Key key, MCCItemType... tags) {
        return new ItemTags(key, Set.of(tags));
    }

    /**
     * Returns all values this tag contains
     *
     * @return a set of values
     */
    Set<T> getValues();

    /**
     * Returns whether a value is contained in a tag.
     *
     * @param value the value
     * @return true if the value is contained
     */
    boolean isTagged(T value);

    class BlockTags extends CustomTag<MCCBlockState> {
        protected BlockTags(Key namespacedKey, Set<MCCBlockState> handle) {
            super(namespacedKey, handle);
        }
    }

    class ItemTags extends CustomTag<MCCItemType> {

        protected ItemTags(Key namespacedKey, Set<MCCItemType> handle) {
            super(namespacedKey, handle);
        }
    }

    class CustomTag<T extends MCCKeyedWrapper> extends MCCKeyedWrapper.Impl<Set<T>> implements MCCTag<T> {
        private final Key key;

        protected CustomTag(Key key, Set<T> handle) {
            super(handle);
            this.key = key;
        }

        @Override
        public Set<T> getValues() {
            return Set.copyOf(getHandle());
        }

        @Override
        public boolean isTagged(T value) {
            return getHandle().contains(value);
        }

        @Override
        public @NotNull Key key() {
            return key;
        }

        @Override
        public boolean isVanilla() {
            return false;
        }
    }

    class Builder<T extends MCCKeyedWrapper> {
        private final Key key;

        public static <T extends MCCKeyedWrapper> Builder<T> create(Key key, Class<? extends T> type) {
            return new Builder<T>(key);
        }

        private final Set<T> values = new HashSet<>();

        private Builder(Key key) {
            this.key = key;
        }

        public Builder<T> with(T... values) {
            this.values.addAll(Arrays.asList(values));
            return this;
        }

        public Builder<T> with(MCCTag<T> tag) {
            this.values.addAll(tag.getValues());
            return this;
        }

        public MCCTag<T> build() {
            return new CustomTag<>(key, values);
        }
    }

}
