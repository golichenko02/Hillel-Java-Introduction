package MultiDimensionalArrays;


import java.util.Scanner;

public class Task1 {
    public static int rows,columns, countOfElements = 0;

    public static void main(String[] args) {

        int[][] arr = randomArr();
        sum(arr);
        average(arr);
        countOfPositive(arr);
        minElemOfColumn(arr);
        sumOfRow(arr);
        maxElemOfRow(arr);
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
                countOfElements++;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
            System.out.println();
        }
        return arr;
    }

    public static int sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println();
        return sum;

    }

    public static void average(int[][] arr ) {

        double average = (double) sum(arr)/ countOfElements;

        System.out.println("Среднее арифметическое чисел массива: " + average);
        System.out.println();
    }

    public static void countOfPositive(int[][] arr) {
        int count = 0;
        int j = 0;
        while (j < columns) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] > 0) {
                    count++;
                }
            }
            System.out.println("Кол-во положительных чисел в " + (j+1) + " столбце: " + count);
            count = 0;
            j++;
        }
        System.out.println();

    }

    public static void minElemOfColumn(int[][] arr){
        int j =0;
         while (j < columns){
             int min = arr[0][j];
             for (int i = 0; i <arr.length ; i++) {
                 if(arr[i][j] < min){
                     min = arr[i][j];
                 }
             }
             System.out.println("Минимальный элемент в " + (j+1) + " столбце: " + min);
             j++;
         }
        System.out.println();
    }

    public static void sumOfRow(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                sum += arr[i][j];
            }
            System.out.println("Сумма элементов " + (i+1) + " строки: " + sum);
            sum = 0;
        }
        System.out.println();
    }

    public static void maxElemOfRow(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 0; j < arr[i].length ; j++) {
                if(arr[i][j] > max ){
                    max = arr[i][j];
                }
            }
            System.out.println("Максимальный элемент в " + (i+1) + " строке: " + max);
        }
        System.out.println();
    }
}

