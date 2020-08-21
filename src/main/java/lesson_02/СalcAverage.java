package lesson_02;

import java.util.ArrayList;
import java.util.Scanner;

public class СalcAverage {
    public static void main(String[] args) {
        System.out.println(averageTwoNum(5, 4)); // ср.арифм. двух чисел
        System.out.println(average()); //ср. арифм. произвольного кол-ва чисел
    }

    public static double averageTwoNum(double var1, double var2) {
        return (var1 + var2) / 2;
    }

    public static double average() {
        double sum = 0;
        int count = 0;
        for (double num : inputData()) {
            sum += num;
            count++;
        }
        return sum / count;
    }


    private static ArrayList<Double> inputData() {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        System.out.print("Input the count of numbers:");

        if (scan.hasNextInt()) {
            do {
                count = scan.nextInt();
            } while (count <= 0);
        } else {
            System.out.println("Count is integer num. Repeat please.");
        }

        ArrayList <Double> nums = new ArrayList<>();
        System.out.println("Input numbers through ENTER");
        while (nums.size() < count){
            if(scan.hasNextDouble())
                nums.add(scan.nextDouble());
            else {
                System.out.println("The last variable is not a number.Average results for last "
                        +  nums.size() + " number(s)");
                break;
            }
        }
        return nums;
    }
}