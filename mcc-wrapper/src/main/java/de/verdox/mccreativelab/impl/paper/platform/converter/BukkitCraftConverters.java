package de.verdox.mccreativelab.impl.paper.platform.converter;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.entity.MCCEntityType;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.world.MCCWorld;
import de.verdox.mccreativelab.wrapper.world.chunk.MCCChunk;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.chunk.status.ChunkStatus;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.craftbukkit.CraftChunk;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.block.CraftBlock;
import org.bukkit.craftbukkit.block.data.CraftBlockData;
import org.bukkit.craftbukkit.entity.*;
import org.bukkit.craftbukkit.util.CraftMagicNumbers;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

import java.util.function.Function;

public class BukkitCraftConverters {

    public static void init(){}

    public static final BukkitCraftConverter<ServerLevel, CraftWorld, MCCWorld> WORLD = register(new TypeToken<>() {}, new TypeToken<>() {}, CraftWorld::getHandle, Level::getWorld);
    public static final BukkitCraftConverter<Entity, CraftEntity, MCCEntity> ENTITY = register(new TypeToken<>() {}, new TypeToken<>() {}, CraftEntity::getHandle, Entity::getBukkitEntity);
    public static final BukkitCraftConverter<ChunkAccess, CraftChunk, MCCChunk> CHUNK = register(new TypeToken<>() {}, new TypeToken<>() {}, craftChunk -> craftChunk.getHandle(ChunkStatus.FULL), chunkAccess -> new CraftChunk((LevelChunk) chunkAccess));
    public static final BukkitCraftConverter<BlockState, CraftBlockData, MCCBlockState> BLOCK_DATA = register(new TypeToken<>() {}, new TypeToken<>() {}, CraftBlockData::getState, CraftBlockData::createData);
    public static final BukkitCraftConverter<EntityType, org.bukkit.entity.EntityType, MCCEntityType> ENTITY_TYPE = register(new TypeToken<>() {}, new TypeToken<>() {}, CraftEntityType::bukkitToMinecraft, CraftEntityType::minecraftToBukkit);
    public static final MCCConverter<Location, MCCLocation> LOCATION = register(new BukkitLocationConverter());
    public static final MCCConverter<org.bukkit.block.Block, MCCBlock> BLOCK = register(new BukkitBlockConverter());
    public static final BukkitCraftConverter<Block, Material, MCCBlockType> BLOCK_TYPE = register(new TypeToken<>() {}, new TypeToken<>() {}, material -> {
        if (!material.isBlock()) {
            return null;
        }
        return CraftMagicNumbers.getBlock(material);
    }, CraftMagicNumbers::getMaterial);
    public static final BukkitCraftConverter<Item, Material, MCCItemType> ITEM_TYPE = register(new TypeToken<>() {}, new TypeToken<>() {}, material -> {
        if (!material.isItem()) {
            return null;
        }
        return CraftMagicNumbers.getItem(material);
    }, CraftMagicNumbers::getMaterial);

    private static <F, B, T> BukkitCraftConverter<F, B, T> register(TypeToken<B> bukkitType, TypeToken<T> apiType, Function<B, F> getter, Function<F, B> wrapper) {
        BukkitCraftConverter<F, B, T> converter = new BukkitCraftConverter<>(bukkitType, apiType, getter, wrapper);
        MCCPlatform.getInstance().getConversionService().registerPlatformType(apiType.getRawType(), converter);
        return converter;
    }

    private static <F,T> MCCConverter<F,T> register(MCCConverter<F,T> converter){
        MCCPlatform.getInstance().getConversionService().registerPlatformType(converter.apiImplementationClass(), converter);
        return converter;
    }

    private static class BukkitLocationConverter implements MCCConverter<Location, MCCLocation> {
        @Override
        public ConversionResult<MCCLocation> wrap(Location nativeType) {
            CraftWorld world = (CraftWorld) nativeType.getWorld();
            return done(new MCCLocation(WORLD.wrap(world).value(), nativeType.x(), nativeType.y(), nativeType.z(), nativeType.getYaw(), nativeType.getPitch()));
        }

        @Override
        public ConversionResult<Location> unwrap(MCCLocation platformImplType) {
            org.bukkit.entity.Entity livingEntity;

            return done(new Location(WORLD.unwrap(platformImplType.world()).value(), platformImplType.x(), platformImplType.y(), platformImplType.z(), platformImplType.yaw(), platformImplType.pitch()));
        }

        @Override
        public Class<MCCLocation> apiImplementationClass() {
            return MCCLocation.class;
        }

        @Override
        public Class<Location> nativeMinecraftType() {
            return Location.class;
        }
    }

    private static class BukkitBlockConverter implements MCCConverter<org.bukkit.block.Block, MCCBlock> {

        @Override
        public ConversionResult<MCCBlock> wrap(org.bukkit.block.Block nativeType) {
            CraftBlock craftBlock = (CraftBlock) nativeType;
            Player player;

            return done(new MCCBlock(LOCATION.wrap(nativeType.getLocation()).value(), MCCPlatform.getInstance().getConversionService().wrap(nativeType.getChunk(), new TypeToken<>() {})));
        }

        @Override
        public ConversionResult<org.bukkit.block.Block> unwrap(MCCBlock platformImplType) {
            return done(WORLD.unwrap(platformImplType.getLocation().world()).value().getBlockAt(LOCATION.unwrap(platformImplType.getLocation()).value()));
        }

        @Override
        public Class<MCCBlock> apiImplementationClass() {
            return MCCBlock.class;
        }

        @Override
        public Class<org.bukkit.block.Block> nativeMinecraftType() {
            return org.bukkit.block.Block.class;
        }
    }
}
