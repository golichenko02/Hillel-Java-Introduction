package lesson_05;

public class Transport {
    private String name;
    private int distance;
    private int speed;

    public Transport(String name, int distance, int speed) {
        this.name = name;
        this.distance = distance;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double duration(){
        return (double) distance / speed;
    }
}
