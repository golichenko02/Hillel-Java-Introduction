package set;


import java.util.*;

public class NoDublicatesCollection {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(8);
        arrayList.add(8);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(5);
        System.out.println(arrayList);

        System.out.println(removeDubl(arrayList));


    }

    public static Collection removeDubl(Collection collection){
        return new HashSet(collection);
    }
}
