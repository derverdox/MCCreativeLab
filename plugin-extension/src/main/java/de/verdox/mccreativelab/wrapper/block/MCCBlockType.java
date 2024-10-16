package de.verdox.mccreativelab.wrapper.block;

import de.verdox.mccreativelab.MCCUtil;
import de.verdox.mccreativelab.MCCreativeLabExtension;
import de.verdox.mccreativelab.serialization.NBTSerializer;
import de.verdox.mccreativelab.util.nbt.NBTContainer;
import de.verdox.mccreativelab.world.block.FakeBlock;
import de.verdox.mccreativelab.world.block.FakeBlockStorage;
import de.verdox.mccreativelab.wrapper.MCCBlockSoundGroup;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public interface MCCBlockType extends MCCWrapped {

    void setBlock(Location location);

    List<MCCBlockData> getAllBlockStates();

    MCCBlockSoundGroup getSoundGroup();

    static MCCBlockType getFromBlock(Block block) {
        FakeBlock fakeBlock = FakeBlockStorage.getFakeBlock(block.getLocation(), false);
        if (fakeBlock != null)
            return MCCBlockType.wrap(fakeBlock);
        else
            return MCCBlockType.wrap(block.getType());
    }

    static MCCBlockType wrap(Material blockMaterial) {
        assert blockMaterial.isBlock();
        return new Vanilla(blockMaterial);
    }

    static MCCBlockType wrap(de.verdox.mccreativelab.world.block.FakeBlock fakeBlock) {
        return new FakeBlockType(fakeBlock);
    }

    class Vanilla extends MCCWrapped.Impl<Material> implements MCCBlockType {

        public static final NBTSerializer<Vanilla> SERIALIZER = new NBTSerializer<>() {
            @Override
            public void serialize(Vanilla data, NBTContainer nbtContainer) {
                nbtContainer.set("block_type", data.getHandle());
            }

            @Override
            public Vanilla deserialize(NBTContainer nbtContainer) {
                if (nbtContainer.has("block_type"))
                    return new Vanilla(Material.getMaterial(nbtContainer.getString("block_type")));
                return null;
            }
        };

        private final BlockData blockData;

        protected Vanilla(Material handle) {
            super(handle);
            this.blockData = Bukkit.createBlockData(getHandle());
        }

        @Override
        public @NotNull NamespacedKey getKey() {
            return getHandle().getKey();
        }

        @Override
        public void setBlock(Location location) {
            location.getBlock().setType(getHandle());
        }

        @Override
        public List<MCCBlockData> getAllBlockStates() {
            if (MCCreativeLabExtension.isServerSoftware())
                return MCCUtil.getInstance().streamAllBlockDataVariants(getHandle()).map(MCCBlockData::wrap).toList();
            return List.of();
        }

        @Override
        public MCCBlockSoundGroup getSoundGroup() {
            return MCCBlockSoundGroup.of(blockData.getSoundGroup());
        }

        @Override
        public boolean matches(MCCWrapped mccWrapped) {
            if (mccWrapped instanceof Vanilla vanilla)
                return vanilla.getHandle().equals(getHandle());
            return false;
        }
    }

    class FakeBlockType extends MCCWrapped.Impl<de.verdox.mccreativelab.world.block.FakeBlock> implements MCCBlockType {

        public static final NBTSerializer<FakeBlockType> SERIALIZER = new NBTSerializer<>() {
            @Override
            public void serialize(FakeBlockType data, NBTContainer nbtContainer) {
                nbtContainer.set("block_type", data.getHandle().getKey().asString());
            }

            @Override
            public FakeBlockType deserialize(NBTContainer nbtContainer) {
                if (!nbtContainer.has("block_type"))
                    return null;
                NamespacedKey namespacedKey = NamespacedKey.fromString(nbtContainer.getString("block_type"));
                return new FakeBlockType(MCCreativeLabExtension.getFakeBlockRegistry().get(namespacedKey));
            }
        };

        protected FakeBlockType(de.verdox.mccreativelab.world.block.FakeBlock handle) {
            super(handle);
        }

        @Override
        public @NotNull NamespacedKey getKey() {
            return getHandle().getKey();
        }

        @Override
        public void setBlock(Location location) {
            FakeBlockStorage.setFakeBlock(location, getHandle(), false);
        }

        @Override
        public List<MCCBlockData> getAllBlockStates() {
            return Arrays.stream(getHandle().getFakeBlockStates()).map(MCCBlockData::wrap).toList();
        }

        @Override
        public MCCBlockSoundGroup getSoundGroup() {
            return MCCBlockSoundGroup.of(getHandle().getDefaultBlockState().getFakeBlockSoundGroup());
        }

        @Override
        public boolean matches(MCCWrapped mccWrapped) {
            if (mccWrapped instanceof FakeBlockType fakeBlock)
                return fakeBlock.getHandle().equals(getHandle());
            return false;
        }
    }

}
