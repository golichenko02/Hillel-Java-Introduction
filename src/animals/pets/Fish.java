package animals.pets;

import animals.Voice;

public class Fish extends Pet implements Voice {

    public Fish(int age, double weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color, name, isVaccinated);
    }

}
