package politeh;

public abstract class Vehicle {
    private String name;
    private int maxSpeed; // максимальная скорость
    private int maxCarrying; // пассажировместимость
    private boolean isMoving; // состояние транспортного средства: стоит / в пути

    public Vehicle(String name, int maxSpeed, int maxCarrying) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.maxCarrying = maxCarrying;
    }

    protected void setMoving(boolean moving) {
        isMoving = moving;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxCarrying() {
        return maxCarrying;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public abstract void move();

    public abstract void stop();

    public abstract void getInformation();

}


