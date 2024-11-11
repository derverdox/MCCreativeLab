package de.verdox.mccreativelab.impl.vanilla.platform.factory;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.impl.vanilla.registry.NMSTag;
import de.verdox.mccreativelab.impl.vanilla.registry.NMSTypedKey;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReferenceSet;
import de.verdox.mccreativelab.wrapper.registry.MCCRegistry;
import de.verdox.mccreativelab.wrapper.registry.MCCTag;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.platform.factory.TypedKeyFactory;
import net.kyori.adventure.key.Key;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;

import java.util.List;

public class NMSTypedKeyFactory implements TypedKeyFactory {
    @Override
    public <T extends MCCWrapped> MCCTypedKey<T> getKey(Key key, Key registryKey, TypeToken<T> type) {
        return new NMSTypedKey<>(key, registryKey);
    }

    @Override
    public <T extends MCCWrapped> MCCTag<T> createTag(Key key, Key registryKey, TypeToken<T> type) {
        return new NMSTag<>(key, registryKey);
    }

    @Override
    public <T extends MCCWrapped> MCCReferenceSet<T> createImmutableSetWithoutKey(List<MCCRegistry<T>> references) {
        List<? extends Holder<?>> list = MCCPlatform.getInstance().getConversionService().unwrap(references, new TypeToken<>(){});
        HolderSet<?> holders = HolderSet.direct(list.toArray(Holder[]::new));
        return MCCPlatform.getInstance().getConversionService().wrap(holders, new TypeToken<>() {});
    }
}
