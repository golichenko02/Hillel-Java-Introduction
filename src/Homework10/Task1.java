package Homework10;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] dollars = {25, 5, 7, 9, 10};
        System.out.println(Arrays.toString(convert(dollars)));
    }

    public static int[] convert(int[] dollars) {
        final int RATE = 27;
        int[] newValue = new int[dollars.length];
        int newVal = 0;
        for (int i : dollars) {
            newValue[newVal] = i * RATE;
            newVal++;
        }
        return newValue;
    }
}
