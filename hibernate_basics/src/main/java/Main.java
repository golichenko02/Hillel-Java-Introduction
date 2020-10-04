import models.*;
import services.StudentService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentService studentService = new StudentService();

        Student student = new Student("Oleksandr Heorhiyovych Kiritsa", (short) 2019, new StudentGroups("AS-192"));
        student.setMarks(List.of(new Mark((byte) 90, student, new Lesson("Math", (byte) 1, (short) 2019, new Teacher("Viktoriia Volodymyrivna Hribova", new Department("Math Dep", "Usov"))))));
        studentService.addStudent(student);

        studentService.findStudentByName("Iryna Igorivna Kompan").forEach(System.out::println);

        System.out.println(studentService.findStudentById(7));

        studentService.findAllStudents().forEach(System.out::println);
    }
}
