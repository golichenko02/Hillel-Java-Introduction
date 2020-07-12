package storage;

public class NotEnoughMaterialException extends Exception {
    public NotEnoughMaterialException(String message) {
        super(message);
    }
}
