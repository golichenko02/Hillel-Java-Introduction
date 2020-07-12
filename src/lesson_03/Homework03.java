package lesson_03;

import java.util.Arrays;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
//         1.При помощи цикла for вывести на экран нечетные числа от 1 до 99.
        oddNumbers();
//        2. Дано число n при помощи цикла for посчитать факториал n!
        System.out.println("Результат: " + factorial("\nВы хотите узнать факториал числа: "));
//        3.Перепишите программы с использованием цикла while.
        oddNumbersWhile();
        System.out.println("Результат: " + factorialWhile("\nВы хотите узнать факториал числа: "));
//        4.Перепишите программы с использованием цикла do - while.
        oddNumbersDoWhile();
        System.out.println("Результат: " + factorialDoWhile("\nВы хотите узнать факториал числа: "));
//        5.Даны переменные x и n вычислить x^n.
        System.out.println(power(2, 3));
//        6.Вывести 10 первых чисел последовательности 0, -5,-10,-15..
        sequence();
//        7.Необходимо вывести на экран таблицу умножения на Х: (любое число вводимое из консоли)
        multiTable(12);
//        8.Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.
        firstOddNumArr();
//        9.Дан массив размерности N, найти наименьший элемент массива и вывести на консоль (если наименьших элементов несколько — вывести их все).
//        10.В массиве из задания 9. найти наибольший элемент.
        searchMinAndMax();
//        11.Поменять наибольший и наименьший элементы массива местами.
        replaceMinAndMax(fillArr());
//        12.Найти среднее арифметическое всех элементов массива.
        average(fillArr());
//        13.(*)Вывести на экран шахматную доску 8х8 в виде 2 мерного массива (W - белые клетки , B - черные клети)
        chessBoard(8, 8);
    }

    public static void oddNumbers() {
        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static long factorial(String promt) {
        System.out.print(promt);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void oddNumbersWhile() {
        int i = 1;
        while (i < 100) {
            System.out.print(i + " ");
            i += 2;
        }
    }

    public static long factorialWhile(String promt) {
        System.out.print(promt);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }

    public static void oddNumbersDoWhile() {
        int i = 1;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i < 100);
    }

    public static long factorialDoWhile(String promt) {
        System.out.print(promt);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), i = 1;
        ;
        long result = 1;
        do {
            result *= i;
            i++;
        } while (i <= n);
        return result;
    }

    public static double power(double x, double n) {
        System.out.print(x + " в степени " + n + " = ");
        return Math.pow(x, n);
    }

    public static void sequence() {
        int n = 0;
        System.out.print("Последовательность: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(n + " ");
            n -= 5;
        }
    }

    public static void multiTable(double x) {
        System.out.println("\nТаблица умножения на " + x);
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + x * i);
        }
    }

    public static void firstOddNumArr() {
        int[] oddNums = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        System.out.println("Массив, содержащий 10 первых нечетных чисел: " + Arrays.toString(oddNums));
    }

    public static int[] fillArr() {
        int m;
        int n = (int) (Math.random() * 10) + 5;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            m = 1;
            if (i % 2 == 0)
                m = -1;
            arr[i] = (int) (Math.random() * 100 * m);
        }
        System.out.println("Массив чисел: " + Arrays.toString(arr));
        return arr;
    }

    public static void searchMinAndMax() {
        int[] arr = fillArr();
        int min = arr[0], max = arr[0], index;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max)
                max = i;
        }
        System.out.println("Min: " + min + "\tMax: " + max);
    }

    public static void replaceMinAndMax(int[] arr) {
        int min = arr[0], max = arr[0], indexMin = 0, indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                indexMin = i;
            }

            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }

            arr[indexMin] = max;
            arr[indexMax] = min;
        }
        System.out.println("После перестановки мин и макс значений местами: " + Arrays.toString(arr));
    }

    public static void average(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Cреднее арифм. значений этого массива: " + (double) sum / arr.length);
    }

    public static void chessBoard(int width, int height) {
        System.out.print("\n   A  B  C  D  E  F  G  H \n ");
        for (int i = 0; i < width * 1.5; i++) {
            System.out.print("__");
        }
        System.out.println();
        for (int i = 1; i <= height; i++) {
            System.out.print(i + "|");
            for (int j = 1; j <= width; j++) {
                if ((j % 2 == 0 && i % 2 == 0) || (j % 2 != 0 && i % 2 != 0))
                    System.out.print(" W ");
                else
                    System.out.print(" B ");
            }
            System.out.println();
        }
    }
}