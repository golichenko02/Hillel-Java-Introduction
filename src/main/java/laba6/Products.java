package laba6;

import java.util.Arrays;


public class Products implements Manipulations {
    private Product[] products;
    private int length;
    private int lastIndex = 0;

    public Products(int size) {
        try {
            if (size < 0) {
                throw new IllegalSizeException("Negative quantity of goods");
            }
        } catch (IllegalSizeException e) {
            e.printStackTrace();
        }
        length = size;
        this.products = new Product[size];
    }


    @Override
    public boolean add(Product product) {
        if (lastIndex == length) {
            System.out.println("FULL"); //
            return false;
        } else {
            products[lastIndex] = product;
            lastIndex++;
            return true;
        }
    }

    @Override
    public void show() {
        for (int i = 0; i < lastIndex; i++) {
            System.out.println(i + 1 + ". " + products[i].getProduct() + "\t\tManufacturer: " +
                    products[i].getManufacturer() + "\t\tAmount: " + products[i].getQuantity() + "\t\tGuarantee: "
                    + products[i].getGuarantee() + "\tTrade price: " + products[i].getWholesalePrice() +
                    "\t\tRetail price: " + products[i].getRetailPrice());
        }
        System.out.println();
    }

    @Override
    public void sortingByProductName() {
        String[] productName = new String[lastIndex];
        for (int i = 0; i < lastIndex; i++) {
            productName[i] = this.products[i].getProduct();
        }
        Arrays.sort(productName);
        System.out.println("Sorting by product name: " + Arrays.toString(productName));
    }

    @Override
    public void sortingByManufacturer() {
        String[] manufacturer = new String[lastIndex];
        for (int i = 0; i < lastIndex; i++) {
            manufacturer[i] = this.products[i].getManufacturer();
        }
        Arrays.sort(manufacturer);
        System.out.println("Sorting by manufacturer: " + Arrays.toString(manufacturer));
    }


    @Override
    public void searchProducts(int price) {
        int count = 0;
        System.out.println("Products for " + price + ": ");
        for (int i = 0; i < lastIndex; i++) {
            if (products[i].getWholesalePrice() == price) {
                System.out.print(products[i].getProduct() + "; ");
                count++;
            }
        }
        System.out.println();
        if (count == 0)
            System.out.println("No products at a given wholesale price");
    }
}
