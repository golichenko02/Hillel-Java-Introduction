package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Имеется коллекция из String, привести все стринги в UPPERCASE и вернуть коллекцию List<Pair>
 *
 * in: "one", "two", ...
 *
 * out: {"one":"ONE"}, {"two", "TWO"}, ...
 */
public class Task2 {
    public static void main(String[] args) {

        List<Pair> pairs = Stream.of("one","two","three","four","five")
                .map(o -> new Pair(o,o.toUpperCase()))
                .collect(Collectors.toList());

        System.out.println(pairs);
    }


}

class Pair{
    private Object first;
    private Object second;

    public Pair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "" + first +
                ": " + second +
                '}';
    }
}
