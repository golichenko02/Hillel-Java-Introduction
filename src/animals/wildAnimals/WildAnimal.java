package animals.wildAnimals;


import animals.Animal;
import animals.Voice;

public abstract class WildAnimal extends Animal implements Voice {
    private boolean isPredator;

    public WildAnimal(int age, double weight, String color, boolean isPredator) {
        super(age, weight, color);
        this.isPredator = isPredator;
    }

    @Override
    public String greeting() {
        return isPredator ? Voice.super.greeting() + " and I am angry " : Voice.super.greeting();
    }
}
