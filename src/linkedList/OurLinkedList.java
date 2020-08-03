package linkedList;


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


    @Override
    public boolean insert(String e) {
        Node newNode = new Node(e);
        if (checkShallWeInitList(newNode)) {
            counter++;
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
            counter++;
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
            counter++;
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
        if (strArr.length == 0) return false;
        for (int i = 0; i < strArr.length; i++) {
            addLast(strArr[i]);
        }
        return true;
    }

    @Override
    public boolean addAll(OurLinkedList strColl) {
        if (strColl.isEmpty()) return false;

        Node currentNode = strColl.head;
        while (currentNode != null) {
            this.addLast(currentNode.getElement());
            currentNode = currentNode.getNext();
        }
        counter += strColl.counter;
        return true;
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
            for (int i = counter; i > index; i--)
                currentNode = currentNode.getPrev();
        }

        return delete(currentNode);

    }

    @Override
    public boolean delete(String str) {
        Node currentNode = head;
        while (!currentNode.getElement().equals(str)) {
            currentNode = currentNode.getNext();
            if (currentNode == null) return false;
        }
        return delete(currentNode);
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
        if (isEmpty()) return false;
        int index = 0, count = 0;
        Node currentNode = head;
        while (index <= counter) {
            if (currentNode.getElement() == null) {
                currentNode = currentNode.getNext();
                delete(index);
                count++;
                index++;
                continue;
            }
            currentNode = currentNode.getNext();
            index++;
        }
        return count > 0;
    }

    @Override
    public boolean compare(OurLinkedList coll) {

        if (this == coll) {
            return true;
        }

        if (coll == null || this.counter != coll.counter) return false;

        int count = 0;
        for (int i = 0; i < counter; i++) {
            if (this.get(i).equals(coll.get(i)))
                count++;
        }
        return count == counter;
    }


    @Override
    public boolean isEmpty() {
        return counter == 0;
    }

    private boolean checkShallWeInitList(Node currentNode) {
        if (head == null && tail == null) {
            head = currentNode;
            tail = currentNode;
            return true;
        }
        return false;
    }

    private boolean delete(Node currentNode) {
        if (currentNode == head) {
            currentNode.getNext().setPrev(null);
            head = currentNode.getNext();
            currentNode.setNext(null);
            counter--;
            return true;
        }

        if (currentNode == tail) {
            currentNode.getPrev().setNext(null);
            tail = currentNode.getPrev();
            currentNode.setPrev(null);
            counter--;
            return true;
        }

        currentNode.getPrev().setNext(currentNode.getNext());
        currentNode.getNext().setPrev(currentNode.getPrev());
        currentNode.setNext(null);
        currentNode.setPrev(null);
        counter--;
        return true;
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + counter);
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < counter;
    }
}
