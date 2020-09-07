package rock_paper_scissors;

import lombok.Getter;
import lombok.Setter;

public class Player {
    @Setter
    @Getter
    private int score;

    public Item choice(String choice) {
        if (choice.toLowerCase().equals("r")) return Item.ROCK;
        if (choice.toLowerCase().equals("s")) return Item.SCISSORS;
        if (choice.toLowerCase().equals("p")) return Item.PAPER;

        return Item.DEFAULT;
    }
}
