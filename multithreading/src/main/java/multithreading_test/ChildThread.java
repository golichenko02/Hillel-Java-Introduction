package multithreading_test;

public class ChildThread extends Thread {
    public ChildThread(String name) {
        super(name);
    }


    @Override
    public void run() {
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter = 1; // счетчик циклов

        try {
            while (!isInterrupted()) {
                System.out.println("Loop " + counter++);
                System.out.println("isAlive - " + isAlive());
                Thread.sleep(1);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}
