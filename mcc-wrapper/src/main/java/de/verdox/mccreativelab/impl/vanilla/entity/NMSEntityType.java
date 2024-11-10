package de.verdox.mccreativelab.impl.vanilla.entity;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.item.NMSItemStack;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.entity.MCCEntityType;
import de.verdox.mccreativelab.wrapper.platform.adapter.WrapperAdapter;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import net.kyori.adventure.key.Key;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class NMSEntityType extends NMSHandle<EntityType<?>> implements MCCEntityType {
    public static final MCCConverter<EntityType, NMSEntityType> CONVERTER = converter(NMSEntityType.class, EntityType.class, NMSEntityType::new, NMSHandle::getHandle);


    public NMSEntityType(EntityType<?> handle) {
        super(handle);
    }

    @Override
    public CompletableFuture<MCCEntity> summon(@NotNull MCCLocation location, @Nullable Consumer<MCCEntity> callback) {
        return null;
    }

    @Override
    public @NotNull Key key() {
        return null;
    }
}
