package de.verdox.mccreativelab.world.block.display;

import de.verdox.mccreativelab.world.block.FakeBlock;
import de.verdox.mccreativelab.world.block.display.strategy.SolidFullBlockEntityBasedDisplayStrategy;
import de.verdox.mccreativelab.generator.Asset;
import de.verdox.mccreativelab.generator.resourcepack.CustomResourcePack;
import de.verdox.mccreativelab.generator.resourcepack.types.ItemTextureData;
import de.verdox.mccreativelab.wrapper.block.MCCBlockFace;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.BlockData;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class SolidFullBlockEntityDisplay extends FakeBlockDisplay{
    private static boolean IS_USED = false;
    public static boolean isUsed() {
        return IS_USED;
    }
    private final Map<MCCBlockFace, Asset<CustomResourcePack>> texturesPerBlockFace;
    private final Map<MCCBlockFace, ItemTextureData.ModelType> modelsPerBlockFace;
    private final Map<MCCBlockFace, ItemTextureData> itemTextureDataPerBlockFace = new HashMap<>();
    private final BlockData destroyParticleData;

    private SolidFullBlockEntityDisplay(NamespacedKey namespacedKey, Map<MCCBlockFace, Asset<CustomResourcePack>> texturesPerBlockFace, Map<MCCBlockFace, ItemTextureData.ModelType> modelsPerBlockFace, BlockData destroyParticleData) {
        super(namespacedKey, SolidFullBlockEntityBasedDisplayStrategy.INSTANCE, FakeBlock.FakeBlockHitbox.SOLID_BLOCK);
        this.texturesPerBlockFace = texturesPerBlockFace;
        this.modelsPerBlockFace = modelsPerBlockFace;
        this.destroyParticleData = destroyParticleData;
        IS_USED = true;
    }

    @Override
    public BlockData getDestroyParticleData() {
        return destroyParticleData;
    }

    @Override
    public boolean simulateDiggingParticles() {
        return true;
    }

    @Override
    public void beforeResourceInstallation(CustomResourcePack customPack) throws IOException {
        texturesPerBlockFace.forEach((face, customResourcePackAsset) -> {
            ItemTextureData.ModelType modelType = modelsPerBlockFace.get(face);
            NamespacedKey faceKey = getKeyOfFaceTexture(new NamespacedKey(key().namespace(), "item/fake_block/" + key()), face);
            ItemTextureData itemTextureData = new ItemTextureData(faceKey, getModelMaterial(), drawNewModelID(), customResourcePackAsset, modelType);
            itemTextureDataPerBlockFace.put(face, itemTextureData);
            customPack.register(itemTextureData);
        });
    }

    public Map<MCCBlockFace, ItemTextureData> getItemTextureDataPerBlockFace() {
        return itemTextureDataPerBlockFace;
    }

    private NamespacedKey getKeyOfFaceTexture(NamespacedKey namespacedKey, MCCBlockFace face) {
        return new NamespacedKey(namespacedKey.namespace(), namespacedKey.getKey() + "/face/" + face.name().toLowerCase(Locale.ROOT));
    }

    @Override
    public void installResourceToPack(CustomResourcePack customPack) throws IOException {

    }

    public static class Builder implements FakeBlockDisplay.Builder<SolidFullBlockEntityDisplay>{
        private static final List<MCCBlockFace> validFaces = List.of(MCCBlockFace.UP, MCCBlockFace.DOWN, MCCBlockFace.NORTH, MCCBlockFace.EAST, MCCBlockFace.SOUTH, MCCBlockFace.WEST);
        private final Map<MCCBlockFace, Asset<CustomResourcePack>> texturesPerBlockFace = new HashMap<>();
        private final Map<MCCBlockFace, ItemTextureData.ModelType> modelsPerBlockFace = new HashMap<>();
        private BlockData destroyParticleData = Bukkit.createBlockData(Material.STONE);

        public Builder withTexture(MCCBlockFace face, Asset<CustomResourcePack> blockTexture) {
            if (!validFaces.contains(face)) {
                Bukkit.getLogger().warning("Cannot add texture for block face " + face + ". Allowed faces are: " + validFaces);
                return this;
            }

            modelsPerBlockFace.put(face, ItemTextureData.ModelType.createOnlyOneSideTextureOfCube(face));
            texturesPerBlockFace.put(face, blockTexture);
            return this;
        }

        public Builder withTopAndBottomTexture(Asset<CustomResourcePack> blockTexture) {
            withTexture(MCCBlockFace.UP, blockTexture);
            withTexture(MCCBlockFace.DOWN, blockTexture);
            return this;
        }

        public Builder withFullBlockTexture(Asset<CustomResourcePack> blockTexture) {
            for (MCCBlockFace validFace : validFaces)
                withTexture(validFace, blockTexture);
            return this;
        }

        public Builder withDestroyParticleData(BlockData destroyParticleData) {
            this.destroyParticleData = destroyParticleData;
            return this;
        }

        public Builder withSideTexture(Asset<CustomResourcePack> blockTexture) {
            withTexture(MCCBlockFace.NORTH, blockTexture);
            withTexture(MCCBlockFace.EAST, blockTexture);
            withTexture(MCCBlockFace.SOUTH, blockTexture);
            withTexture(MCCBlockFace.WEST, blockTexture);
            return this;
        }

        @Override
        public SolidFullBlockEntityDisplay build(NamespacedKey namespacedKey) {
            return new SolidFullBlockEntityDisplay(namespacedKey, texturesPerBlockFace, modelsPerBlockFace, destroyParticleData);
        }
    }
}
