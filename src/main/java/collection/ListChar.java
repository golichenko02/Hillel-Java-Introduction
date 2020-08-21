package collection;

public class ListChar {
    private int length;
    private char[] list;
    private int lastIndex = 0;


    public ListChar() {
        this.length = 30;
        this.list = new char[length];
    }

    public ListChar(int size) {
        this.length = size;
        this.list = new char[size];
    }

    public boolean add(char e) {
        if (lastIndex == length) {
            System.out.println("List is full");
            return false;
        } else {
            list[lastIndex] = e;
            lastIndex++;
            return true;
        }
    }

    public boolean set(int index, char c) {
        if (index >= length || index < 0) {
            System.out.println("Wrong index to set element to our list");
            return false;
        } else {
            list[index] = c;
            return true;
        }
    }

    public int get(int index) {
        if (index >= length && index < 0) {
            System.out.println("Element wasn't found by the index");
            return -1;
        } else {
            return list[index];
        }
    }

    public boolean contains(char c) {
        for (int i = 0; i < length; i++) {
            if (list[i] == c) {
                return true;
            }
        }
        return false;
    }

    public boolean addAll(ListChar listChar) {
        if (listChar.length > getFreeSize()) {
            return false;
        }

        int j = 0;
        while (j != listChar.length) {
            list[lastIndex] = listChar.list[j];
            lastIndex++;
            j++;
        }
        return true;
    }

    public boolean equals(ListChar c) {
        if (this == c) {
            return true;
        }

        if (this.size() != c.size()) {
            return false;
        }

        int i = 0, counter = 0;

        while (i < this.size()) {
            if (this.list[i] == c.list[i]) {
                counter++;
            }
            i++;
        }

        if (counter == this.size()) {
            return true;
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < length; i++) {
            list[i] = 0;
        }
        lastIndex = 0;
    }

    public int indexOf(char c) {
        for (int i = 0; i < length; i++) {
            if (list[i] == c) {
                return i;
            }
        }
        return -1;
    }

    public int getFullSize() {
        return length;
    }

    public int getFreeSize() {
        return length - lastIndex;
    }

    public int size() {
        return lastIndex;
    }

    public boolean isEmpty() {
        return lastIndex == 0;
    }
}
