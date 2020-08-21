package iterator;


import java.util.NoSuchElementException;

public class ArrayIterator {

    private String[] array;
    private int index = 0;

    public ArrayIterator(String[] array) {
        this.array = array;
    }

    public boolean hasNext() {
        return index < array.length;
    }


    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        return array[index++];
    }
}

class Main {
    public static void main(String[] args) {
        String[] names = {"Alex", "John", "Kris", "Dana", "Lewis", "Albert", "Laura"};

        ArrayIterator iterator = new ArrayIterator(names);

        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.toUpperCase().charAt(0) == 'L') {
                System.out.println(name);
            }
        }
    }
}
