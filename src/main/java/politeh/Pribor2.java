package politeh;



public class Pribor2 extends Pribor1 {


    public static void main(String[] args) {
        Pribor1.showCount();

        Pribor1 p2 = new Pribor1("Ampermetr", 20, new Measurments("Amper", 0.2, 1.7, 0.01));
        p2.onDevice();
        Pribor1.showCount();
        p2.showInfo();


        Pribor2 p3 = new Pribor2("Termometr", 40, new Measurments("Gradus", -10, 50, 0.5), new PurchasedProduct("Korpus", 30, "Zavod 5"));
        p3.offDevice();
        Pribor1.showCount();
        p3.showInfo();
    }

    protected static class PurchasedProduct {
        public PurchasedProduct(String nameOfProduct) {
            this.nameOfProduct = nameOfProduct;
        }

        public PurchasedProduct(int quantity) {
            this.quantity = quantity;
        }

        public PurchasedProduct(String manufacturer, int help){
            this.manufacturer = manufacturer;
            this.help = help;
        }

        public PurchasedProduct(String nameOfProduct, int quantity, String manufacturer) {
            this.nameOfProduct = nameOfProduct;
            this.quantity = quantity;
            this.manufacturer = manufacturer;
        }

        private String nameOfProduct;
        private int help;
        private int quantity;
        private String manufacturer;
    }

    private PurchasedProduct purchasedProduct;




    Pribor2(String name, int price, Measurments measurments, PurchasedProduct purchasedProduct) {
        super(name, price, measurments);
        this.purchasedProduct = purchasedProduct;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Product name: " + purchasedProduct.nameOfProduct);
        System.out.println("Quantity of products :" + purchasedProduct.quantity);
        System.out.println("Manufacturer: " + purchasedProduct.manufacturer + "\n");
    }

}
