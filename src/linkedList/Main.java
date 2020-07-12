package linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("kozlov");
        list.add("petrov");
        list.add("sidorov");
        list.toArray();
        System.out.println(list.contains("sidorov"));
    }
}
