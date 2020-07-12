package storage;

public class Warehouse implements Logistics {
    private Material[] materials;
    private int amount = 0;

    public Warehouse(int size) {
        this.materials = new Material[size];
    }


    @Override
    public void export(String material, double weight) throws NotEnoughMaterialException, MaterialNotFoundException {
        int i = 0;
        double curWeight = 0;
        for (i = 0; i < materials.length; i++) {
            if (material.equals(materials[i].getName())) {
                if (weight > materials[i].getWeight()) {
                    throw new NotEnoughMaterialException("Warehouse doesn't have so much material!");
                } else {
                    curWeight = materials[i].getWeight();
                    System.out.println(material + " exported from warehouse. Weight: " + weight);
                    if (weight == materials[i].getWeight()) {
                        materials[i].setWeight(materials[i].getWeight() - weight);
                        amount--;
                        for (int k = i; k < materials.length - 1; k++)
                            materials[k] = materials[k + 1];
                        break;
                    }
                    materials[i].setWeight(materials[i].getWeight() - weight);
                    break;
                }
            }
        }
        if (curWeight == 0 || curWeight == materials[i].getWeight()) {
            throw new MaterialNotFoundException("Material " + material + " not found");
        }
    }

    @Override
    public void delivery(Material material) throws WarehouseOverflowException {
        if (amount == materials.length) {
            throw new WarehouseOverflowException("Warehouse is full, maximum:" + materials.length);
        }
        materials[amount] = material;
        amount++;
        System.out.println(material.getName() + " delivered to the warehouse. Weight: " + material.getWeight());
    }

    public void showMaterials() {
        System.out.println("Amount of materials: " + amount);
        for (int i = 0; i < materials.length; i++) {
            System.out.println("Material: " + materials[i].getName() + "\tWeight: " + materials[i].getWeight());
        }
    }
}
