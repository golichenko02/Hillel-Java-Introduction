package politeh;

public class TestBus {
    public static void main(String[] args) {
        RegularBus bogdan = new RegularBus("Bogdan", 90, 40, 22, new Schedule("Ovidiopol", "Odessa", "19:20", "20:25"));
        RegularBus isuzu = new RegularBus("Isuzu", 110, 38, 26, new Schedule("Odessa", "Ovidiopol", "10:15", "11:20"));
        Bus neoplan = new Bus("Neoplan", 130, 60, 45);

        bogdan.move();
        bogdan.autopilotOn();
        bogdan.reduceTemperature();
        bogdan.reduceTemperature();
        bogdan.stop();
        bogdan.autopilotOff();
        bogdan.getInformation();

        isuzu.move();
        isuzu.reduceTemperature();
        isuzu.reduceTemperature();
        isuzu.stop();
        isuzu.getInformation();

        neoplan.move();
        neoplan.getInformation();
        neoplan.autopilotOn();
        neoplan.reduceTemperature();
        neoplan.reduceTemperature();
        neoplan.increaseTemperature();
        neoplan.stop();
        neoplan.getInformation();
    }
}
