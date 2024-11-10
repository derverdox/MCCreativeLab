package de.verdox.mccreativelab.impl.vanilla.platform.converter;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;

import java.util.HashSet;
import java.util.Set;

public class HolderSetConverter implements MCCConverter<HolderSet, Set> {
    @Override
    public ConversionResult<Set> wrap(HolderSet platform) {
        Set<Object> set = new HashSet<>();
        for (Object o : platform) {
            set.add(MCCPlatform.getInstance().getConversionService().wrap(o));
        }
        return done(set);
    }

    @Override
    public ConversionResult<HolderSet> unwrap(Set api) {
        Holder[] holderArray = (Holder[]) api.stream().map(o -> {
            return MCCPlatform.getInstance().getConversionService().unwrap(o);
        }).map(o -> ((Holder) o)).toArray(Holder[]::new);
        return done(HolderSet.direct(holderArray));
    }

    @Override
    public Class<Set> apiImplementationClass() {
        return Set.class;
    }

    @Override
    public Class<HolderSet> nativeMinecraftType() {
        return HolderSet.class;
    }
}
