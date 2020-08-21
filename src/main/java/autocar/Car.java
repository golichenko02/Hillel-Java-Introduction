package autocar;

public class Car {

    private int mode;
    private boolean accelerator;
    private  String name;
    private  int  color;
    private  boolean manualTypeGear;

    public Car(String name){
        this.name  = name;
    }

    public Car(String name, int color){
        this(name);
        this.color = color;
    }

    public Car(String name, int color, boolean manualTypeGear) {
        this(name,color);
        this.manualTypeGear = manualTypeGear;
    }

    public void setName(String name){
        this.name = name;
    }

    public void drive() {
        accelerator = true;
        switchGear();
        System.out.println(name + " : " + mode);
    }

    public void down() {
        accelerator = false;
        switchGear();
        System.out.println(name + " : " + mode);
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
