package animals;

import animals.pets.Pet;

public interface IVoice {


    default String greeting() {

        return this instanceof Pet ? "Hello, my name is " + this.toString() : "Hello, I am a wild animal";
    }
}
