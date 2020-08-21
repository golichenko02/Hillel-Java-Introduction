package exceptions;

public class Main {
    public static void main(String[] args) {
        Account bankAcc = new Account("Joker");
        Account clientAcc = new Account("Yurii");
        // clientAcc.setClosed(true);

        complexTaxOperation(bankAcc,clientAcc);

        FinanceOperations financeOperations = new FinanceOperations();

        financeOperations.withdraw(clientAcc, 50001);

    }

    private static void complexTaxOperation(Account bankAccount, Account client) {
        FinanceOperations financeOperations =  new FinanceOperations();
        try {
            financeOperations.openConnectionToBank();
            financeOperations.transfers(bankAccount, client, 500);
        } catch (IllegalStateAccount e) {
            e.printStackTrace();
            return;
        } finally {
            financeOperations.closeConnectionToBank();
        }
        financeOperations.withdraw(client, 100);
    }
}
