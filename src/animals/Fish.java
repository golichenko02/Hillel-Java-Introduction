package animals;

public class Fish extends Pet {

    public Fish(int age, double weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color, name, isVaccinated);
    }

    @Override
    public String voice() {
        System.out.println("....");
        return super.voice();
    }
}
