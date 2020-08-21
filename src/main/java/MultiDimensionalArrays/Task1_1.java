package MultiDimensionalArrays;


public class Task1_1 {
    public static int countOfElemments = 0;

    public static void main(String[] args) {
        int[][] arr = {{10, 10, 10},
                       {10, 10, 10, 20},
                       {10, 10, 20, 20, 30}};
        int sum = sum(arr);
        average(arr);
        countOfPositiveInColumn(arr);

    }

    public static void countOfPositiveInColumn(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[j][i] > 0){
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }


    public static int sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                countOfElemments++;
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println();
        return sum;
    }

    public static void average(int[][] arr) {
        double average = (double)  sum(arr) / countOfElemments;
        System.out.println("Cреднее арифметическое Вашего массива: " + average);
    }


}
