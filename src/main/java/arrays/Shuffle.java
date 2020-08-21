package arrays;

import java.util.Arrays;
import java.util.Collections;

public class Shuffle {
    public static void main(String[] args) {
        String[] deck = {"AS", "KS", "QS", "JS", "10S", "9S", "8S", "7S", "6S", "5S", "4S", "3S", "2S", "AH", "KH", "QH",
                "JH", "10H", "9H", "8H", "7H", "6H", "5H", "4H", "3H", "2H", "AD", "KD", "QD", "JD", "10D", "9D", "8D", "7D",
                "6D", "5D", "4D", "3D", "2D", "AC", "KC", "QC", "JC", "10C", "9C", "8C", "7C", "6C", "5C", "4C", "3C", "2C"};

        shuffle(deck);

    }

    public static void shuffle(String[] deck) {
        int a = 0;
        int b = deck.length - 1;

        for (int i = 0; i < deck.length; i++) {
            int j = (int) ((Math.random() * (b - a + 1) + a));

            String temp = deck[j];
            deck[j] = deck[i];
            deck[i] = temp;
        }
        System.out.println(Arrays.toString(deck));
    }

}
