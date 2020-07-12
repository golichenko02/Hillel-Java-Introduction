package MultiDimensionalArrays;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}};


        replaceColumns(arr);

    }

    public static void replaceColumns(int[][] arr) {
        Scanner scan = new Scanner(System.in);
        int temp = 0;

        System.out.println("Поменять местами столбцы под номером: ");
        int colmn1 = scan.nextInt();

        System.out.println("И под номером: ");
        int colmn2 = scan.nextInt();

        System.out.println("ДО ПЕРЕСТАНОВКИ:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) { // перестановка
            temp = arr[i][colmn2 - 1];//temp = 2
            arr[i][colmn2 - 1] = arr[i][colmn1 - 1]; // 2 стало 1
            arr[i][colmn1 - 1] = temp; // 1 cтало 2

        }

        System.out.println("ПОСЛЕ ПЕРЕСТАНОВКИ:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


