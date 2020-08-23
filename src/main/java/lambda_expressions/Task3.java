package lambda_expressions;

/**
 * Написать функциональный интерфейс с методом,
 * который принимает три дробных числа: a, b, c и возвращает тоже дробное число.
 * Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает дискриминант.
 * Кто забыл, D = b^2 — 4ac.
 */
public class Task3 {
    public static void main(String[] args) {
        CalcDiscriminant discriminant = ((a, b, c) -> Math.pow(b, 2) - 4 * a * c);
        System.out.println(discriminant.calc(1D, -9D, 18D));//9
        System.out.println(discriminant.calc(1D, -70D, 600D));//2500
        System.out.println(discriminant.calc(3D, -18D, 27D));//0
    }
}

@FunctionalInterface
interface CalcDiscriminant {
    Double calc(Double a, Double b, Double c);
}
