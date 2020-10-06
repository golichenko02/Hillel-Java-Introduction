package rock_paper_scissors;

import rock_paper_scissors.utf8.UTF8Control;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.ResourceBundle;

public class Game {
    static Rules rules;
    static Integer count = 0;

    public static void main(String[] args) {
        rules = new Rules(ResourceBundle.getBundle("Messages", new Locale(args[0]), new UTF8Control()));
        rules.startGame();
        rules.checkScore();
        rules.getLogger().info("Game over!");
        saveResult();
    }

    private static void saveResult() {
        File filePath = new File("C:\\Users\\38063\\IdeaProjects\\HomeworkIntro\\logging\\src\\main\\java\\rock_paper_scissors\\gameResult.txt");
        try (FileOutputStream fos = new FileOutputStream(filePath, true);
             PrintStream printStream = new PrintStream(fos)) {
            printStream.println();
            printStream.printf( rules.getResourceBundle().getString("countOfPlayedGames"), rules.getCounter());
            printStream.println(rules.getResourceBundle().getString("score"));
            printStream.printf(rules.getResourceBundle().getString("draws") + "%d " +
                    rules.getResourceBundle().getString("computer") + "%d " +
                    rules.getResourceBundle().getString("player") + "%d\n",
                    rules.getCountOfDraws(), rules.getComputer().getScore(), rules.getPlayer().getScore());
            printStream.println();
            System.out.println(rules.getResourceBundle().getString("textRecord"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
