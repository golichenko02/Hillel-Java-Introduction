package animals;

public class Cat extends Pet {
    public Cat(int age, double weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color, name, isVaccinated);
    }

    @Override
    public String voice() {
        System.out.println("Meow");
        return super.voice();
    }
}
