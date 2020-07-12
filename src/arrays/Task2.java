package arrays;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j) {
                    System.out.print("x");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();

        }

    }
}
