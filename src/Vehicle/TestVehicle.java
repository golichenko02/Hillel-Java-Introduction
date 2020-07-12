package Vehicle;

public class TestVehicle {
    public static void main(String[] args) {
        Plane plane = new Plane("Mriya", "Red");
        Car car = new Car("Tesla X ", "Grey");
        Train train = new Train("Chernomorets", "blue");
        Bus bus = new Bus("AutoLux", "yellow");

        plane.getInformation();
        plane.takeoff();
        plane.move();
        plane.autopilotOn();
        plane.autopilotOf();
        plane.stop();

        train.getInformation();
        train.uncoupling();
        train.coupling();
        train.move();
        train.move();
        train.stop();

        car.getInformation();
        car.move();
        car.radioOn();
        car.autopilotOn();
        car.radioOff();
        car.autopilotOf();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.down();
        car.down();
        car.down();
        car.stop();

        bus.getInformation();
        bus.openTheDoor();
        bus.closeTheDoor();
        bus.reduceTemperature();
        bus.reduceTemperature();
        bus.reduceTemperature();
        bus.reduceTemperature();
        bus.move();
        bus.autopilotOn();
        bus.increaseTemperature();
        bus.autopilotOf();
        bus.stop();
    }
}
