package animals.wildAnimals;


import animals.Animal;
import animals.IVoice;

public abstract class WildAnimal extends Animal implements IVoice {
    private boolean isPredator;

    public WildAnimal(int age, double weight, String color, boolean isPredator) {
        super(age, weight, color);
        this.isPredator = isPredator;
    }

    @Override
    public String greeting() {
        return isPredator ? IVoice.super.greeting() + " and I am angry " : IVoice.super.greeting();
    }
}
