package Vehicle;

import java.util.Scanner;

public class Train extends Vehicle {
    private int wagon;
    private boolean wagonHitch;

    public Train(String name) {
        super(name);
    }

    public Train(String name, String color) {
        super(name, color);
    }


    @Override
    public void move() {
        System.out.println(getName() + " chuh-chuh-chuh-chuh");

    }

    public void uncoupling(){
        System.out.println("Uncoupling.");
        indicateWagon();
        wagonHitch = true;
        trainComposition();
    }

    public void coupling(){
        System.out.println("Coupling.");
        indicateWagon();
        wagonHitch = false;
        trainComposition();
    }

    private void trainComposition(){
        if (wagonHitch){
            System.out.println("Uncoupling " + wagon + " wagon");
        }else{
            System.out.println("Clutch " + wagon + " wagon");
        }
    }

    private int indicateWagon(){
        System.out.print("Input number of the wagon: ");
        Scanner scan = new Scanner(System.in);
        return  wagon = scan.nextInt();
    }




}
