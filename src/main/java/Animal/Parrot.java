package Animal;

public class Parrot extends Animal {

    public Parrot(String name){
        super(name);
    }

    public void mimicSpeach(){
        System.out.println("Kesha horoshiy!!! Kesha molodec");
    }

    @Override
    public void move(){
        System.out.println(getName() + " flies");
    }
}
