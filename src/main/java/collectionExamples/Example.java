package collectionExamples;

import compare.Book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Example {
    public static void main(String[] args) {

    //    ArrayList<>
        // class wrapper - класс обертка
        // Integer/Double/Float/Char/Byte/Short/Long/Boolean

        Boolean b1 = true; // object
        boolean b2 = false;

       // System.out.println(b1.compareTo(b2)); // usually sorting

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ABC");
        arrayList.add("ABC");
        arrayList.add("ADD");
        arrayList.add("ADD");
        arrayList.add("XDD"); // remove it
        arrayList.add("XSX"); // remove it
        arrayList.add("ABZ");

        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
           String e =  it.next();
            if(e.startsWith("X")) {
                it.remove();
            }
        }
        System.out.println(arrayList.toString());

        HashSet<Integer> setInts = new HashSet<>();
        setInts.add(1);
        setInts.add(2);
        setInts.add(3);
        setInts.add(4);
        setInts.add(5);
        setInts.add(5);

        Iterator<Integer> iterator = setInts.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


//        HashSet<String > set1 = new HashSet<>(); // множество - нельзя хранить дубликаты, хранит в случайном порядке
//        set1.addAll(arrayList);
//        System.out.println(set1.toString());

    }
}
