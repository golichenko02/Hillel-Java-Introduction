package politeh;

public abstract class Abstract {
    protected String name;
    protected int price;
    protected static int count = 0;

    public Abstract(String name, int price) {
        this.name = name;
        this.price = price;
        count++;
    }

    public abstract void onDevice();

    public abstract void offDevice();

    public abstract void showInfo();
}
