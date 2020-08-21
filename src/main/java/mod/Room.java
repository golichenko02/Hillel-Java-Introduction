package mod;

public class Room implements Operations{
    private int roomNumber;
    private double roomSquare;
    private int numberOfSeats;
    private static boolean electricity;
    private boolean ventilation;

    public Room(int roomNumber, double roomSquare, int numberOfSeats, boolean electricity, boolean ventilation) {
        this.roomNumber = roomNumber;
        this.roomSquare = roomSquare;
        this.numberOfSeats = numberOfSeats;
        this.electricity = electricity;
        this.ventilation = ventilation;
    }

    private void checkState() {
        if (electricity) {
            System.out.println("Electricity ON");
        } else {
            System.out.println("Electricity OFF");
        }
        if (ventilation) {
            System.out.println("Ventilation ON");
        } else {
            System.out.println("Ventilation OFF");
        }
    }


    @Override
    public void electricityOn() {
        electricity = true;
    }

    @Override
    public void electricityOff() {
        electricity = false;
    }

    @Override
    public void ventilationOn() {
        ventilation = true;
    }

    @Override
    public void ventilationOff() {
        ventilation = false;
    }

    @Override
    public void show() {
        System.out.println("Room number: " + roomNumber);
        System.out.println("Square: " + roomSquare);
        System.out.println("Number of seats: " + numberOfSeats);
        checkState();
    }

    public static boolean isElectricity() {
        return electricity;
    }
}
