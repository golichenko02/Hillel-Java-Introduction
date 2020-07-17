package string_collection;


public class StringCollection implements Collection {

    private String[] list;
    private int count = 0;

    public StringCollection() {
        this.list = new String[10];
    }


    private String[] newList(String[] list) {
        String[] newList = new String[list.length * 3 / 2 + 1];
        int i = 0;
        for (String s : list) {
            newList[i] = s;
            i++;
        }
        return newList;
    }


    @Override
    public boolean add(Object o) {
        if (count == list.length) {
            this.list = newList(list);
            list[count++] = (String) o;
        } else {
            list[count++] = (String) o;
        }
        return true;
    }

    @Override
    public boolean add(int index, Object o) {
        if (index > count || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + count);
        }
        if (index == count) {
            list[count++] = (String) o;
            return true;
        }

        for (int i = count; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = (String) o;
        count++;
        return true;
    }

    @Override
    public boolean delete(Object o) {
        if (o == null) return false;
        for (int i = 0; i < count; i++) {
            if (list[i].equals(o))
                delete(i);
        }
        return true;
    }

    @Override
    public Object get(int index) {
        if (index >= list.length || index < 0)
            return "-1";
        return list[index];
    }


    @Override
    public boolean contains(Object o) {
        if (count == 0) return false;
        for (int i = 0; i < count; i++) {
            if (list[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Collection str) {
        if (this == str) {
            return true;
        }

        if (this.size() != str.size()) {
            return false;
        }

        int i = 0, counter = 0;

        while (i < this.size()) {
            if (this.list[i].equals(str.get(i))) {
                counter++;
            }
            i++;
        }

        if (counter == this.size()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean clear() {
        if (count == 0) return true;
        for (int i = 0; i < list.length; i++) {
            list[i] = null;
        }
        count = 0;
        return true;
    }

    @Override
    public int size() {
        return count;
    }

    public boolean delete(int index) {
        if (index >= list.length || index < 0) return false;
        for (int i = index; i <= count - 1; i++) {
            list[i] = list[i + 1];
        }
        count--;
        return true;

    }


    public void showAll() {
        System.out.println("----------------");
        if (count == 0) System.out.println("EMPTY LIST");
        for (int i = 0; i <= count; i++) {
            if (list[i] == null) break;
            System.out.println(i + 1 + ". " + list[i]);
        }
        System.out.println("----------------");
    }


}
