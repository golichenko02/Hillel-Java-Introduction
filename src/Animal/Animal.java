package Animal;

public class Animal {
    private String name;

    public Animal(String name){
     this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(){
        System.out.println( name + " eats");
    }

    public void sleep(){
        System.out.println(name + " sleeps");
    }

    public void  move(){
        System.out.println(name + " moves");
    }
}
