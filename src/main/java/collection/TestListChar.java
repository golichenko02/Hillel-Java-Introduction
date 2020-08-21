package collection;

public class TestListChar {
    public static void main(String[] args) {
        ListChar myList = new ListChar(); // 30
        ListChar list5 = new ListChar(5); // 5

        System.out.println(myList.isEmpty());// true
        System.out.println(list5.isEmpty());// true


        list5.add('1');// 0
        list5.add('2');// 1
        list5.add('3');// 2
        list5.add('2');// 3
        list5.add('1');// 4
        list5.add('6');//  false, list is full

        System.out.println(list5.isEmpty());// false

        myList.add('1'); // 0
        myList.add('2'); // 1
        myList.add('3'); // 2
        myList.add('2'); // 3
        myList.add('0'); // 4

        System.out.println(myList.equals(list5)); // false
        myList.set(4,'1'); // 0 --> 1
        System.out.println(myList.equals(list5)); // true

        System.out.println(myList.contains('0')); // false
        System.out.println(myList.contains('3')); // true

        System.out.println(myList.getFreeSize()); // 25
        System.out.println(myList.addAll(list5)); // true
        System.out.println(myList.getFreeSize()); // 20
        System.out.print("myList + list5: ");
        for (int i = 0; i < myList.size() ; i++) {
            System.out.print((char) myList.get(i));
            System.out.print("; ");
        }

        myList.clear();
        System.out.println();
        System.out.println(myList.isEmpty()); // true
        System.out.println(myList.getFreeSize()); // 30
        System.out.println(myList.size()); // 0
        System.out.println(myList.getFullSize());// 30
        System.out.println(myList.indexOf('1')); // -1
        System.out.println(list5.indexOf('3')); //  2

        System.out.println("myList after clear: ");
        for (int i = 0; i < myList.size() ; i++) {
            System.out.print((char) myList.get(i));
            System.out.print("; ");
        }

        System.out.println("list5: ");
        for (int i = 0; i < list5.size() ; i++) {
            System.out.print((char) list5.get(i));
            System.out.print("; ");
        }

    }
}