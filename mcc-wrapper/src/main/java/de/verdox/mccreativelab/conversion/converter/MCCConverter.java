package de.verdox.mccreativelab.conversion.converter;

public interface MCCConverter<F, T> {
    ConversionResult<T> wrap(F nativeType);

    ConversionResult<F> unwrap(T platformImplType);

    Class<T> apiImplementationClass();

    Class<F> nativeMinecraftType();

    default <V> ConversionResult<V> done(V result){
        return new ConversionResult<>(ResultType.DONE, result);
    }

    default <V> ConversionResult<V> notDone(V result){
        return new ConversionResult<>(ResultType.NOT_DONE, result);
    }

    record ConversionResult<V>(ResultType result, V value) {
    }

    enum ResultType {
        DONE,
        NOT_DONE
        ;
        public boolean isDone(){
            return this.equals(DONE);
        }
    }
}
