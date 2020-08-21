package cycles.arrays;

public class Task3 {
    public static void main(String[] args) {
        int result = 0;
        for(int i=1;i<101;i+=2){
            result+=i;
        }
        System.out.println("Сумма нечетных чисел от 1 до 100 равна "+result);
    }

}
