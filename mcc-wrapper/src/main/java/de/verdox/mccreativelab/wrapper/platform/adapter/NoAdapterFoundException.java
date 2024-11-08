package de.verdox.mccreativelab.wrapper.platform.adapter;

public class NoAdapterFoundException extends Exception {
    public NoAdapterFoundException() {
    }

    public NoAdapterFoundException(String message) {
        super(message);
    }

    public NoAdapterFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoAdapterFoundException(Throwable cause) {
        super(cause);
    }

    public NoAdapterFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
