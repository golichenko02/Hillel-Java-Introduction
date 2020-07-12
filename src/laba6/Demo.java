package laba6;

public class Demo {
    public static void main(String[] args) {
        Products p = new Products(4);

        p.add(new Product("Watch","Rolex",3,4,25000,20000));
        p.add(new Product("Phone","Apple",3,4,22000,18000));
        p.add(new Product("Tablet","Yoga",3,4,12000,10000));

        p.searchProducts(20000);
        p.searchProducts(18000);
        p.searchProducts(10000);
        p.show();
        p.sortingByProductName();
        p.sortingByManufacturer();

        // оптовая цена больше розничной
        p.add(new Product("TV","samsung",3,4,9000,13000));
        // отрицательное количество товаров
        Products p2 = new Products(-1);

    }
}
