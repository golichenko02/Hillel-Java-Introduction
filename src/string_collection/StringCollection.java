package string_collection;


public class StringCollection {
    private int length;
    private String[] list;
    private int lastIndex = 0;

    public StringCollection() {
        this.length = 10;
        this.list = new String[length];
    }

    public StringCollection(int size) {
        this.length = size;
        this.list = new String[size];
    }

    public void add(String e) {
        if (lastIndex == length) {
            this.list = newList(list);
            list[lastIndex++] = e;
        } else {
            list[lastIndex] = e;
            lastIndex++;
        }
    }

    private String[] newList(String[] list) {
        length = list.length * 3 / 2 + 1;
        String[] newList = new String[length];
        int i = 0;
        for (String s : list) {
            newList[i] = s;
            i++;
        }
        return newList;
    }


    public String get(int index) {
        if (index >= length || index < 0) {
            return "-1";
        } else {
            return list[index] == null ? "empty cell" : list[index];
        }
    }

    public boolean delete(int index) {
        if (index >= length && index < 0) return false;
        for (int i = index; i <= lastIndex - 1; i++) {
            list[i] = list[i + 1];
        }
        lastIndex--;
        return true;

    }

    public boolean delete(String s) {
        if (s == null) return false;
        for (int i = 0; i < lastIndex; i++) {
            if (list[i].equals(s))
                delete(i);
        }
        return true;
    }

    public void showAll() {
        for (int i = 0; i < lastIndex; i++) {
            System.out.println(i + 1 + ". " + list[i]);
        }
    }

}
