package captcha;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        boolean b = false;
        System.out.print("Input numbers: ");
        while (!b) {
            Scanner scanner = new Scanner(System.in);
            b = new Draw().print(scanner.nextLine());
        }
    }
}

