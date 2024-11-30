package de.verdox.mccreativelab.impl.vanilla.entity;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.entity.MCCEntityType;
import net.kyori.adventure.key.Key;
import net.minecraft.world.entity.EntityType;
import org.jetbrains.annotations.NotNull;

public class NMSEntityType extends MCCHandle<EntityType<?>> implements MCCEntityType {
    public static final MCCConverter<EntityType, NMSEntityType> CONVERTER = converter(NMSEntityType.class, EntityType.class, NMSEntityType::new, MCCHandle::getHandle);


    public NMSEntityType(EntityType<?> handle) {
        super(handle);
    }

    @Override
    public @NotNull Key key() {
        //TODO
        return null;
    }
}
