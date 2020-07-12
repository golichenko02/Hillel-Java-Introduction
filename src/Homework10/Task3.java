package Homework10;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        double[] firstArr = {10, 8, 6, 20, 12};
        double[] secondArr = {5, 3, 4 ,8, 0};
        System.out.println(Arrays.toString(divArrays(firstArr, secondArr)));

    }

    public static double[] divArrays(double[] firstArr, double[] secondArr) {
        if (firstArr.length > secondArr.length) {
            double[] newArr = firstArr;
            return newArr;
        } else if (firstArr.length < secondArr.length) {
            double[] newArr = secondArr;
            return newArr;
        } else {
            double[] newArr = new double[firstArr.length];
            int indexNew = 0, index = 0;
            for (double j : secondArr) {
                if (j == 0) {
                    index++;
                    indexNew++;
                    continue;
                } else {
                    newArr[indexNew] =firstArr [index] /j;
                    index++;
                    indexNew++;
                }
            }
            return newArr;  
        }
    }
}



