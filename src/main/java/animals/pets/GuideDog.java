package animals.pets;


public class GuideDog extends Pet {
    private boolean isTrained;


    public GuideDog(int age, double weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    @Override
    public String greeting() {
        return isTrained ? super.greeting() + ". I can take you home" : super.greeting();
    }

    public void takeHome() {
        System.out.println("Идем с хозяином домой!");
    }


}
