package storage;

public interface Logistics {
    void export(String material, double weight) throws NotEnoughMaterialException, MaterialNotFoundException;
    void delivery(Material material) throws WarehouseOverflowException;
}
