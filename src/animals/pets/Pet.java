package animals.pets;

import animals.Animal;
import animals.Voice;


public abstract class Pet extends Animal implements Voice {
    private String name;
    private boolean isVaccinated;

    public Pet(int age, double weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    @Override
    public String toString() {
        return name;

    }

    @Override
    public String greeting() {
        if (this instanceof Cat)
            System.out.println("Meow");
        if (this instanceof Dog)
            System.out.println("Woof");
        if (this instanceof Fish)
            System.out.println("....");

        return Voice.super.greeting();

    }

}
