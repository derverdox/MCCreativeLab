package de.verdox.mccreativelab.impl.vanilla.registry;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.registry.MCCReferenceSet;
import de.verdox.mccreativelab.wrapper.registry.MCCTag;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class NMSReferenceSet<T> extends NMSHandle<HolderSet<?>> implements MCCReferenceSet<T> {
    public static final MCCConverter<HolderSet, NMSReferenceSet> CONVERTER = converter(NMSReferenceSet.class, HolderSet.class, NMSReferenceSet::new, holderSet -> (HolderSet) holderSet.getHandle());

    public NMSReferenceSet(HolderSet<?> handle) {
        super(handle);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(MCCReference<T> reference) {
        return false;
    }

    @Override
    public Stream<MCCReference<T>> stream() {
        return Stream.empty();
    }

    @Override
    public Optional<MCCTag<T>> unwrapKey() {
        return Optional.empty();
    }

    @Override
    public void setContents(List<MCCReference<T>> newContents) {
        if(isImmutable())
            throw new UnsupportedOperationException("You are trying to manipulate the contents of an immutable MCCReferenceSet.");

        try {
            Method method = HolderSet.Named.class.getDeclaredMethod("bind", List.class);

            List<Holder<T>> entries = MCCPlatform.getInstance().getConversionService().unwrap(newContents, new TypeToken<>() {});
            method.invoke(entries);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException("There was an error while trying to change the contents of a MCCReferenceSet at runtime. This operation uses java reflection and is considered an unsafe operation. However, the method should still work so please contact the MCCreativeLab Team <3.",e);
        }
    }

    @Override
    public boolean isImmutable() {
        return handle instanceof HolderSet.Direct<?>;
    }

    @Override
    public @NotNull Iterator<MCCReference<T>> iterator() {
        return null;
    }
}
