package Homework10;

public class Task2 {
    public static void main(String[] args) {

        char[] arr1 = {'=', 2, 3, 4};
        char[] arr2 = {'=', 2, 3, };
        System.out.println(" Cодержимое массивов равно? " + isEqual(arr1, arr2));

        double[] arr3 = {1.2, 1.6};
        double[] arr4 = {1.2, 1.5};
        System.out.println(" Cодержимое массивов равно? " + isEqual(arr3, arr4));
    }
/*
Не накладывал условия на длину массивов, то есть если длины не равны то сразу false.
А рассмотрел вариант, что если содержимое меньшего массива является подмножеством содержимого большего массива тогда тоже true.
 */
    public static boolean isEqual(char[] arr1, char[] arr2) {
        int count = 0;
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) {
                    count++;
                    break;
                }
            }
        }
        if (count == arr1.length || count == arr2.length) {
            return true;
        }
        return false;
    }

    public static boolean isEqual(double[] arr1, double[] arr2) {
        int count = 0;
        for (double i : arr1) {
            for (double j : arr2) {
                if (i == j) {
                    count++;
                    break;
                }
            }
        }
        if (count == arr1.length || count == arr2.length) {
            return true;
        }
        return false;
    }
}