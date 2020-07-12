package lesson_05;


public class TerrTransport extends Transport {


    private String color;
    private String brand;
    private String model;
    private String engineType;

    public TerrTransport(String name, int distance, int speed) {
        super(name, distance, speed);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }


}
