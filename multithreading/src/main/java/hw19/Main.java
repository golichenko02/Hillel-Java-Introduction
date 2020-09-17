package hw19;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Product> sharedQueue = new LinkedList<>();
        int size = 3;
        Thread prodThread = new Thread(new Producer(sharedQueue, size), "Producer");
        Thread consThread = new Thread(new Consumer(sharedQueue), "Consumer");
        prodThread.start();
        consThread.start();
    }
}
