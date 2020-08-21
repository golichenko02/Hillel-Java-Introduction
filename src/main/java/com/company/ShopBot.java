package com.company;

public class ShopBot {

    public static void main(String[] args) {
        goToShop();

        int budget = 250;
        int totalPrice = 0;

        totalPrice += buy("Max mouse", 10);
        totalPrice += buy("Keyboard", 40);
        totalPrice += buy("Organizer", 20);
        totalPrice += buy("LCD monitor", 160);

        if (budget - totalPrice >= 40) {
            totalPrice = totalPrice + buy("web-cam", 40);
        } else {
            System.out.println("Not enough money to buy this web-cam!");
        }

        System.out.println("Overall price is " + totalPrice);
        System.out.println("Reminder is " + (budget - totalPrice));
        goBackHome();
    }

    public static int buy(String item, int price) {
        putToCart(item, price);
        return pay(item, price);
    }

    public static void putToCart(String item, int price) {
        System.out.println("Put to my cart: " + item + " with price = " + price);
        if(price<=150){
            System.out.println( "Black Friday !!!");
            System.out.println("You will receive a 20 percent discount on this product.");
            System.out.println("Choose more items up to  150$ and get a discount.");
        }
    }

    public static int pay(String item, int price) {
        if (price <= 150) {
            price -= price * 0.2;
        }

        System.out.println("The item: " + item + " has been paid.");
        System.out.println("Current price was " + price);
        return price;
    }

    public static void goToShop() {
        System.out.println("Going make shopping.");
    }

    public static void goBackHome() {
        System.out.println("Will be home soon.");
    }
}