package hw19;

import java.util.LinkedList;

public class Consumer implements Runnable {
    private final LinkedList<Product> products;

    public Consumer(LinkedList<Product> products) {
        this.products = products;
    }


    @Override
    public void run() {
        for (int i = 1; i <= 15; i++) {
            try {
                System.out.println(i + ".Consumed: " + get());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private Product get() throws InterruptedException {
        synchronized (products) {
            if (products.isEmpty()) {
                products.wait();
            }

            products.notifyAll();
            return products.removeFirst();
        }
    }
}
