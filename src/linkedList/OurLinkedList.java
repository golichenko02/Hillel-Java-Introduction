package linkedList;

public class OurLinkedList {
    private Node head; // всегда расположен в крайней левой позиции
    private Node tail; // всегда расположен в крайней правой позиции
    private int counter;

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    // добавляем элементы в направлении слева на право в самое начало списка
    public void addFirst(String e) {
        Node currentNode = new Node(e);
        counter++;
        if (checkShallWeInitList(currentNode)){
            return;
        }
        currentNode.setNext(head);
        head.setPrev(currentNode);
        head = currentNode;
    }

    // доавляем элементы в направлении слева на право в самый конец списка
    public  void addLast(String e) {
        Node currentNode =  new Node(e);
        counter++;
        if (checkShallWeInitList(currentNode)){
            return;
        }
        currentNode.setPrev(tail);
        tail.setNext(currentNode);
        tail = currentNode;
    }

    public void insert(String e){
        Node newNode =  new Node(e);
        if(checkShallWeInitList(newNode)){
            return;
        }

        if (counter == 1){
            addFirst(e);
            return;
        }

        if (counter  == 2){
            newNode.setNext(tail);
            tail.setPrev(newNode);

            newNode.setPrev(head);
            head.setNext(newNode);
            return;
        }

        Node currentNode;
        if (counter > 2){
           int center =  counter / 2;
           currentNode = head;
           int i = 0;
           while( i < center - 1){
               currentNode = currentNode.getNext();
               i++;
           }
           Node centralNode = currentNode;
           Node rightFromCenter = centralNode.getNext();
           newNode.setNext(rightFromCenter);
           rightFromCenter.setPrev(newNode);

           newNode.setPrev(centralNode);
           centralNode.setNext(newNode);
        }

    }

    public boolean contain(String e) {
        Node currentNode = head;
        do {
            if ((currentNode.getElement().equals(e))){
                return true;
            }
            currentNode = currentNode.getNext();
        } while (currentNode != null);
        return false;
    }

    private boolean checkShallWeInitList(Node currentNode){
        if (head == null && tail == null){
            head = currentNode;
            tail = currentNode;
            return true;
        }
        return false;
    }
}
