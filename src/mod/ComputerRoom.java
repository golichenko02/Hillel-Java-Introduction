package mod;

public class ComputerRoom extends Room {
    private int amountComputers;
    private static boolean internet;


    public ComputerRoom(int roomNumber, double roomSquare, int numberOfSeats, boolean electricity, boolean ventilation, int amountComputers) {
        super(roomNumber, roomSquare, numberOfSeats, electricity, ventilation);
        this.amountComputers = amountComputers;
    }

    public static boolean isInternet() {
        return internet;
    }

    public static void setInternet(boolean internet) {
        ComputerRoom.internet = internet;
        check();
    }

    private static void check() {
        try {
            if (internet && !isElectricity()) {
                throw new ElectricityException("Internet cannot work without electricity");
            }
        } catch (ElectricityException e) {
           e.printStackTrace();
        }
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Amount computers: " + amountComputers);
        if(internet){
            System.out.println("Internet: ON");
        }else {
            System.out.println("Internet: OFF");
        }

    }
}
