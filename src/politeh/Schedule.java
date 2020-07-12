package politeh;

public class Schedule {
    private String start;
    private String finish;
    private String startTime;
    private String finishTime;

    public Schedule(String start, String finish, String startTime, String finishTime) {
        this.start = start;
        this.finish = finish;
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }
}
