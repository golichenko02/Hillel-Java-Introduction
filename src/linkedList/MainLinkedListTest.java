package linkedList;


public class MainLinkedListTest {
    public static void main(String[] args) {
        OurLinkedList linkedList = new OurLinkedList();
        OurLinkedList test = new OurLinkedList();


        linkedList.addLast("1");
        linkedList.addLast("2");
        linkedList.addLast("3");
        linkedList.addLast("4");
        linkedList.addLast("5");
        linkedList.addLast("6");
        linkedList.addFirst("0");
        linkedList.addFirst("-1");
        linkedList.addFirst("-2");
        linkedList.insert("a");
        linkedList.insertAfter("4", "4.5");

        System.out.println(linkedList.size());// 11
        showLinkedList(linkedList); // -2; -1; 0; 1; a; 2; 3; 4; 4.5; 5; 6;

        System.out.println(linkedList.contains("a"));//true
        linkedList.delete(9);
        linkedList.delete("a");
        System.out.println(linkedList.contains("a"));// false
        System.out.println(linkedList.size());// 9


        showLinkedList(linkedList); // -2; -1; 0; 1; 2; 3; 4; 5; 6;

        System.out.println(linkedList.get(2)); // 0


        test.addLast("7");
        test.addLast("8");
        test.addLast("9");
        showLinkedList(test); // 7; 8; 9

        linkedList.addAll(test);
        showLinkedList(linkedList); //-2; -1; 0; 1; 2; 3; 4; 5; 6; 7; 8; 9;


        String[] strings = {"b", "c", "d", "e"};
        System.out.println(test.addAll(strings));// true

        showLinkedList(test);// 7; 8; 9; b; c; d; e;
        showLinkedList(linkedList);// -2; -1; 0; 1; 2; 3; 4; 5; 6; 7; 8; 9;
        linkedList.addAll(test);
        showLinkedList(linkedList);//-2; -1; 0; 1; 2; 3; 4; 5; 6; 7; 8; 9; 7; 8; 9; b; c; d; e;


        linkedList.clear();
        System.out.println(linkedList.size()); //0
        System.out.println(linkedList.isEmpty()); //true
        System.out.println(test.isEmpty());// false
        showLinkedList(linkedList); // Empty list
        showLinkedList(test); // 7; 8; 9; b; c; d; e;

        test.addFirst(null);
        test.addLast(null);
        test.insert(null);
        showLinkedList(test);
        test.trim();
        showLinkedList(test);


    }

    public static void showLinkedList(OurLinkedList linkedList) {
        if (linkedList.isEmpty()) {
            System.out.println("Empty list");
            return;
        }
        Node currentNode = linkedList.getHead();

        do {
            System.out.print(currentNode.getElement());
            System.out.print("; ");
            currentNode = currentNode.getNext();

        } while (currentNode != null);
        System.out.println();
    }
}
