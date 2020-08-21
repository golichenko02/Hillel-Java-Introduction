package animals;

import animals.pets.*;
import animals.wildAnimals.Crocodile;
import animals.wildAnimals.Giraffe;
import animals.wildAnimals.Lion;
import animals.wildAnimals.Wolf;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat(2,4,"White","Monya",true);
        Dog dog = new Dog(4,55,"Black", "Jack", true);
        Fish fish = new Fish(1,0.2, "Gold", "Gold Fish",false);
        GuideDog guideDog = new GuideDog(3, 50, "Brown", "Rex", true,true);
        GuideDog jessy = new GuideDog(3, 50, "Brown", "Jessy", true,false);
        Hamster hamster = new Hamster(1, 0.5,"Brown","Deil",false);
        Crocodile gena = new Crocodile(7,70,"Green", true);
        Giraffe giraffe = new Giraffe(10,750, "Orange", false);
        Lion lion = new Lion(7, 180, "Yellow", true);
        Wolf wolf = new Wolf(8,60,"Black",true);

        System.out.println(cat.greeting() + " Id: " + cat.getId());
        System.out.println(dog.greeting() + " Id: " + dog.getId());
        System.out.println(fish.greeting() + " Id: " + fish.getId());
        System.out.println(guideDog.greeting() + " Id: " + guideDog.getId());
        guideDog.takeHome();
        System.out.println(jessy.greeting() + " Id: " + jessy.getId());
        System.out.println(hamster.greeting() + " Id: " + hamster.getId());
        System.out.println(gena.greeting() + " Id: " + gena.getId());
        System.out.println(giraffe.greeting() + " Id: " + giraffe.getId());
        System.out.println(lion.greeting() + " Id: " + lion.getId());
        System.out.println(wolf.greeting() +  " Id: " + wolf.getId());


    }
}
