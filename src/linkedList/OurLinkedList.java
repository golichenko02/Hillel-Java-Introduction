package linkedList;

import java.util.LinkedList;

public class OurLinkedList implements CustomCollection {
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
    @Override
    public boolean addFirst(String e) {
        Node currentNode = new Node(e);
        counter++;
        if (checkShallWeInitList(currentNode)) {
            return true;
        }
        currentNode.setNext(head);
        head.setPrev(currentNode);
        head = currentNode;
        return true;
    }

    // доавляем элементы в направлении слева на право в самый конец списка
    @Override
    public boolean addLast(String e) {
        Node currentNode = new Node(e);
        counter++;
        if (checkShallWeInitList(currentNode)) {
            return true;
        }
        currentNode.setPrev(tail);
        tail.setNext(currentNode);
        tail = currentNode;
        return true;
    }

    //вставка в середину
    @Override
    public boolean insert(String e) {
        Node newNode = new Node(e);
        if (checkShallWeInitList(newNode)) {
            return true;
        }

        if (counter == 1) {
            addFirst(e);
            return true;
        }

        if (counter == 2) {
            newNode.setNext(tail);
            tail.setPrev(newNode);

            newNode.setPrev(head);
            head.setNext(newNode);
            return true;
        }

        Node currentNode;
        if (counter > 2) {
            int center = counter / 2;
            currentNode = head;
            int i = 0;
            while (i < center - 1) {
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
        return true;
    }

    @Override
    public boolean insertAfter(String key, String value) {
        Node currentNode = head;
        while (!currentNode.getElement().equals(key)) {
            currentNode = currentNode.getNext();
            if (currentNode == null) return false;
        }

        Node newNode = new Node(value);
        counter++;

        if (currentNode == tail) {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
            return true;
        }

        if (currentNode == head) {
            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
            return true;
        }

        newNode.setNext(currentNode.getNext());
        newNode.setPrev(currentNode);
        currentNode.getNext().setPrev(newNode);
        currentNode.setNext(newNode);

        return true;
    }

    @Override
    public boolean contains(String e) {
        Node currentNode = head;
        do {
            if ((currentNode.getElement().equals(e))) {
                return true;
            }
            currentNode = currentNode.getNext();
        } while (currentNode != null);
        return false;
    }


    @Override
    public boolean addAll(String[] strArr) {
        return false;
    }

    @Override
    public boolean addAll(CustomCollection strColl) {
        return false;
    }

    @Override
    public boolean delete(int index) {
        checkElementIndex(index);

        Node currentNode;
        if (index < (counter / 2)) {
            currentNode = head;
            for (int i = 0; i < index; i++)
                currentNode = currentNode.getNext();
        } else {
            currentNode = tail;
            for (int i = counter - 1; i > index; i--)
                currentNode = currentNode.getPrev();
        }

        if (currentNode == head) {
            currentNode.getNext().setPrev(null);
            head = currentNode.getNext();
            currentNode.setNext(null);
            return true;
        }

        if (currentNode == tail) {
            currentNode.getPrev().setNext(null);
            tail = currentNode.getPrev();
            currentNode.setPrev(null);
            return true;
        }

        currentNode.getPrev().setNext(currentNode.getNext());
        currentNode.getNext().setPrev(currentNode.getPrev());
        currentNode.setNext(null);
        currentNode.setPrev(null);
        return true;

    }

    @Override
    public boolean delete(String str) {
        Node currentNode = head;
        while (!currentNode.getElement().equals(str)) {
            currentNode = currentNode.getNext();
            if (currentNode == null) return false;
        }

        if (currentNode == head) {
            currentNode.getNext().setPrev(null);
            head = currentNode.getNext();
            currentNode.setNext(null);
            return true;
        }

        if (currentNode == tail) {
            currentNode.getPrev().setNext(null);
            tail = currentNode.getPrev();
            currentNode.setPrev(null);
            return true;
        }

        currentNode.getPrev().setNext(currentNode.getNext());
        currentNode.getNext().setPrev(currentNode.getPrev());
        currentNode.setNext(null);
        currentNode.setPrev(null);
        return true;

    }

    @Override
    public String get(int index) {
        checkElementIndex(index);

        Node x;
        if (index < (counter / 2)) {
            x = head;
            for (int i = 0; i < index; i++)
                x = x.getNext();
        } else {
            x = tail;
            for (int i = counter - 1; i > index; i--)
                x = x.getPrev();
        }
        return x.getElement();
    }


    @Override
    public boolean clear() {
        if (counter == 0)
            return false;
        for (Node node = head; node != null; ) {

            Node next = node.getNext();
            node.setNext(null);
            node.setPrev(null);
            node = next;
        }
        head = tail = null;
        counter = 0;
        return true;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public boolean trim() {
        return false;
    }

    @Override
    public boolean compare(CustomCollection coll) {
        return false;
    }

    private boolean checkShallWeInitList(Node currentNode) {
        if (head == null && tail == null) {
            head = currentNode;
            tail = currentNode;
            return true;
        }
        return false;
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + counter);
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < counter;
    }
}
