package politeh;

public class RegularBus extends Bus {
    private Schedule schedule;

    public RegularBus(String name, int maxSpeed, int maxCarrying, int numberOfSeats, Schedule schedule) {
        super(name, maxSpeed, maxCarrying, numberOfSeats);
        this.schedule = schedule;
    }

    @Override
    public void getInformation() {
        super.getInformation();
        System.out.print("|Point of departure: " + schedule.getStart() + "|" + "\t|Point of arrival: " + schedule.getFinish() + "|");
        System.out.println("\t|Departure time: " + schedule.getStartTime() + "|" + "\t|Arrival time: " + schedule.getFinishTime() + "|\n");
    }
}
