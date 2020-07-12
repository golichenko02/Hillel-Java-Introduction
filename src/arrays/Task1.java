package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int[] array = randomArray();
        int sum = sum(array);
        average(sum, array);
        countOfPositiveNegativeNull(array);
        sumOfPositveAndNegative(array);
        replaceFirstAndLast(array);
        int indexMax = indexMaximum(array);
        int indexMin = indexMinimum(array);
        replaceMaxAndMin(array);


    }

    public static int[] randomArray() { //заполнение массива случайными числами в заданом пользователем диапазоне
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину массива:");
        int length = scan.nextInt();
        System.out.println("Введите диапазон чисел массива(от меньшего к большему):");
        int smallest = scan.nextInt();
        int largest = scan.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (largest - smallest + 1) + smallest);
        }
        System.out.println("Ваш массив чисел: " + Arrays.toString(arr));
        return arr;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма элементов массива: " + sum);
        return sum;
    }

    public static void average(int sum, int[] array) {
        float aver = (float) sum / array.length;
        System.out.println("Среднее арифметическое чисел массива: " + aver);
    }

    public static void countOfPositiveNegativeNull(int[] array) {
        int countPositive = 0, countNegative = 0, countNull = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countPositive++;
            } else if (array[i] == 0) {
                countNull++;
            } else {
                countNegative++;
            }
        }
        System.out.println("Кол-во положительных чисел: " + countPositive);
        System.out.println("Кол-во отрицательных чисел: " + countNegative);
        System.out.println("Кол-во нулей: " + countNull);
    }

    public static void sumOfPositveAndNegative(int[] array) {
        int sumPositive = 0;
        int sumNegative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sumNegative += array[i];
            } else if (array[i] > 0) {
                sumPositive += array[i];
            }
        }
        System.out.println("Сумма положительных чисел: " + sumPositive);
        System.out.println("Сумма отрицательных чисел: " + sumNegative);
    }

    public static void replaceFirstAndLast(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp = array[array.length - 1];
            array[array.length - 1] = array[0];
            array[0] = temp;
        }
        System.out.println("Массив чисел после после перестановки первого и последнего элемента: " + Arrays.toString(array));
    }

    public static int indexMaximum(int[] array) {
        int max = array[0], indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            }
        }
        System.out.println("Индекс наибольшего числа: " + indexMax);
        return indexMax;
    }

    public static int indexMinimum(int[] array) {
        int min = array[0], indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                indexMin = i;
            }
        }
        System.out.println("Индекс наименьшего числа: " + indexMin);
        return indexMin;
    }

    public static void replaceMaxAndMin(int[] array) {
        int min = array[0];
        int max = array[0];
        int indexMin = 0;
        int indexMax = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                indexMin = i;
            }
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            }
        }
        array[indexMin] = max;
        array[indexMax] = min;
        System.out.println("Массив чисел после после перестановки индексов минимального с максимальным значением" + Arrays.toString(array));
    }
}
