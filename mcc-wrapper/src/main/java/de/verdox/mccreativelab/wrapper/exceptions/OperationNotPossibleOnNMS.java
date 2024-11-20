package de.verdox.mccreativelab.wrapper.exceptions;

public class OperationNotPossibleOnNMS extends RuntimeException {
    public OperationNotPossibleOnNMS() {
        super("This action is not supported on the nms platform. This does normally happen if you are running on paper / fabric and the function does only exist there. However, no implementation was registered for this platform that supports this operation. The nms wrapper implementations only wrap nms but normally do not add further logic to nms.");
    }

    public OperationNotPossibleOnNMS(String message) {
        super(message);
    }

    public OperationNotPossibleOnNMS(String message, Throwable cause) {
        super(message, cause);
    }

    public OperationNotPossibleOnNMS(Throwable cause) {
        super(cause);
    }

    public OperationNotPossibleOnNMS(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
