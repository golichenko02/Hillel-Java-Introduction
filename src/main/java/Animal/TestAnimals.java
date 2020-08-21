package Animal;

public class TestAnimals {
    public static void main(String[] args) {


        Animal[] ZOO = {new Parrot("Kesha"), new Cow("Murka"), new Monkey("Ludwig")};

        for (Animal someAnimal : ZOO) {
            someAnimal.move();
        }
    }
}
