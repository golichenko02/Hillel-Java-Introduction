package collection;

public class OurArrayList {

    private final int maxSize;
    private String[] list;
    private int lastIndex = 0;

    public OurArrayList(int maxSize) {
        this.maxSize = maxSize;
        this.list = new String[maxSize];
    }

    public void add(String e) {
        list[lastIndex] = e;
        if (lastIndex == maxSize - 1) {
            System.out.println("List is full");
        } else {
            lastIndex++;
        }
    }

    public String get(int i) {
        if(i >= maxSize && i < 0){
            System.out.println("Wrong index to get element from our list");
            return null;
        }else {
            return list[i];
        }
    }

    public int size() {
        return lastIndex;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public static void main(String[] args) {
        OurArrayList myList = new OurArrayList(5);

        myList.add("1"); // 0
        myList.add("2"); // 1
        myList.add("2asd"); // 2
        myList.add("1=4=="); // 3
        myList.add("Welcome"); // 4
        // Создается новый массив  new String[maxSize*2] <--- copy old list

        System.out.println(myList.size());
    }
}
