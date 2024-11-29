package de.verdox.mccreativelab;

import java.util.function.Consumer;

public class Singleton<T> {
    private final Class<T> type;
    private T singleton;

    public Singleton(Class<T> type) {
        this.type = type;
    }

    public void setup(T singleton, Consumer<T> callback) {
        if (this.singleton != null)
            throw new IllegalStateException("The singleton " + type + " is already set up");
        this.singleton = singleton;
        callback.accept(this.singleton);
    }

    public T get() {
        if(this.singleton == null)
            throw new IllegalStateException("The singleton "+type+" was not setup by the running server platform. Please provide a valid implementation by using the setup function.");
        return singleton;
    }

    public boolean isSetup(){
        return this.singleton != null;
    }
}
