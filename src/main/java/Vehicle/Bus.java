package Vehicle;

public class Bus extends Vehicle {
    private int mode = 21;
    private boolean temperature;

    public Bus(String name) {
        super(name);
    }

    public Bus(String name, String color) {
        super(name, color);
    }

    public void openTheDoor(){
        System.out.println("Door opened");
    }

    public void closeTheDoor(){
        System.out.println("Door closed");
    }

    public void increaseTemperature(){
        temperature = true;
        conditionerSystem();
        System.out.println("Temperature: " + mode);
    }

    public void reduceTemperature(){
        temperature = false;
        conditionerSystem();
        System.out.println("Temperature: " + mode);
    }

    private void conditionerSystem() {
        if (temperature) {
            if (mode < 21 ) {
                mode++;
            }
        }else{
            if (mode > 15){
                mode--;
            }
        }

    }
}
