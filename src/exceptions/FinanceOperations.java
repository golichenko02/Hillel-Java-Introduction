package exceptions;

public class FinanceOperations {

    public void openConnectionToBank(){
        System.out.println("Connection has been opened");
    }

    public void withdraw(Account acc, int amount){
        if (amount > 10000){
            throw  new  IllegalAmountWithdrawException("Amount is huge");
        }
        System.out.println("Tax has been withdrawn");
    }

    public void transfers(Account acc1, Account acc2, int amount) throws IllegalStateAccount {
        if(acc1.isClosed() || acc2.isClosed()){
            throw new IllegalStateAccount("One of being transfered account has been closed");
        }

        System.out.println("Amount has been transferred successfully");

    }

    public void closeConnectionToBank(){
        System.out.println("Connection has been closed");
    }
}
