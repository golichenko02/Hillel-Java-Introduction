package MultiDimensionalArrays;

public class Task3_1 {
    public static void main(String[] args) {
        int[][] arr = { {10, 20, 30},
                {10, 20, 30},
                {10, 20, 30}};
        maxSumOfColumn(arr);

    }

    public static void maxSumOfColumn(int[][] arr){
        int sum = 0, sum1 = 0 , index = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <arr[i].length ; j++) {
                sum += arr[j][i];
            }
            if(sum > sum1){
                sum1 = sum;
                index = i;
            }
            sum = 0;
        }
        System.out.println("Наибольшая сумма элементов в столбце №" + (index+1) + " и она равна: " + sum1);

    }
}
