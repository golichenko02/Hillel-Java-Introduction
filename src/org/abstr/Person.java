package org.abstr;

public abstract class Person {
    private String name;
    private String addr;
    private String phone;

    public Person(String name) {
        this.name = name;
    }

    public  abstract boolean implementContract();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
