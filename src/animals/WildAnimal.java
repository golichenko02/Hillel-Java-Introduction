package animals;


public abstract class WildAnimal extends Animal {
    private boolean isPredator;

    public WildAnimal(int age, double weight, String color, boolean isPredator) {
        super(age, weight, color);
        this.isPredator = isPredator;
    }


    @Override
    public String voice() {
        if (isPredator)
            return super.voice() + " I am a wild animal and I am angry";
        return super.voice() + " I am a wild animal";

    }
}
