package stringExamples;

public class TestStrings {
    public static void main(String[] args) {
        /**
         * All strings hold in pool of strings
         * pool - не бассейн, а набор данных
         */
        String name1 = "Yurii"; // 100

        String name2 = "George";// 110

        String name3 = "Yurii"; // name3 -> name 1 = 100

       //  name2 = name2 + " Washington";//"George Washington" -> 150

        String name4 = new String("Yurii"); // heap / куча -> (!= 100) 1000
        String name5 = new String("George");
        String name6 = new String("Elena");

        System.out.println(name1); // java extract string data from pool string
        System.out.println(name4); // java extract data not from string pool, but from Heap type memory
        //System.out.println(name2);

        name1.equals(name4); //true - если равны, false- в ином случае

        if (name1 == name2){
            System.out.println("Wrong");
        }else if(name1 == name4){
            System.out.println("Wrong");
        }else if(name1 == name3){
            System.out.println("True!");
        }
    }
}
