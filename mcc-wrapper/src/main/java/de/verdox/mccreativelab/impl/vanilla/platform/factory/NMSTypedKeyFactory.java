package de.verdox.mccreativelab.impl.vanilla.platform.factory;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.MCCTypedKey;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.platform.factory.TypedKeyFactory;
import net.kyori.adventure.key.Key;

public class NMSTypedKeyFactory implements TypedKeyFactory {
    @Override
    public <T extends MCCWrapped> MCCTypedKey<T> getKey(Key key, Key registryKey, TypeToken<T> type) {
        return new NMSTypedKey<>(key, registryKey);
    }
}
