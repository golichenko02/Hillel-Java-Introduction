package politeh;

import java.util.Arrays;
import java.util.Scanner;

public class Laba3_1 {
    public static void main(String[] args) {
        int [] arrInput = inputArr();
        doublingOdd(arrInput);



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

    public static int [] doublingOdd(int[] array){

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 1){
                array[i] *=2;
            }
            else{
                for ( int j = i; j < array.length; j++){
                    if(array[j] % 2 == 1){
                        array[i] +=array[j];
                        break;
                    }

                }
            }
        }
        System.out.println("Ваш массив после манипуляций: " + Arrays.toString(array));
        return array;
    }
}
