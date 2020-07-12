package employee;

import java.util.ArrayList;

public class Ankets {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addAnket(Employee employee){
        employees.add(employee);
    }

    public void showAnkets(){
        System.out.println("List of employees of Provectus");
        for (int i = 0; i < employees.size() ; i++) {
            System.out.println(i + "Name: " + employees.get(i).getName());
            System.out.println("Age: " + employees.get(i).getAge());
            System.out.println("Gender: " + employees.get(i).getGender());
            System.out.println("Salary: " + employees.get(i).getSalary());
        }
    }
}
