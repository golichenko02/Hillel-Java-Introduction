package animals;


public abstract class Animal {
    private final int id = hashCode();
    private int age;
    private double weight;
    private String color;

    public Animal(int age, double weight, String color) {
        this.age = age;
        this.weight = weight;
        this.color = color;
    }


    public int getId() {
        return id;
    }
}
