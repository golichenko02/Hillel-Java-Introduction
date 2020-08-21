package lesson_02;

public class DepositCalculator {
    public static void main(String[] args) {
        calc(2500,10,4);
    }

    public static void calc(double sum, double percentage,int duration){
        System.out.println("Deposit amount: " + sum);
        for (int i = 0; i < duration ; i++) {
            System.out.print(i+1 + " year: Accrued interest: " + (sum * percentage * (i+1) / 100) + '(' + percentage * (i+1) +"%)");
            System.out.println("\t| Accumulated amount: " + (sum + (sum * percentage * (i+1) / 100)));
        }
    }
}
