package strings;
import java.util.*;
public class Laba_4 {
    /**
     *  Задані два рядки. Скласти третій рядок з символів, що зустрічаються в кожному з рядків не менше 2 разів
     *  */
    private static void fillMap(String s, Map<Character,Integer> map) {
        for (char c : s.toCharArray()) {
            Integer count = map.get(c);
            if (count == null) {
                count = 0;
            }
            map.put(c,++count);
        }

        Iterator<Map.Entry<Character,Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Character,Integer> entry = it.next();
            if (entry.getValue() < 2) {
                it.remove();
            }
        }
    }
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "ss";


        Map<Character, Integer> hMap = new HashMap<>();
        Set<Character> hSet = new HashSet<>();
        fillMap(s1,hMap);
        hSet.addAll(hMap.keySet());
        hMap.clear();
        fillMap(s2,hMap);
        hSet.addAll(hMap.keySet());
        String s3 = "";
        for (Character character : hSet) {
            s3 += character;
        }
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);

    }
}
