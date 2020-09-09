package hw18;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account();
        FirstThread firstThread = new FirstThread(account);
        SecondThread secondThread = new SecondThread(account);
        ThirdThread thirdThread = new ThirdThread(account);
        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }

}

class FirstThread extends Thread {
    Account account;

    public FirstThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 10; i < 100; i += 10) {
            account.refill(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SecondThread extends Thread {
    Account account;

    public SecondThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 10; i < 100; i += 10) {
            account.withdrawal(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThirdThread extends Thread {
    Account account;

    public ThirdThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 10; i < 100; i += 10) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.withdrawal(i * 3);
            account.refill(i*2);
        }
    }
}
