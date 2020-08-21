package employee;

import java.util.ArrayList;

public class Employee {
    private enum Gender {MALE, FEMALE}

    private String name;
    private int age;
    private double salary;
    private Gender gender;


    public Employee(String name, int age, double salary, Gender gender) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Gender getGender() {
        return gender;
    }
}