package collectionExamples;

public class Car {
    private String model;
    private int maxVeloscity;
    private boolean automaticGear;

    public Car(String model) {
        this.model = model;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxVeloscity() {
        return maxVeloscity;
    }

    public void setMaxVeloscity(int maxVeloscity) {
        this.maxVeloscity = maxVeloscity;
    }

    public boolean isAutomaticGear() {
        return automaticGear;
    }

    public void setAutomaticGear(boolean automaticGear) {
        this.automaticGear = automaticGear;
    }

    // Если два хэш-кода разные, то и объекты гарантировано разные
    // Два разных объекта могут иметь одинаковый хэш-код --> КОЛЛИЗИЯ

    @Override
    public int hashCode() {
      return  this.model.hashCode() + maxVeloscity + ( automaticGear ? 1: 0);

      // "BMW"(100) + 255 + "manual"(0) = 355
      // "BMW"(100) + 254 + "automatic"(1) = 355
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Car)){
            return false;
        }
        Car car = (Car) obj;
        return this.model.equals(car.model) && this.maxVeloscity == car.maxVeloscity && this.automaticGear == car.automaticGear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxVeloscity=" + maxVeloscity +
                ", automaticGear=" + automaticGear +
                '}';
    }
}
