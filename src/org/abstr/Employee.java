package org.abstr;



public class Employee extends Person {
    private  int qualification; // 1 - low; 10 - highest;

    public Employee(String name) {
        super(name);
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    @Override
    public boolean implementContract() {
        System.out.println("Employee has qualification: " + qualification + " and have to complete his part of contract");
        return true;
    }
}
