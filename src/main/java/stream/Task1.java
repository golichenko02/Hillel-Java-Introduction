package stream;

import java.util.OptionalDouble;
import java.util.stream.Stream;

/**
 * Имеется коллекция из Integers, используя стримы посчитать среднее значения всех чисел
 */
public class Task1 {
    public static void main(String[] args) {
       OptionalDouble average =  Stream.of(1,2,3,4,5)
                .mapToInt(s -> s)
                .average();


        System.out.println(average);
    }
}
