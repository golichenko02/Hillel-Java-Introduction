package string_collection;


public class TestCollection {
    public static void main(String[] args) {
        StringCollection strings = new StringCollection(4);
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");
        strings.add("five");
        strings.add("six");
        strings.add("seven");
        strings.add("eight");
        strings.add("nine");
        strings.add("ten");

        strings.showAll();

        System.out.println(strings.get(10));
        System.out.println(strings.get(11));
        System.out.println(strings.get(12));
        System.out.println(strings.get(8));


        strings.delete(9);
        strings.delete(8);
        strings.delete("five");

        strings.showAll();


    }
}
