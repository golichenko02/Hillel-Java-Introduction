package test_features.npe_switch_record;

import java.util.ArrayList;

import static test_features.npe_switch_record.Student.Course.*;

public class NPE {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(new Human("Ivan", "Ivanov"), 181));
        students.add(new Student(new Human("Petr","Petrov"),  201));
        students.add(new Student(new Human("Oleg","Sidorov"),  SECOND, 191));


        int random = (int) (Math.random() * students.size());
        System.out.println(random);
        Student student = students.get(random);

        try {
            System.out.println(student.getCourse().hashCode()); // по-любому вылетит умный NPE при одном из запусков
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        switch (student.getGroup()) {
            case 201,202,203,204 ->  student.setCourse(FIRST);
            case 191,192,193,194 ->  student.setCourse(SECOND);
            case 181,182,183 ->  student.setCourse(THIRD);
            case 171,172,173 ->  student.setCourse(FOURTH);
            case 161,162 ->  student.setCourse(FIFTH);
            case 151,152 ->  student.setCourse(SIXTH);
            default -> student.setCourse(UNKNOWN);
        }
        System.out.println(student.getCourse());// тут уже засетили


    }
}
