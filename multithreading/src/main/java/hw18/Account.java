package hw18;

public class Account {
    private int balance = 10;

    public synchronized void refill(int amount) { //пополнение
        if (amount <= 0) return;
        balance += amount;
        System.out.println("Пополнено на " + amount + "$\tБаланс аккаунта: " + balance);
    }

    public synchronized void withdrawal(int amount) { //снятие
        if (amount <= 0) return;
        if (amount > balance) {
            System.out.println("Недостаточно средств для снятия. Баланс: " + balance
                    + "$\tЗапрашиваемая сумма: " + amount);
            return;
        }
        balance -= amount;
        System.out.println(amount + "$ снято. \tБаланс: " + balance + "$");
    }

    public int getBalance() {
        return balance;
    }
}
