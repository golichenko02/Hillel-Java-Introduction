package animals.pets;

import animals.IVoice;

public class Fish extends Pet implements IVoice {

    public Fish(int age, double weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color, name, isVaccinated);
    }

}
