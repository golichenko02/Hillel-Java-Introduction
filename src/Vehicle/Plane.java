package Vehicle;

public class Plane extends Vehicle {
    private boolean instruction;

    public Plane(String name) {
        super(name);
    }

    public Plane(String name, String color) {
        super(name, color);
    }

    @Override
    public void move() {
        System.out.println(getName() + " flies.");
    }

    @Override
    public void stop() {
        System.out.println(getName() + " lands.");
        instruction = false;
        loadSpeaker();
    }

    public void takeoff() {
        System.out.println(getName() + " takes off.");
        instruction = true;
        loadSpeaker();
    }

    private void loadSpeaker(){
        if(instruction){
            System.out.println("Auto instruction is ON");
        }else{
            System.out.println("Landing message is ON");
        }
    }

}
