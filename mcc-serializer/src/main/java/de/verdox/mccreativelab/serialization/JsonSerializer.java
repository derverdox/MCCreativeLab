package de.verdox.mccreativelab.serialization;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import de.verdox.mccreativelab.util.gson.JsonArrayBuilder;
import de.verdox.mccreativelab.util.gson.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Function;
import java.util.function.Supplier;

public interface JsonSerializer<T> {
    JsonElement toJson(T wrapped);

    @Nullable
    T fromJson(JsonElement jsonElement);

    String id();

    class Primitive<T> implements JsonSerializer<T> {
        public static final Primitive<Boolean> BOOLEAN = new Primitive<>(JsonPrimitive::new, JsonElement::getAsBoolean);
        public static final Primitive<String> STRING = new Primitive<>(JsonPrimitive::new, JsonElement::getAsString);
        public static final Primitive<Character> CHARACTER = new Primitive<>(JsonPrimitive::new, JsonElement::getAsCharacter);
        public static final Primitive<Number> NUMBER = new Primitive<>(JsonPrimitive::new, JsonElement::getAsNumber);
        public static final Primitive<Double> DOUBLE = new Primitive<>(JsonPrimitive::new, JsonElement::getAsDouble);
        public static final Primitive<Float> FLOAT = new Primitive<>(JsonPrimitive::new, JsonElement::getAsFloat);
        public static final Primitive<Long> LONG = new Primitive<>(JsonPrimitive::new, JsonElement::getAsLong);
        public static final Primitive<Integer> INTEGER = new Primitive<>(JsonPrimitive::new, JsonElement::getAsInt);
        public static final Primitive<Short> SHORT = new Primitive<>(JsonPrimitive::new, JsonElement::getAsShort);
        public static final Primitive<Byte> BYTE = new Primitive<>(JsonPrimitive::new, JsonElement::getAsByte);

        private final Function<T, JsonPrimitive> toFunction;
        private final Function<JsonElement, T> from;

        private Primitive(Function<T, JsonPrimitive> to, Function<JsonElement, T> from) {

            toFunction = to;
            this.from = from;
        }

        @Override
        public JsonElement toJson(T wrapped) {
            return toFunction.apply(wrapped);
        }

        @Override
        public @Nullable T fromJson(JsonElement jsonElement) {
            return from.apply(jsonElement);
        }

        @Override
        public String id() {
            return "primitive";
        }
    }

    class Enum<E extends java.lang.Enum<E>> implements JsonSerializer<E> {
        private final String id;
        private final Class<? extends E> type;

        public static <E extends java.lang.Enum<E>> Enum<E> create(String id, Class<? extends E> type) {
            return new Enum<>(id, type);
        }

        private Enum(String id, Class<? extends E> type) {
            this.id = id;
            this.type = type;
        }

        @Override
        public JsonElement toJson(E wrapped) {
            return new JsonPrimitive(wrapped.name());
        }

        @Override
        public @Nullable E fromJson(JsonElement jsonElement) {
            return java.lang.Enum.valueOf((Class<E>) type, jsonElement.getAsString());
        }

        @Override
        public String id() {
            return id;
        }
    }

    abstract class Collection<T, C extends java.util.Collection<T>> implements JsonSerializer<C> {
        protected final JsonSerializer<T> elementSerializer;

        private Collection(JsonSerializer<T> elementSerializer) {
            this.elementSerializer = elementSerializer;
        }

        public static <T, C extends java.util.Collection<T>> Collection<T, C> create(@NotNull JsonSerializer<T> serializer, @NotNull Supplier<C> collectionSupplier) {
            return new Collection<>(serializer) {
                @Override
                protected C supplyCollection() {
                    return collectionSupplier.get();
                }

                @Override
                public String id() {
                    return "collection";
                }
            };
        }

        @Override
        public final JsonElement toJson(C wrapped) {
            JsonArrayBuilder jsonArrayBuilder = JsonArrayBuilder.create();
            for (T t : wrapped)
                jsonArrayBuilder.add(elementSerializer.toJson(t));
            return jsonArrayBuilder.build();
        }

        @Nullable
        @Override
        public final C fromJson(JsonElement jsonElement) {
            JsonArray jsonArray = jsonElement.getAsJsonArray();
            C list = supplyCollection();
            for (JsonElement element : jsonArray)
                list.add(elementSerializer.fromJson(element));
            return list;
        }

        protected abstract C supplyCollection();
    }

    abstract class Map<K, V, M extends java.util.Map<K, V>> implements JsonSerializer<M> {
        public static <K, V, M extends java.util.Map<K, V>> Map<K, V, M> create(@NotNull JsonSerializer<K> key, @NotNull JsonSerializer<V> value, @NotNull Supplier<M> mapSupplier) {
            return new Map<>(key, value) {

                @Override
                protected M supplyMap() {
                    return mapSupplier.get();
                }
            };
        }

        private final JsonSerializer<K> key;
        private final JsonSerializer<V> value;

        private Map(JsonSerializer<K> key, JsonSerializer<V> value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public JsonElement toJson(M wrapped) {
            boolean isStringKeys = wrapped.keySet().stream().anyMatch(k -> k instanceof String);
            if (isStringKeys) {
                JsonObjectBuilder jsonObjectBuilder = JsonObjectBuilder.create();

                wrapped.forEach((k, v) -> {
                    JsonElement keyElement = key.toJson(k);
                    JsonElement valueElement = value.toJson(v);
                    jsonObjectBuilder.add(keyElement.getAsString(), valueElement);
                });
                return jsonObjectBuilder.build();
            } else {
                JsonArrayBuilder jsonArrayBuilder = JsonArrayBuilder.create();

                wrapped.forEach((k, v) -> {
                    JsonElement keyElement = key.toJson(k);
                    JsonElement valueElement = value.toJson(v);
                    jsonArrayBuilder.add(JsonObjectBuilder.create().add("key", keyElement).add("value", valueElement));
                });
                return jsonArrayBuilder.build();
            }
        }

        @Override
        public @Nullable M fromJson(JsonElement jsonElement) {
            M map = supplyMap();
            if (jsonElement.isJsonArray()) {
                JsonArray jsonArray = jsonElement.getAsJsonArray();
                for (JsonElement element : jsonArray) {
                    JsonElement keyElement = element.getAsJsonObject().get("key").getAsJsonObject();
                    JsonElement valueElement = element.getAsJsonObject().get("value").getAsJsonObject();

                    K key = this.key.fromJson(keyElement);
                    V value = this.value.fromJson(valueElement);
                    map.put(key, value);
                }
            } else {
                JsonObject jsonObject = jsonElement.getAsJsonObject();
                for (String jsonKey : jsonObject.keySet()) {
                    K key = (K) jsonKey;
                    V value = this.value.fromJson(jsonObject.get(jsonKey));
                    map.put(key, value);
                }
            }
            return map;
        }

        protected abstract M supplyMap();

        @Override
        public String id() {
            return "mapping";
        }
    }
}
