package MultiDimensionalArrays;

import java.util.Scanner;

public class Task3 {
    public static int rows, columns;

    public static void main(String[] args) {
        int [][] arr = randomArr();

        highestSumOfColumn(arr);

    }

    public static void highestSumOfColumn(int[][] arr){
        int sum = 0, sum1 = 0, index = 0;
        for (int j = 0; j < columns; j++){
            for ( int i = 0; i < rows; i++) {
                sum += arr[i][j];
            }
            if(sum > sum1){
                sum1 = sum;
                index = j;
            }
            sum  = 0;
        }
        System.out.println("Наибольшая сумма элементов в столбце №" + (index+1) + " и она равна: " + sum1);
    }

    public static int[][] randomArr() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите кол-во строк: ");
        rows = scan.nextInt();


        System.out.println("Введите кол-во столбцов: ");
        columns = scan.nextInt();


        System.out.println("Введите диапазон чисел массива(от меньшего к большему):");
        int smallest = scan.nextInt();
        int largest = scan.nextInt();
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = (int) (Math.random() * (largest - smallest + 1) + smallest);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
            System.out.println();
        }
        return arr;
    }

}
