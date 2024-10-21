package de.verdox.mccreativelab.wrapper.block;

import com.google.common.collect.ImmutableSet;
import de.verdox.mccreativelab.wrapper.MCCItemType;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Tag;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public interface MCCTag<T extends MCCWrapped> {
    static MCCTag<MCCBlockData> ofBlocks(Tag<Material> materialTag) {
        return new BlockTags(materialTag);
    }

    static MCCTag<MCCItemType> ofItems(Tag<Material> materialTag) {
        return new ItemTags(materialTag);
    }

    static MCCTag<MCCBlockData> ofBlocks(NamespacedKey key, MCCBlockData... tags) {
        return new BlockTags(key, Set.of(tags));
    }

    static MCCTag<MCCItemType> ofItems(NamespacedKey key, MCCItemType... tags) {
        return new ItemTags(key, Set.of(tags));
    }

    Set<T> getValues();

    boolean isTagged(T value);

    class BlockTags extends CustomTag<MCCBlockData> {
        protected BlockTags(NamespacedKey namespacedKey, Set<MCCBlockData> handle) {
            super(namespacedKey, handle);
        }

        protected BlockTags(Tag<Material> vanillaTags) {
            this(vanillaTags.getKey(), vanillaTags.getValues().stream().map(MCCBlockData::wrap).collect(Collectors.toSet()));
        }
    }

    class ItemTags extends CustomTag<MCCItemType> {

        protected ItemTags(NamespacedKey namespacedKey, Set<MCCItemType> handle) {
            super(namespacedKey, handle);
        }

        protected ItemTags(Tag<Material> vanillaTags) {
            this(vanillaTags.getKey(), vanillaTags.getValues().stream().map(MCCItemType::of).collect(Collectors.toSet()));
        }
    }

    class CustomTag<T extends MCCWrapped> extends MCCWrapped.Impl<Set<T>> implements MCCTag<T> {
        private final NamespacedKey namespacedKey;

        protected CustomTag(NamespacedKey namespacedKey, Set<T> handle) {
            super(handle);
            this.namespacedKey = namespacedKey;
        }

        @Override
        public @NotNull NamespacedKey getKey() {
            return namespacedKey;
        }

        @Override
        public Set<T> getValues() {
            return ImmutableSet.copyOf(getHandle());
        }

        @Override
        public boolean isTagged(T value) {
            return getHandle().contains(value);
        }
    }

    class Builder<T extends MCCWrapped> {
        private final NamespacedKey namespacedKey;

        public static <T extends MCCWrapped> Builder<T> create(NamespacedKey namespacedKey, Class<? extends T> type) {
            return new Builder<T>(namespacedKey);
        }

        private final Set<T> values = new HashSet<>();

        private Builder(NamespacedKey namespacedKey) {
            this.namespacedKey = namespacedKey;
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
            return new CustomTag<>(namespacedKey, values);
        }
    }

}
