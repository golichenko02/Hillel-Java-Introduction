package collectionExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapsEx {
    public static void main(String[] args) {
        HashMap<String, Car> mapAutoFans = new HashMap<>();

        // FIO <--> Car

        mapAutoFans.put("Yurii", new Car("Tesla"));
        mapAutoFans.put("Alex", new Car("Cubic"));
        mapAutoFans.put("Max", new Car("XXX"));

        System.out.println(mapAutoFans.size()); // 3

        for (Map.Entry<String,Car> pair : mapAutoFans.entrySet() ) {
            System.out.println(pair.getKey() + "\t" + pair.getValue());
        }

        System.out.println("Keys:");
        System.out.println(mapAutoFans.keySet().toString());
        System.out.println();
        System.out.println("Values:");
        System.out.println(mapAutoFans.values().toString());

        mapAutoFans.remove("Alex");
        System.out.println();
        for (Map.Entry<String,Car> pair : mapAutoFans.entrySet() ) {
            System.out.println(pair.getKey() + "\t" + pair.getValue());
        }
    }

    public void handleCollection(List<String> anyList){
        Iterator<String> it = anyList.iterator();
        while(it.hasNext()){
            it.next();
        }
    }

}
