package storage;

public class TestWareHouse {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(4);

        try {
            warehouse.delivery(new Material("Pesok", 5)); // 1
            warehouse.delivery(new Material("Torf", 7));  // 2
            warehouse.delivery(new Material("Humus", 8)); // 3
            warehouse.delivery(new Material("Keramzit", 2.5)); // 4 --> полностью заполнен
            warehouse.export("Pesok", 3); // песка осталось 2 тонны
            warehouse.export("Torf", 7); // увезли весь торф --> освободилось место
            warehouse.delivery(new Material("Gips", 3)); // 4

            /**
             * Ниже закомментированы три вида Exception
             * Демонстрация их срабатывания в примере выполнения программы
             */
            // warehouse.delivery(new Material("Schebenka", 4)); // 5 элемент --> WarehouseOverflowException
            // warehouse.export("Gips", 5); // гипса 3 тонны, а хотим взять 5 --> NotEnoughMaterialException
            // warehouse.export("Schebenka", 3); // такого материала на складе нет --> MaterialNotFoundException

            warehouse.showMaterials();

        }catch (WarehouseOverflowException e){
            e.printStackTrace();
        }catch (NotEnoughMaterialException e){
            e.printStackTrace();
        }catch (MaterialNotFoundException e){
            e.printStackTrace();
        }
    }
}
