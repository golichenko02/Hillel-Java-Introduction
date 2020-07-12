package cycles.arrays;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        int randomNum = (int) (Math.ceil(Math.random()*10));// ceil для того чтобы не было нуля(по ТЗ от 1 до 10)

        while (true) {
            int num = inputNumber("Угадайте число от 1 до 10:");
            System.out.println("Число которое нужно угадать " + randomNum);
            System.out.println("Ваше число:" + num);
            if (num == randomNum) {
                System.out.println("Ура!Вы угадали число!Хотите сыграть еще?");

                break;
            } else if (num < randomNum) {
                System.out.println("Больше, попробуйте еще раз!");
            } else if (num > randomNum) {
                System.out.println("Меньше, попробуйте еще раз!");
            }

        }
    }
    public static int inputNumber(String promt){
        System.out.println(promt);
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }
}
