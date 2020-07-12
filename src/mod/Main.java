package mod;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(35, 50,20,true,true);
        room.show();
        room.ventilationOff();
        room.electricityOff();
        room.show();

        ComputerRoom computerRoom = new ComputerRoom(23,65,30,true,true,12);
        computerRoom.show();
        computerRoom.electricityOff();
        computerRoom.setInternet(true);
    }
}
