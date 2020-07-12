package test;

import homework_3.if_else.Season;

import java.util.Scanner;

public class TestSeasons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input numer of month");
        int numberMonth = scan.nextInt();
        Seasons s = null;
        switch (numberMonth){
            case 12:
            case 1:
            case 2:
                s = Seasons.WINTER;
                break;
            case 3:
            case 4:
            case 5:
                s = Seasons.SPRING;
                break;
            case 6:
            case 7:
            case 8:
                s = Seasons.SUMMER;
                break;
            case 9:
            case 10:
            case 11:
                s = Seasons.AUTUMN;
                break;
            default:
                System.out.println("POC");
        }
        System.out.println(s);
    }
}
