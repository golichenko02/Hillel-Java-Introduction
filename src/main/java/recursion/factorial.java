package recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);

        System.out.print("Хочу узнать факториал числа: ");
        System.out.println(factorial(scan.nextInt()));

    }

    public static int factorial(int n){
        if( n == 0 || n == 1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
}
