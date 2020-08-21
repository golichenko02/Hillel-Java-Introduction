package cycles.arrays;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(factorial("Вы хотите узнать факториал числа: "));
    }

    public static long factorial(String promt) {
        System.out.print(promt);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
