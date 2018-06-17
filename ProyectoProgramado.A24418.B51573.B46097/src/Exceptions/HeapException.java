package Exceptions;

public class HeapException extends Exception {
    /**
     * Constructs a new HeapException with the specified detail message.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public HeapException(String message) {
        super(message);
    }
}
