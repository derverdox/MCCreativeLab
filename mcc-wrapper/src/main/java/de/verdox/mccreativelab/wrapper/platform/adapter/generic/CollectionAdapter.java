package de.verdox.mccreativelab.wrapper.platform.adapter.generic;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.platform.adapter.MCCAdapters;
import de.verdox.mccreativelab.wrapper.platform.adapter.WrapperAdapter;

import java.util.Collection;
import java.util.function.Supplier;

public class CollectionAdapter<F,T> implements WrapperAdapter<Collection<F>, Collection<T>> {

    private final Supplier<Collection<?>> constructor;

    public CollectionAdapter(Supplier<Collection<?>> constructor){
        this.constructor = constructor;
    }

    @Override
    public Collection<F> apiToPlatform(Collection<T> apiList) {
        Collection<F> platformCollection = (Collection<F>) constructor.get();
        for (T t : apiList)
            platformCollection.add(MCCAdapters.unwrap(new TypeToken<>(){}, new TypeToken<>(){}, t));
        return platformCollection;
    }

    @Override
    public Collection<T> platformToApi(Collection<F> platformList) {
        Collection<T> apiCollection = (Collection<T>) constructor.get();
        for (F f : platformList)
            apiCollection.add(MCCAdapters.wrap(new TypeToken<>(){}, new TypeToken<>(){}, f));
        return apiCollection;
    }
}
