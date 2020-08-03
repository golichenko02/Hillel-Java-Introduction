package linkedList;

public interface CustomCollection {
    // метод add() в нескольких вариациях
    boolean addFirst(String str);// вставка в начало списка +

    boolean addLast(String str); // вставка в конец списка +

    boolean insert(String str); // вставка в середину списка +

    boolean insertAfter(String key, String value); // вставка после заданного значения +


    boolean addAll(String[] strArr);// ++

    boolean addAll(MyLinkedList strColl);//++

    boolean delete(int index);//++

    boolean delete(String str); //++

    String get(int index); // ++

    boolean contains(String str); // ++

    boolean clear(); // ++

    int size(); // ++

    boolean trim();// ++

    boolean compare(MyLinkedList coll);

    boolean isEmpty();//++
}

