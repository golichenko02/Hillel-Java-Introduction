package compare;

public class CompareObj {
    public static void main(String[] args) {

        Car car1 = new Car("Tesla", 1, 2018, 10);
        Car car2 = new Car("Tesla", 1, 2018, 10);
        AirJet air = new AirJet(100,700);
        if (car1.equals(air)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
