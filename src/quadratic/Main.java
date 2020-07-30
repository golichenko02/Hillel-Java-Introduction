package quadratic;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    static double a, b, c;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            inputData();
            solution();
            flag = repeat(false);
        }
    }

    private static void inputData() {
        String s = "This application solves the equation of the form [ax^2+bx+c=0], a ≠ 0. Please enter: ";
        separator(s);
        System.out.println(s);
        try {

            do {
                System.out.print("a = ");
                a = scanner.nextDouble();

            } while (a == 0);

            System.out.print("b = ");
            b = scanner.nextDouble();

            System.out.print("c = ");
            c = scanner.nextDouble();
            separator(s);
        } catch (InputMismatchException e) {
            System.out.println("Invalid number format");
            a = 0;
            b = 0;
            c = 0;
            repeat(false);
        }
    }

    private static void solution() {
        double discriminant, x1, x2;
        discriminant = (b * b) - (4 * a * c);
        if (discriminant < 0) {
            System.out.println("D = (" + b + "^2) " + "-" + " 4 * " + a + " * " + c + " = " + discriminant);
            System.out.println("Discriminant is less than 0, so this quadratic has no solution");
            System.out.println("The answer: the quadratic has no solution");
        } else if (discriminant == 0) {
            System.out.println("D = (" + b + "^2) " + "-" + " 4 * " + a + " * " + c + " = " + discriminant);
            System.out.println("Discriminant is 0, so this quadratic has one solution");
            x1 = (-b) / (2 * a);
            System.out.println("x = " + (-b) + " / " + "(2 * " + a + ") = " + x1);
            System.out.println("The answer: x1 = " + x1);
        } else if (discriminant > 0) {
            System.out.println("D = (" + b + "^2) " + "-" + " 4 * " + a + " * " + c + " = " + discriminant);
            System.out.println("Discriminant is more than 0, so this quadratic has two solution");
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1 = (" + (-b) + " - sqrt(" + discriminant + ")) / " + "(2 * " + a + ") = " + x1);
            System.out.println("x2 = (" + (-b) + " + sqrt(" + discriminant + ")) / " + "(2 * " + a + ") = " + x2);
            System.out.println("The answer: x1 = " + x1 + "; x2 = " + x2);
        }
    }

    private static boolean repeat(boolean flag) {
        System.out.print("Press 1 and enter if you want to start over or any character if you want to finish: ");
        String temp = scanner.next();
        if (isDigit(temp))
            if (Integer.parseInt(temp) == 1)
                return true;

        System.out.println("Thanks for using my app");
        return false;
    }

    private static boolean isDigit(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException | InputMismatchException e) {
            return false;
        }
    }

    private static void separator(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
