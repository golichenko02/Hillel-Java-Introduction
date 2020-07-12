package Animal;

public class Monkey extends Animal {

    public Monkey(String name){
        super(name);
    }

    public void cleanBananas(){
        System.out.println("Monkey clean bananas");
    }
    public  void mimicHuman(){
        System.out.println("Bla-Nla-Mnla");
    }

    @Override
    public void move() {
        System.out.println(getName() + "  jumping ");
    }
}
