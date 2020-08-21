package org.abstr;


public class Client extends Person {
    private int loyalty;

    public Client(String name) {
        super(name);
    }

    @Override
    public boolean implementContract() {
        System.out.println(getName() + " must pay for work of employee");
        return true;
    }


}
