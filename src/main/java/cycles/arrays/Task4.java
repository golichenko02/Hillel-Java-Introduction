package cycles.arrays;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(inputAge("Input year of birth:"));

    }
    public static int inputAge(String promt){
        System.out.print(promt);
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        System.out.print("Your age is ");
        return 2020 - age;
    }

}
