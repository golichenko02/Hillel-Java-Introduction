package politeh;

public class Bus extends Vehicle {
    private int temperatureMode = 22;// поддерживаемый температурный режим в салоне транспорта (изменяется методами ниже)
    private boolean temperatureRegulator;// состояние кондиционирования транспорта: увеличить / уменьшить температуру
    private boolean autopilotMode; // cостояние автопилота: вкл / выкл
    private boolean isOpenDoor; // состояние двери: открыта / закрыта
    private int numberOfSeats; // число мест для сидения

    public Bus(String name, int maxSpeed, int maxCarrying, int numberOfSeats) {
        super(name, maxSpeed, maxCarrying);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void move() {
        System.out.println(getName() + " drives");
        setMoving(true);
        closeTheDoor();
    }

    @Override
    public void stop() {
        System.out.println(getName() + " stops");
        setMoving(false);
        openTheDoor();
    }

    private void openTheDoor() {
        System.out.println("Door opened");
        isOpenDoor = true;
    }

    private void closeTheDoor() {
        System.out.println("Door closed");
        isOpenDoor = false;
    }

    @Override
    public void getInformation() {
        System.out.print("|Name: " + getName() + "|" + "\t|Number of seats: " + numberOfSeats + "|" + "\t|Max speed: " +
                +getMaxSpeed() + "|" + "\t|Max Carrying: " + getMaxCarrying() + "|" + "\t|Saloon temperature: " +
                +temperatureMode + "|");

        if (isMoving()) {
            System.out.println("|State: on the way|");
        } else {
            System.out.println("|State: standing on the bus station|");
        }

        if (isOpenDoor) {
            System.out.println(" Passengers are boarding and alighting ");
        } else {
            System.out.println("Landing is over");
        }
    }

    public void increaseTemperature() {
        temperatureRegulator = true;
        conditionerSystem();
        System.out.println("Temperature: " + temperatureMode);
    }

    public void reduceTemperature() {
        temperatureRegulator = false;
        conditionerSystem();
        System.out.println("Temperature: " + temperatureMode);
    }

    private void conditionerSystem() {
        if (temperatureRegulator) {
            if (temperatureMode < 22) {
                temperatureMode++;
            }
        } else {
            if (temperatureMode > 15) {
                temperatureMode--;
            }
        }
    }

    public void autopilotOn() {
        autopilotMode = true;
        autopilotMode();
    }

    public void autopilotOff() {
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
