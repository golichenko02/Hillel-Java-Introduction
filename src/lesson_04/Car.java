package lesson_04;

/**
 * в классе Мейн надо определить и вывести на экран сколько надо долить топлива и его стоимость если маршрут у нас Одесса - Киев
 * + 2 обязательные остановки для дозаправки Кривое Озеро и Жашков
 * + сколько будет стоить полная поездка
 * + остаток топлива в пункте назначения
 */
public class Car {
    private double volume; // объем бака
    private double consumption;// расход топлива на 100 км
    private double remainder; // остаток в баке
    private final int fuelPrice = 20; // cтоимость топлива
    private double mileage; // пробег

    public Car(double volume, double consumption, double remainder) {
        this.volume = volume;
        this.consumption = consumption;
        this.remainder = remainder;
    }

    // залить полный бак с учетом объема остатка
    public void refuel() {
        double rest = volume - remainder;
        System.out.println("\t--\t--\t--\t--");
        System.out.println("Refueling was successful. Flooded : " + rest + " liters |" + " Price: " + fuelPrice * rest);
        System.out.println("You can go!");
        System.out.println("\t--\t--\t--\t--");

        remainder += rest;
    }

    //определить сколько надо дозаправить топлива при преодолении N км
    public void determineVolume(int km) {
        mileage += km;
        double rest = volume - determineRemainder(km);
        System.out.println("Passed: " + mileage + " km");
        System.out.println(rest + " liters consumed. In stock: " + remainder);
        System.out.println("Price to refuel a full: " + rest * fuelPrice);
    }

    public void determineVolume(int km, boolean isEnd) {
        if (isEnd) {
            mileage += km;
            double rest = volume - determineRemainder(km);
            System.out.println(rest + " liters consumed. In stock: " + remainder);
            System.out.println("The cost of travel: " + (mileage/100) * fuelPrice * consumption);
            System.out.println("Passed: " + mileage + " km");
            mileage = 0;
        } else
            determineVolume(km);
    }

    //определить остаток топлива по преодолении N км
    private double determineRemainder(double km) {
        return remainder -= (consumption * (double) km / 100);
    }


}

class Main {
    public static void main(String[] args) {
        Car lexus = new Car(65, 17, 40);
        lexus.refuel();
        lexus.determineVolume(180); // Одесса --> Кривое озеро
        lexus.refuel();
        lexus.determineVolume(145); // Кривое озеро --> Жашков
        lexus.refuel();
        lexus.determineVolume(150, true); // Жашков --> Киев
    }
}
