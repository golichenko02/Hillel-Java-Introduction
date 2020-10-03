package rock_paper_scissors;

import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Rules {
    private int countOfGames;
    @Getter
    private int counter = 0;
    @Getter
    private int countOfDraws = 0;
    private Scanner scanner = new Scanner(System.in);
    private String choice = "";
    @Getter
    private Player player = new Player();
    @Getter
    private Computer computer = new Computer();

    @Getter
    private final Logger logger = LoggerFactory.getLogger(Rules.class);


    public void startGame() {
        logger.info("Player entered the game");
        System.out.println("Hi! Let's play:) Input \"exit\" if you want to stop game; ");
        inputCount();
        logger.info("Player chose {} games", countOfGames);
        while (!choice.toLowerCase().equals("exit") && counter < countOfGames) {
            Item computerChoice = computer.choice();
            System.out.println("r/R - Rock, p/P - Paper, s/S - Scissors");
            System.out.print("Your item: ");
            choice = scanner.nextLine();

            if (choice.toLowerCase().equals("exit")) {
                logger.info("Player left the game by pressing exit");
                checkScore();
                System.out.println("Game over!");
                continue;
            } else if (player.choice(choice) == Item.DEFAULT) {
                System.out.println("Wrong character, try again!");
                continue;
            }

            logger.info("Player: {}  Computer: {}", choice, computerChoice);
            System.out.println("Computer item: " + computerChoice);
            Boolean result = checkWinner(player.choice(choice), computerChoice);
            if (result == null) {
                System.out.println("Draw!");
                countOfDraws++;
            } else if (result) {
                System.out.println("YOU WON!");
                player.setScore(player.getScore() + 1);
            } else {
                System.out.println("COMPUTER WON!");
                computer.setScore(computer.getScore() + 1);
            }
            counter++;
            logger.info("Player have played {} of {} games", counter, countOfGames);
        }
    }

    private Boolean checkWinner(Item p, Item c) {
        if (p == c) return null;
        else if (p == Item.ROCK && c != Item.PAPER) return true;
        else if (p == Item.PAPER && c != Item.SCISSORS) return true;
        else if (p == Item.SCISSORS && c != Item.ROCK) return true;
        else return false;
    }

    private void checkScore() {
        System.out.println("--------SCORE---------");
        System.out.print("Computer: " + computer.getScore());
        System.out.println(" \tYou: " + player.getScore());
    }

    private void inputCount() {
        boolean b = false;
        while (!b) {
            try {
                System.out.print("Input count of games: ");
                countOfGames = new Scanner(System.in).nextInt();
                b = true;
            } catch (InputMismatchException exception) {
                System.out.println("Wrong input");
            }
        }

    }

}
