package politeh;



public class Pribor1 extends Abstract {

    private boolean isOn;

    protected static class Measurments {
        public Measurments(String nameOfValue, double min, double max, double mistake) {
            this.nameOfValue = nameOfValue;
            this.min = min;
            this.max = max;
            this.mistake = mistake;
        }

         String nameOfValue;
         double min, max, mistake;
    }

    private Measurments measurments;



    public Pribor1(String name, int price, Measurments measurments) {
        super(name, price);

        System.out.println("\n" + name + " with parameters: ");
        this.measurments = measurments;

    }

    @Override
    public void onDevice() {
        this.isOn = true;
        System.out.println("Device ON!");
    }

    @Override
    public void offDevice() {
        this.isOn = false;
        System.out.println("Device OFF!");
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        if (isOn) {
            System.out.println("Status: ON");
        } else {
            System.out.println("Status: OFF");
        }
        System.out.println("Name of value: " + this.measurments.nameOfValue);
        System.out.println("Min value: " + this.measurments.min);
        System.out.println("Max value: " + this.measurments.max);
        System.out.println("Mistake: " + this.measurments.mistake);
    }

    static void showCount(){
        System.out.println("Number of objects created: " + count);
    }
}