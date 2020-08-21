package string_collection;


public class TestCollection {
    public static void main(String[] args) {
        StringCollection firstGroup = new StringCollection();
        StringCollection secondGroup = new StringCollection();

        secondGroup.add("Vova");
        secondGroup.add("Liza");

        firstGroup.add("Vova");
        firstGroup.add("Liza");

        System.out.println(firstGroup.equals(secondGroup));//true

        firstGroup.add("Olia");
        firstGroup.add("Masha");

        System.out.println(firstGroup.equals(secondGroup));//false


        firstGroup.add(0, "Vlad");
        firstGroup.add(0, "Valera");
        firstGroup.add(6, "Ksenia");
        firstGroup.showAll();

        System.out.println(firstGroup.contains("Vlad")); //true
        System.out.println(firstGroup.get(0)); // Valera
        firstGroup.delete("Ksenia");
        firstGroup.delete(2);
        System.out.println(firstGroup.size());// 5

        firstGroup.showAll();
        firstGroup.clear();
        System.out.println(firstGroup.size());// 0
        firstGroup.showAll(); //empty list

//        System.out.println(firstGroup.contains("vlad"));
//        System.out.println(firstGroup.get(5));


    }
}
