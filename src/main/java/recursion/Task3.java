package recursion;

import java.util.Arrays;
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        double[] array = randArr();
        System.out.println("Сумма элементов массива: " + sum(array, 0));
    }

    public static double sum(double[] array, int index) {
        if (index == array.length - 1) {
            return array[index];
        } else {
            return array[index] + sum(array, index + 1);
        }
    }

    public static double[] randArr() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину массива:");
        int length = scan.nextInt();
        System.out.println("Введите диапазон чисел массива(от меньшего к большему):");
        int smallest = scan.nextInt();
        int largest = scan.nextInt();
        double[] arr = new double[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random() * (largest - smallest + 1) + smallest);
        }
        System.out.println("Ваш массив чисел: " + Arrays.toString(arr));
        return arr;
    }
}
