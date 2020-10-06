package rock_paper_scissors;

import lombok.Getter;
import lombok.Setter;

import java.util.ResourceBundle;

public class Player {
    @Setter
    @Getter
    private int score;
    private ResourceBundle resourceBundle;

    public Player(ResourceBundle resourceBundle) {
        this.resourceBundle = resourceBundle;
    }

    public Item choice(String choice) {
        if (choice.toLowerCase().equals(resourceBundle.getString("r"))) return Item.ROCK;
        if (choice.toLowerCase().equals(resourceBundle.getString("s"))) return Item.SCISSORS;
        if (choice.toLowerCase().equals(resourceBundle.getString("p"))) return Item.PAPER;

        return Item.DEFAULT;
    }
}
