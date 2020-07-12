package lesson_05;

public class FlyTransport extends Transport{
    public FlyTransport(String name, int distance, int speed) {
        super(name, distance, speed);
    }

    @Override
    public double duration() {
        return super.duration() + 0.6;
    }
}
