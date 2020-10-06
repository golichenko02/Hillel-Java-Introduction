package rock_paper_scissors;

import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.ResourceBundle;
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
    private Player player;
    @Getter
    private Computer computer = new Computer();

    @Getter
    private ResourceBundle resourceBundle;


    @Getter
    private final Logger logger = LoggerFactory.getLogger(Rules.class);

    public Rules(ResourceBundle resourceBundle) {
        this.resourceBundle = resourceBundle;
        player = new Player(resourceBundle);
    }

    public void startGame() {
        logger.info("Player entered the game");
        System.out.println(resourceBundle.getString("greeting"));
        inputCount();
        logger.info("Player chose {} games", countOfGames);
        while (!(choice.toLowerCase().equals(resourceBundle.getString("exit"))) && counter < countOfGames) {
            Item computerChoice = computer.choice();
            System.out.println(resourceBundle.getString("rules"));
            System.out.print(resourceBundle.getString("playerItem"));
            choice = scanner.nextLine();

            if (choice.toLowerCase().equals(resourceBundle.getString("exit"))) {
                logger.info("Player left the game by pressing exit");
                System.out.println(resourceBundle.getString("end"));
                continue;
            } else if (player.choice(choice) == Item.DEFAULT) {
                System.out.println(resourceBundle.getString("wrongItem"));
                continue;
            }

            logger.info("Player: {}  Computer: {}", choice, computerChoice);
            System.out.println(resourceBundle.getString("computerItem") + resourceBundle.getString(computerChoice.toString()));
            Boolean result = checkWinner(player.choice(choice), computerChoice);
            if (result == null) {
                System.out.println(resourceBundle.getString("draw"));
                countOfDraws++;
            } else if (result) {
                System.out.println(resourceBundle.getString("playerWin"));
                player.setScore(player.getScore() + 1);
            } else {
                System.out.println(resourceBundle.getString("computerWin"));
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

    public void checkScore() {
        System.out.println(resourceBundle.getString("score"));
        System.out.print(resourceBundle.getString("computer") + computer.getScore());
        System.out.println(" \t" + resourceBundle.getString("you") + player.getScore());
    }

    private void inputCount() {
        boolean b = false;
        while (!b) {
            try {
                System.out.print(resourceBundle.getString("countOfGames"));
                countOfGames = new Scanner(System.in).nextInt();
                b = true;
            } catch (InputMismatchException exception) {
                System.out.println(resourceBundle.getString("exception"));
            }
        }

    }

}
