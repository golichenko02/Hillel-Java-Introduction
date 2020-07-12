package animals;

public abstract class Pet extends Animal {
    private String name;
    private boolean isVaccinated;

    public Pet(int age, double weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }



    @Override
    public String voice() {
        return super.voice() + " my name is " + name + '.';
    }
}
