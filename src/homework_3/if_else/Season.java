package homework_3.if_else;

import java.util.Scanner;

public class Season {
    public static int number_of_month;

    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose what  you want to test:");
        System.out.println("1.switch");
        System.out.println("2.if else");
        switch (number = scan.nextInt()) {
            case 1:
                System.out.println("Input number of month");
                whatSeason1();
                break;
            case 2:
                System.out.println("Input number of month");
                whatSeason2();
                break;
            default:
                System.out.println("Choose 1 or 2");
        }
    }

    public static void whatSeason1() {
        Scanner scan = new Scanner(System.in);
        switch (number_of_month = scan.nextInt()) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;

            default:
                System.out.println("Input number from 1 to 12");
                break;
        }
    }

    public static void whatSeason2() {
        Scanner sc = new Scanner(System.in);
        number_of_month = sc.nextInt();
        if (number_of_month > 0 && number_of_month < 3 || number_of_month == 12) {
            System.out.println("Winter");
        } else if (number_of_month >= 3 && number_of_month < 6) {
            System.out.println("Spring");
        } else if (number_of_month >= 6 && number_of_month < 9) {
            System.out.println("Summer");
        } else if (number_of_month >= 9 && number_of_month < 12) {
            System.out.println("Autumn");
        } else {
            System.out.println("Input number from 1 to 12");
        }
    }
}
