package humansList;


import java.io.Serializable;

public class Human implements Serializable, Comparable {

    protected enum Gender {
        MALE, FEMALE;
    }

    private String name;
    private String surname;
    private int age;
    private Gender gender;

    public Human(String name, String surname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "name: " + name +
                ", surname: " + surname +
                ", age: " + age +
                ", gender: " + gender;
    }

    @Override
    public int compareTo(Object h) {
        Human human = (Human) h;
        return this.name.compareTo(human.name);
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }
}
