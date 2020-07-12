package autocar;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla Model S");
        Car car2 = new Car("Jaguar");

        Car car3 = new Car("Lada", 10);
        Car car4 = new Car("Porshe", 156, true);

        Car car5 = new Car("Shkoda", 235, false);
        Car car6 = new Car("BMW", 25, true);


        car1.drive();
        car1.drive();
        car1.drive();
        car1.drive();
        car1.drive();
        car1.drive();
        car2.drive();
        car2.drive();

        car2.drive();
        car2.drive();
        car1.down();
        car1.down();
        car2.down();
    }
}
