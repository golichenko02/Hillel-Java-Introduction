package politeh;

import java.util.Arrays;
import java.util.Scanner;

public class Laba3_2 {
    public static void main(String[] args) {
        int [] array = inputArr();
        minPositiveNum(array);


    }

    public static int[] inputArr() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите кол-во элемeнтов массива: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + " элемент: ");
            arr[i] = scan.nextInt();
        }
        System.out.println("Ваш массив: " + Arrays.toString(arr));
        return arr;
    }

    public static void minPositiveNum(int[] arr){
        long min = 999999999999999999l;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
        }
        System.out.println("Наименьшое позитивное число: " + min);
    }
}
