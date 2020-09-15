package adapter;

public class SamsungCharger implements IEuroSocket {

    @Override
    public void charge() {
        System.out.println("Samsung charging");
    }
}
