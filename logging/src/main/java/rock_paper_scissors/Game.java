package rock_paper_scissors;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Game {
    static Rules rules = new Rules();
    static Integer count = 0;

    public static void main(String[] args) {

        rules.startGame();
        rules.getLogger().info("Game over!");
        saveResult();
    }

    private static void saveResult() {
        File filePath = new File("C:\\Users\\38063\\IdeaProjects\\HomeworkIntro\\logging\\src\\main\\java\\rock_paper_scissors\\gameResult.txt");
        try (FileOutputStream fos = new FileOutputStream(filePath, true);
             PrintStream printStream = new PrintStream(fos)) {
            printStream.println();
            printStream.printf("You have played %d games\n", rules.getCounter());
            printStream.println("-----Score-----");
            printStream.printf("Draws:%d Computer:%d  Player: %d\n", rules.getCountOfDraws(), rules.getComputer().getScore(), rules.getPlayer().getScore());
            printStream.println();
            System.out.println("The result has been written");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
