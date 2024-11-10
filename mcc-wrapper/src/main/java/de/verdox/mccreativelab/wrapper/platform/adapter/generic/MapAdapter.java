package de.verdox.mccreativelab.wrapper.platform.adapter.generic;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.platform.adapter.MCCAdapters;
import de.verdox.mccreativelab.wrapper.platform.adapter.WrapperAdapter;

import java.util.Map;
import java.util.function.Supplier;

public class MapAdapter<K1, V1, K2, V2> implements WrapperAdapter<Map<K1, V1>, Map<K2, V2>> {
    private final Supplier<Map<?, ?>> constructor;

    public MapAdapter(Supplier<Map<?, ?>> constructor) {
        this.constructor = constructor;
    }

    @Override
    public Map<K1, V1> apiToPlatform(Map<K2, V2> apiMap) {
        Map<K1, V1> platformMap = (Map<K1, V1>) constructor.get();
        apiMap.forEach((key, value) -> platformMap.put(MCCAdapters.unwrap(new TypeToken<K1>(){}, new TypeToken<K2>(){}, key), MCCAdapters.unwrap(new TypeToken<V1>(){}, new TypeToken<V2>(){}, value)));
        return platformMap;
    }

    @Override
    public Map<K2, V2> platformToApi(Map<K1, V1> platformMap) {
        Map<K2, V2> apiMap = (Map<K2, V2>) constructor.get();
        platformMap.forEach((key, value) -> apiMap.put(MCCAdapters.unwrap(new TypeToken<K2>(){}, new TypeToken<K1>(){}, key), MCCAdapters.unwrap(new TypeToken<V2>(){}, new TypeToken<V1>(){}, value)));
        return apiMap;
    }
}
