package rock_paper_scissors;

import lombok.Getter;
import lombok.Setter;

public class Computer {
    @Setter
    @Getter
    private int score;

    public Item choice() {
        Item[] items = {Item.ROCK, Item.PAPER, Item.SCISSORS};
        return items[(int) (Math.random() * 3)];
    }
}

