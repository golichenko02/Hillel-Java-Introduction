package compare;

public class Car {
    private String model;
    private int color;
    private int year;
    private int numberSeats;

    public Car(String model, int color, int year, int numberSeats) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.numberSeats = numberSeats;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if(obj == null || ! (obj instanceof Car)) {
            return false;
        }

       Car anotherCar = (Car)obj;

        if (this.model.equals(anotherCar.model) && this.color == anotherCar.color && this.year == anotherCar.year && this.numberSeats == anotherCar.numberSeats){
            return true;
        }
        return false;
    }



}
