package linkedList;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MainLinkedListTest {
    public static void main(String[] args) {
        OurLinkedList linkedList = new OurLinkedList();

        // Node("13") <--> Node("12") <--> Node("11") <--> Node("10") <--> Node("9") ... Node("9")

        linkedList.addLast("1");
        linkedList.addLast("2");
        linkedList.addLast("3");
        linkedList.addLast("4");
        linkedList.addLast("5");
        linkedList.addLast("6");


        linkedList.insert("a");
        showLinkedList(linkedList);
        System.out.println(linkedList.contains("6"));


    }

    public static void showLinkedList(OurLinkedList linkedList){
        Node currentNode = linkedList.getHead();
        do{
            System.out.print(currentNode.getElement());
            System.out.print("; ");
            currentNode = currentNode.getNext();
        }while (currentNode != null);
    }
}
