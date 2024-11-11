package de.verdox.mccreativelab.conversion;

public class NoConverterFoundException extends RuntimeException {
    public NoConverterFoundException() {
    }

    public NoConverterFoundException(String message) {
        super(message);
    }

    public NoConverterFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoConverterFoundException(Throwable cause) {
        super(cause);
    }

    public NoConverterFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
