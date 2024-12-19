package de.verdox.mccreativelab.util.storage;

import de.verdox.mccreativelab.util.nbt.NBTContainer;
import de.verdox.mccreativelab.util.nbt.NBTPersistent;
import de.verdox.mccreativelab.util.storage.palette.IdMap;
import de.verdox.vserializer.generic.SerializationContainer;
import de.verdox.vserializer.generic.SerializationContext;
import it.unimi.dsi.fastutil.Pair;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

/**
 * @param <K> The index format
 * @param <T> The data to store
 */
public abstract class ThreeDimensionalStorage<K extends Number, T> implements NBTPersistent {
    private final IdMap<T> idMap;
    private final IndexingStrategy<K> indexingStrategy;

    public ThreeDimensionalStorage(IdMap<T> idMap, IndexingStrategy<K> indexingStrategy) {
        this.idMap = idMap;
        this.indexingStrategy = indexingStrategy;
    }

    @Override
    public void save(SerializationContainer storage, SerializationContext context) {
        List<SerializationContainer> savedData = new ArrayList<>();
        getDataToIndizesMappingInternal().forEach((dataID, indizes) -> {
            SerializationContainer nbtContainer = context.createContainer();
            nbtContainer.set("id", dataID);
            List<Integer> data = indizes.stream().map(Number::intValue).toList();

            int[] dataArray = new int[data.size()];
            for (int i = 0; i < data.size(); i++) {
                dataArray[i] = data.get(i);
            }

            nbtContainer.set("indizes", dataArray);
            savedData.add(nbtContainer);
        });
        storage.set("storage", savedData);
    }

    @Override
    public void load(SerializationContainer storage, SerializationContext context) {
        if(!storage.contains("storage")) {
            return;
        }
        List<SerializationContainer> savedData = storage.getContainerList("storage");
        for (SerializationContainer nbtContainer : savedData) {
            if(!nbtContainer.contains("indizes") || !nbtContainer.contains("id")) {
                continue;
            }

            int dataID = nbtContainer.get("id").getAsInt();
            int[] indizes = nbtContainer.get("indizes").getAsArray().getAsIntArray();

            for (int index : indizes) {
                int[] parameter = getIndexingStrategy().extractParameters(index);
                int x = parameter[0];
                int y = parameter[1];
                int z = parameter[2];

                T data = getIdMap().byId(dataID);
                setData(data, x, y ,z);
            }
        }
    }

    public void removeData(int x, int y, int z) {
        setData(null, x, y, z);
    }

    public final void setData(@Nullable T data, int x, int y, int z) {
        K index = getIndexingStrategy().getIndex(x, y, z);

        if (data == null) {
            removeDataInternal(index);
            return;
        }
        T oldData = getData(x, y, z);
        if (oldData != null)
            removeDataInternal(index);

        setDataInternal(index, idMap.getId(data));
    }

    public final @Nullable T getData(int x, int y, int z) {
        K index = getIndexingStrategy().getIndex(x, y, z);
        if (!hasDataInternal(index))
            return null;
        int dataID = getDataInternal(index);
        T data = idMap.byId(dataID);
        if (data == null) {
            //TODO: Error?
            return null;
        }
        return data;
    }

    public boolean isEmpty(){
        return getDataToIndizesMappingInternal().isEmpty();
    }

    public IndexingStrategy<K> getIndexingStrategy() {
        return indexingStrategy;
    }

    public void forEach(BiConsumer<K, T> consumer) {
        streamEntries().forEach(kIntegerPair -> {
            K key = kIntegerPair.key();
            int dataID = kIntegerPair.value();
            T data = idMap.byId(dataID);
            if (data == null)
                return;
            consumer.accept(key, data);
        });
    }

    public Map<T, Set<K>> getDataToIndizesMapping() {
        Map<T, Set<K>> map = new HashMap<>();
        getDataToIndizesMappingInternal().forEach((integer, ks) -> {
            T data = idMap.byId(integer);
            if (data == null)
                return;
            map.put(data, ks);
        });
        return map;
    }

    protected abstract boolean hasDataInternal(K index);

    protected abstract void setDataInternal(K index, int dataID);

    protected abstract int getDataInternal(K index);

    protected abstract void removeDataInternal(K index);

    protected abstract Stream<Pair<K, Integer>> streamEntries();

    protected abstract Map<Integer, Set<K>> getDataToIndizesMappingInternal();

    public IdMap<T> getIdMap() {
        return idMap;
    }

    public abstract static class IndexingStrategy<T extends Number> {
        protected final int xSize;
        protected final int ySize;
        protected final int zSize;

        public IndexingStrategy(int xSize, int ySize, int zSize) {
            this.xSize = xSize;
            this.ySize = ySize;
            this.zSize = zSize;
        }

        private void checkInputs(int x, int y, int z) {
            if (x < 0 || x >= xSize)
                throw new IndexOutOfBoundsException("x value " + x + " not in bounds between 0 and " + xSize);
            if (y < 0 || y >= ySize)
                throw new IndexOutOfBoundsException("y value " + y + " not in bounds between 0 and " + ySize);
            if (z < 0 || z >= zSize)
                throw new IndexOutOfBoundsException("z value " + z + " not in bounds between 0 and " + zSize);
        }

        public int getXSize() {
            return xSize;
        }

        public int getYSize() {
            return ySize;
        }

        public int getZSize() {
            return zSize;
        }

        public final T getIndex(int x, int y, int z) {
            x = Math.abs(x);
            y = Math.abs(y);
            z = Math.abs(z);
            checkInputs(x, y, z);
            return computeIndex(x, y, z);
        }

        protected abstract T computeIndex(int x, int y, int z);

        public abstract int[] extractParameters(int index);

        public static class Short extends IndexingStrategy<java.lang.Short> {
            public Short(int xSize, int ySize, int zSize) {
                super(xSize, ySize, zSize);
            }

            @Override
            protected java.lang.Short computeIndex(int x, int y, int z) {
                return (short) (Math.abs(x) + xSize * (Math.abs(y) + ySize * Math.abs(z)));
            }

            @Override
            public int[] extractParameters(int index) {
                int[] result = new int[3];

                result[2] = index / (xSize * ySize); // z
                index %= (xSize * ySize);

                result[1] = index / xSize;  // y
                index %= xSize;

                result[0] = index;  // x

                return result;
            }
        }
    }
}
