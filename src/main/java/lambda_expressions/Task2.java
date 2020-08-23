package lambda_expressions;
/*
 * Написать функциональный интерфейс с методом, который принимает две строки и возвращает тоже строку.
 * Написать реализацию такого интерфейса в виде лямбды,
 * которая возвращает ту строку, которая длиннее.
 */

public class Task2 {
    public static void main(String[] args) {
        StringComparable string = ((s1, s2) -> {
            if (s1.length() == s2.length()) return s1 + " " + s2;
            return s1.length() > s2.length() ? s1 : s2;
        });
        System.out.println(string.compare("Vova", "Masha"));
        System.out.println(string.compare("Vova", "Mash"));
        System.out.println(string.compare("Vova", "Mas"));
    }
}

@FunctionalInterface
interface StringComparable {
    String compare(String s1, String s2);
}
