package test;

public class Car {
    // enum от слова enumeration(перечисление)
    public enum Color {
        RED, GREEN , BLUE, BLACK, WHITE, YELLOW
    }
    private  String model;
    private int year;

    private Color currentColor;


    public Car(String model, int year, Color color) {
        this.model = model;
        this.year = year;
        this.currentColor = color;
    }

    public void repaint(Color newColor) {
        System.out.println(newColor.name());
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public static void main(String[] args) {
        Color g = Color.GREEN;

        Color r = Color.RED;

        Color y = Color.YELLOW;

       Color[] allColors =  Color.values();
        for (Color currentColor: allColors) {
           String color = currentColor.name();
            System.out.println(color);
        }

        System.out.println(Color.GREEN.ordinal());// index


//        Car car1 = new Car("Tesla X", 2019, g);
//        System.out.println(car1.getCurrentColor().name());

    }
}
