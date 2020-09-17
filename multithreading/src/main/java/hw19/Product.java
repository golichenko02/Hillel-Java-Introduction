package hw19;

import lombok.Data;

@Data
public class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
