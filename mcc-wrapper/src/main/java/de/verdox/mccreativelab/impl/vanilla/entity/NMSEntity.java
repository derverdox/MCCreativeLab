package de.verdox.mccreativelab.impl.vanilla.entity;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.block.NMSBlockState;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.entity.MCCEntityType;
import de.verdox.mccreativelab.wrapper.platform.TempData;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.text.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class NMSEntity<T extends Entity> extends NMSHandle<T> implements MCCEntity {
    public static final MCCConverter<Entity, NMSEntity> CONVERTER = converter(NMSEntity.class, Entity.class, NMSEntity::new, nmsEntity -> (Entity) nmsEntity.getHandle());


    public NMSEntity(T handle) {
        super(handle);
    }

    @Override
    public @NotNull MCCEntityType getType() {
        return null;
    }

    @Override
    public Audience asAudience() {
        return null;
    }

    @Override
    public UUID getUUID() {
        return null;
    }

    @Override
    public Component displayName() {
        return null;
    }

    @Override
    public void displayName(Component name) {

    }

    @Override
    public @NotNull Key key() {
        return null;
    }

    @Override
    public TempData getTempData() {
        return null;
    }
}
