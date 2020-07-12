package cycles.arrays;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        whatCentury("Введите год(от 1 до 2018), чтобы узнать столетие: ");

    }

    public static void whatCentury(String promt) {
        System.out.print(promt);
        Scanner scan = new Scanner(System.in);
        int year;
        do {
            year = scan.nextInt();
        } while (year < 0 || year > 2018);


        while (year > 0 && year < 2019) {
            if ((year % 100) == 0) {
                int century = (int) year / 100;
                System.out.println(century);
                break;

            } else {
                int century = (int) year / 100;
                century++;
                System.out.println(century);
                break;
            }
        }
    }
}
