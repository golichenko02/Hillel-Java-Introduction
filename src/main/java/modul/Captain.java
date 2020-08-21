package modul;


public class Captain extends Employee {
    public enum Specializaion {
        RIVER, SEA, MIXED
    }

    private String country;
    private Specializaion specializaion;
    private int time; // текущее времянахождение в рейсе (в месяцах)
    private static int maxTime; // максимальное кол-во месяцев в рейсе


    public Captain(String name, Gender gender, double salary, int workExperience, String country, Specializaion specializaion, int time) {
        super(name, gender, salary, workExperience);
        this.country = country;
        this.specializaion = specializaion;
        setProfession("Captain");
        this.time = time;
        checkTime();
    }

    public void setTime(int time) {
        this.time = time;
        workRecord();
        checkTime();
    }

    public static void setMaxTime(int maxTime) {
        Captain.maxTime = maxTime;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Profession: " + getProfession());
        System.out.println("Specialization: " + specializaion);
        System.out.println("Country: " + country);
        System.out.println("Current term in voyage: " + time + "\n");
    }

    private void workRecord() {
        if (time >= 12) {
            setWorkExperience(getWorkExperience() + 1);
            setSalary(getSalary() + 500);
        }
    }

    private void checkTime() {
        try {
            if (time > maxTime) {
                throw new TimeOutException("The captain " + getName() + " should not be on a voyage more than " + maxTime + " months");
            }
        } catch (TimeOutException e) {
            e.printStackTrace();
        }
    }
}
