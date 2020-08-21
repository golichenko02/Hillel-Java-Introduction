package Vehicle;

public class Vehicle {
    private String name;
    private String color;
    private boolean autopilotMode;

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle(String name, String color) {
        this(name);
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void getInformation(){
        System.out.println(name + " , color: " + color + ". ");
    }

    public void move() {
        System.out.println(name + " drives.");

    }

    public void stop() {
        System.out.println(name + " stops.");
    }

    public void autopilotOn(){
        autopilotMode = true;
        autopilotMode();
    }

    public void autopilotOf(){
        autopilotMode = false;
        autopilotMode();
    }

    private void autopilotMode() {
        if (autopilotMode) {
            System.out.println(" Autopilot is ON");
        } else {
            System.out.println(" Autopilot is OFF");
        }

    }

}
