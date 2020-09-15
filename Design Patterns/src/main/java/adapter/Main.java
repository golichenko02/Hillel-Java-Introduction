package adapter;

public class Main {
    public static void main(String[] args) {
        Charger charger = new Charger();
        charger.charge(new SamsungCharger());
        charger.charge(new Adapter(new MeizuCharger()));
    }
}
