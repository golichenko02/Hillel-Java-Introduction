package Vehicle;

public class Car extends Vehicle {
    private int mode;
    private boolean accelerator;

    public Car(String name) {
        super(name);
    }

    public Car(String name, String color) {
        super(name, color);
    }

    public void drive() {
        accelerator = true;
        switchGear();
        System.out.println("Gear speed: " + mode);
    }

    public void down() {
        accelerator = false;
        switchGear();
        System.out.println( "Gear speed: " + mode);
    }

    public void radioOn(){
        System.out.println("Playing music.");
    }

    public  void radioOff(){
        System.out.println("Radio is OFF");
    }

    private void switchGear() {
        if (accelerator) {
            if (mode < 6) {
                mode++;
            }
        }else{
            if (mode > 0){
                mode--;
            }
        }

    }


}
