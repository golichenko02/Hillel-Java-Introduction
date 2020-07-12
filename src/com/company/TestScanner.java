package com.company;
import java.util.Scanner;
public class TestScanner {
    public static void main(String[] args) {
        System.out.print("Введите число и я его удвою:");
        Scanner scan = new Scanner(System.in);
        Scanner ph = new Scanner(System.in);
        float x = scan.nextInt();
        float y = 2*x;
        System.out.println("Y is "+y);
        System.out.println("А теперь дополните предложение \"Я обожаю, когда...\" ");
        String phrase = ph.nextLine();
        System.out.println("Я обожаю когда "+phrase);
        System.out.println("Спасибо за внимание, челодой моловек;)");

    }
}
