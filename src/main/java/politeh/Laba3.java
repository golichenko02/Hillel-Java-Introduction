package politeh;

import java.util.Arrays;
import java.util.Scanner;

public class Laba3 {
    public static void main(String[] args) {
        System.out.println("Заполните массив ");
        Scanner scan = new Scanner(System.in);
        double[] arr = inputArr();
        countOfEvenNums(arr);
        maxOfOddNums(arr);

    }

    public static double[] inputArr() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите кол-во элемнтов массива: ");
        int n = scan.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + " элемент: ");
            arr[i] = scan.nextDouble();
        }
        System.out.println("Ваш массив: " + Arrays.toString(arr));
        return arr;
    }

    public static void countOfEvenNums(double[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Кол-во четных чисел: " + count);
    }

    public static void maxOfOddNums(double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }
        System.out.println("Наибольшее нечетное число: " + max);
    }
}

