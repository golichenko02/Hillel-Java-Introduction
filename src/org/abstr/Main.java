package org.abstr;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Vova");
        System.out.println(e1.getName());
        e1.implementContract();

        Client c1 = new Client("Max");
        System.out.println(c1.getName());
        c1.implementContract();

        FinancialDirector financialDirector = new FinancialDirector("John");
    }
}
