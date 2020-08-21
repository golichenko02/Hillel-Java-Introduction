package stream;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int filter = 5;

        fillCollection(numbers);
        System.out.println("Элементы коллекции: " + numbers);

        for (int i = 0; i < filter; i++) {
            System.out.print(isEven(numbers.get(i)) ? numbers.get(i) + ";" : "");
        }


    }

    public static boolean isEven(Integer num) {
        return num % 2 == 0;
    }

    public static void fillCollection(ArrayList<Integer> nums) {
        for (int i = 0; i < 15; i++) {
            nums.add((int) (Math.random() * 20) + 1);
        }
    }


}
