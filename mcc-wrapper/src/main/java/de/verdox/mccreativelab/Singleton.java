package de.verdox.mccreativelab;

public class Singleton<T> {
    private final Class<T> type;
    private T singleton;

    public Singleton(Class<T> type) {
        this.type = type;
    }

    public void setup(T singleton) {
        if (this.singleton != null)
            throw new IllegalStateException("The singleton " + type + " is already set up");
        this.singleton = singleton;
    }

    public T get() {
        if(this.singleton == null)
            throw new IllegalStateException("The singleton "+type+" was not setup by the running server platform. Please provide a valid implementation by using the setup function.");
        return singleton;
    }
}
