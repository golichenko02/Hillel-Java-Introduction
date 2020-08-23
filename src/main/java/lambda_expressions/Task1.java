package lambda_expressions;
/*Написать функциональный интерфейс с методом, который принимает число и
 * возвращает булево значение. Написать реализацию
 * такого интерфейса в виде лямбда-выражения,
 * которое возвращает true если переданное число делится без остатка на 13.
 */
public class Task1 {
    public static void main(String[] args) {
        DivBy13 result = num -> num % 13 == 0;
        System.out.println(result.resultDivBy13(13));//true
        System.out.println(result.resultDivBy13(25));//false
        System.out.println(result.resultDivBy13(26));//true
        System.out.println(result.resultDivBy13(39));//true
        System.out.println(result.resultDivBy13(10));//false
    }
}

@FunctionalInterface
interface DivBy13 {
    boolean resultDivBy13(int num);
}
