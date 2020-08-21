package modul;

public class Main {
    public static void main(String[] args) {
        Captain.setMaxTime(15); // устанвливаем максимальное кол-во месяцев в рейсе
        Captain john = new Captain("John", Employee.Gender.MAN, 8500, 9, "USA", Captain.Specializaion.SEA, 6);
        Captain valentyna = new Captain("Valentyna", Employee.Gender.WOMAN, 4200, 5, "Ukraine", Captain.Specializaion.RIVER, 4);
        Employee ivan = new Employee("Ivan", Employee.Gender.MAN, 500, 4);

        john.showInfo();
        john.setTime(13);// обновляем информацию о сроке капитана --> cрабатывает метод workRecord() --> увеличивается стаж и зарплата
        john.showInfo();

        ivan.showInfo();

        valentyna.showInfo();
        valentyna.setTime(16); //  --> TimeOutException


    }
}
