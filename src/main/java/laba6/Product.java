package laba6;

public class Product {

    private String product;
    private String manufacturer;
    private int quantity = 0;
    private int guarantee;
    private int retailPrice;
    private int wholesalePrice;

    public Product(String product, String manufacturer, int quantity, int guarantee, int retailPrice, int wholesalePrice) {
        this.product = product;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.guarantee = guarantee;
        this.retailPrice = retailPrice;
        this.wholesalePrice = wholesalePrice;
        try {
            if (wholesalePrice > retailPrice) {
                throw new IllegalPriceException("Wholesale price cannot be more than retail");
            }
        } catch (IllegalPriceException e) {
            e.printStackTrace();
        }
    }

    public String getProduct() {
        return product;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public int getWholesalePrice() {
        return wholesalePrice;
    }
}
