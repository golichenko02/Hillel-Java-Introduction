package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**Имеется коллекция из String, отфильтровать и вывести на экран все значения,
 * которые написаны в loverCase and length = 4
 */
public class Task3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("vlad", "Timur", "vova", "Alex", "Sasha", "Artur", "Alan"));

        strings.stream()
                .filter(i -> i.length() == 4)
                .filter(i -> i.equals(i.toLowerCase()))
                .forEach(System.out::println);

    }

}
