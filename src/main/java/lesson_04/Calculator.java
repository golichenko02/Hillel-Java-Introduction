package lesson_04;

public class Calculator {

    public static void main(String[] args) {
        calc(4, "*", 4);
        calc(4, "-", 4);
        calc(4, "+", 4);
        calc(4, "/", 4);
        calc(4, "/", 0);
        calc(4, "l", 0);
    }

    public static void calc(int a, String sign, int b) {
        switch (sign) {
            case "+":
                System.out.println(add(a, b));
                break;
            case "-":
                System.out.println(sub(a, b));
                break;
            case "*":
                System.out.println(mul(a, b));
                break;
            case "/":
                System.out.println(div(a, b));
                break;
            default:
                System.out.println("only +, -, *, /");
        }
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static int mul(int a, int b) {
        return a * b;
    }

    private static int div(int a, int b) {
        return b == 0 ? 0 : a / b;
    }


}
