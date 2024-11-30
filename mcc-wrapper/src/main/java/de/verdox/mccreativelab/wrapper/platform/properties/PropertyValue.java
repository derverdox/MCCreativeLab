package de.verdox.mccreativelab.wrapper.platform.properties;

import com.google.common.reflect.TypeToken;

import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.function.Function;

public abstract class PropertyValue<T> {

    public static final DirectValue<Boolean> BOOLEAN = new DirectValue<>(new TypeToken<>() {}, Boolean::parseBoolean, Object::toString);
    public static final DirectValue<String> STRING = new DirectValue<>(new TypeToken<>() {}, s -> s, s -> s);
    public static final DirectValue<Byte> BYTE = new DirectValue<>(new TypeToken<>() {}, Byte::parseByte, Object::toString);
    public static final DirectValue<Short> SHORT = new DirectValue<>(new TypeToken<>() {}, Short::parseShort, Object::toString);
    public static final DirectValue<Integer> INTEGER = new DirectValue<>(new TypeToken<>() {}, Integer::parseInt, Object::toString);
    public static final DirectValue<Long> LONG = new DirectValue<>(new TypeToken<>() {}, Long::parseLong, Object::toString);
    public static final DirectValue<Float> FLOAT = new DirectValue<>(new TypeToken<>() {}, Float::parseFloat, Object::toString);
    public static final DirectValue<Double> DOUBLE = new DirectValue<>(new TypeToken<>() {}, Double::parseDouble, Object::toString);

    public static final ListValue<Boolean> BOOLEAN_LIST = new ListValue<>(new TypeToken<>() {}, BOOLEAN);
    public static final ListValue<String> STRING_LIST = new ListValue<>(new TypeToken<>() {}, STRING);
    public static final ListValue<Byte> BYTE_LIST = new ListValue<>(new TypeToken<>() {}, BYTE);
    public static final ListValue<Short> SHORT_LIST = new ListValue<>(new TypeToken<>() {}, SHORT);
    public static final ListValue<Integer> INTEGER_LIST = new ListValue<>(new TypeToken<>() {}, INTEGER);
    public static final ListValue<Long> LONG_LIST = new ListValue<>(new TypeToken<>() {}, LONG);
    public static final ListValue<Float> FLOAT_LIST = new ListValue<>(new TypeToken<>() {}, FLOAT);
    public static final ListValue<Double> DOUBLE_LIST = new ListValue<>(new TypeToken<>() {}, DOUBLE);

    protected final TypeToken<T> clazz;

    public PropertyValue(TypeToken<T> clazz) {
        this.clazz = clazz;
    }

    public abstract T read(String key, Properties properties);

    public abstract void write(String key, Properties properties, T value);

    public TypeToken<T> getType() {
        return clazz;
    }

    public static class DirectValue<T> extends PropertyValue<T> {
        final Function<String, T> fromString;
        final Function<T, String> toString;

        private DirectValue(TypeToken<T> clazz, Function<String, T> fromString, Function<T, String> toString) {
            super(clazz);
            this.fromString = fromString;
            this.toString = toString;
        }

        @Override
        public T read(String key, Properties properties) {
            return fromString.apply(properties.getProperty(key));
        }

        @Override
        public void write(String key, Properties properties, T value) {
            properties.setProperty(key, toString.apply(value));
        }
    }

    public static class ListValue<T> extends PropertyValue<List<T>> {
        private final DirectValue<T> directValueType;

        public ListValue(TypeToken<List<T>> clazz, DirectValue<T> directValueType) {
            super(clazz);
            this.directValueType = directValueType;
        }

        @Override
        public List<T> read(String key, Properties properties) {
            List<T> readValues = new LinkedList<>();
            for (String foundPropertyInList : properties.getProperty(key).split(",")) {
                foundPropertyInList = foundPropertyInList.replace(",", "").replace(", ", "").replace(" ,", "");
                readValues.add(directValueType.fromString.apply(foundPropertyInList));
            }
            return readValues;
        }

        @Override
        public void write(String key, Properties properties, List<T> value) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < value.size(); i++) {
                stringBuilder.append(directValueType.toString.apply(value.get(i)));
                if (i < value.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            properties.setProperty(key, stringBuilder.toString());
        }
    }
}
