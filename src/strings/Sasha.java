package strings;

import java.util.Scanner;

public class Sasha {
    public static void main(String[] args) {
        /**  Задані два рядки. Скласти третій рядок символів, які однакові в першому
         *   та у другому рядках і знаходяться на однакових позиціях.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string 1: ");
        String s1 = scanner.nextLine();

        System.out.print("Input string 2: ");
        String s2 = scanner.nextLine();

        search(s1,s2);

    }

    private static void search(String s1, String s2) {
        System.out.println("First string: " + s1);
        System.out.println("Second string: " + s2);

        String result = "";
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && i == j) {
                    result += arr1[i];
                }
            }
        }
       if (result != ""){
           System.out.println("Результат: " + result);
       } else{
           System.out.println("No match");
       }
    }
}
