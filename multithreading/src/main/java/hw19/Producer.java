package hw19;


import java.util.LinkedList;

public class Producer implements Runnable {
    private final LinkedList<Product> products;
    private final int SIZE;

    public Producer(LinkedList<Product> products, int SIZE) {
        this.products = products;
        this.SIZE = SIZE;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 15; i++) {
            try {
                System.out.println(i + ".Produced: " + put());
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private Product put() throws InterruptedException {
        synchronized (products) {
            if (products.size() == SIZE) {
                products.wait();
            }

            Product product = new Product("Product-" + (int) (Math.random() * SIZE), (int) (Math.random() * 100));
            products.add(product);

            products.notifyAll();

            return product;
        }
    }
}



