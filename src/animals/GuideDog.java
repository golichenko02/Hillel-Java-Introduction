package animals;

public class GuideDog extends Pet{
    private boolean isTrained;


    public GuideDog(int age, double weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }



    public void takeHome(){
        System.out.println("Идем с хозяином домой!");
    }

    @Override
    public String voice() {
        if (isTrained)
            return super.voice() + " I can take you home.";
        return super.voice();
    }
}
