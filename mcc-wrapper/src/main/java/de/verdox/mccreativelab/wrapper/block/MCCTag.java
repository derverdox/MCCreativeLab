package de.verdox.mccreativelab.wrapper.block;

import de.verdox.mccreativelab.wrapper.MCCItemType;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public interface MCCTag<T extends MCCWrapped> {

    static MCCTag<MCCBlockData> ofBlocks(Key key, MCCBlockData... tags) {
        return new BlockTags(key, Set.of(tags));
    }

    static MCCTag<MCCItemType> ofItems(Key key, MCCItemType... tags) {
        return new ItemTags(key, Set.of(tags));
    }

    Set<T> getValues();

    boolean isTagged(T value);

    class BlockTags extends CustomTag<MCCBlockData> {
        protected BlockTags(Key namespacedKey, Set<MCCBlockData> handle) {
            super(namespacedKey, handle);
        }
    }

    class ItemTags extends CustomTag<MCCItemType> {

        protected ItemTags(Key namespacedKey, Set<MCCItemType> handle) {
            super(namespacedKey, handle);
        }
    }

    class CustomTag<T extends MCCWrapped> extends MCCWrapped.Impl<Set<T>> implements MCCTag<T> {
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
    }

    class Builder<T extends MCCWrapped> {
        private final Key key;

        public static <T extends MCCWrapped> Builder<T> create(Key key, Class<? extends T> type) {
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
