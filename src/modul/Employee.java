package modul;

public class Employee implements PrintData {
    public enum Gender {
        MAN, WOMAN
    }

    private String name;   // имя
    private Gender gender; // пол
    private double salary; // зарплата
    private int workExperience; // стаж работы
    private static String profession; // профессия

    public Employee(String name, Gender gender, double salary, int workExperience) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.workExperience = workExperience;
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: " + salary);
        System.out.println("Work experience: " + workExperience);
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public static void setProfession(String profession) {
        Employee.profession = profession;
    }

    public static String getProfession() {
        return profession;
    }
}
