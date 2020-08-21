package Godzilla;

import java.util.Scanner;

public class GodzillaEmulator {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Godzilla player1 = new Godzilla();


        System.out.println("It's time to eat!");
        do {
            System.out.print("Portion: ");
            int someVolume = scan.nextInt();
            player1.eat(someVolume);
        }
        while (!player1.isFull());
        System.out.print("I'm full, thanks: " + player1.getStomachCapacityManipulative());
    }
}
