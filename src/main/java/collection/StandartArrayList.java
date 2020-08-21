package collection;

import java.util.ArrayList;

public class StandartArrayList {
    public static void main(String[] args) {
        ArrayList<String> listStudentsGroupA = new ArrayList();


        listStudentsGroupA.add("Yurii");
        listStudentsGroupA.add("Nick");
        listStudentsGroupA.add("Olga");

        ArrayList<String> listStudentsGroupB = new ArrayList<>();
        listStudentsGroupB.add("Nata");
        listStudentsGroupB.add("Eugene");
        listStudentsGroupB.add("Max");

        ArrayList<String> neargedListAllStudents = new ArrayList<>();
        neargedListAllStudents.addAll(listStudentsGroupA);
        neargedListAllStudents.addAll(listStudentsGroupB);

        System.out.println(neargedListAllStudents.contains("Olga"));

        System.out.println(neargedListAllStudents.indexOf("Eugene"));

        for (String e: neargedListAllStudents) {
            System.out.println(e);
        }

        neargedListAllStudents.isEmpty();
        neargedListAllStudents.clear();
        neargedListAllStudents.get(1);



    }
}
