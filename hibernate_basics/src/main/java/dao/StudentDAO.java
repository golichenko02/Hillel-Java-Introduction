package dao;

import models.Student;

import java.util.List;

public interface StudentDAO {

    List<Student> findAllStudents();

    Student findStudentById(int studentId);

    List<Student> findStudentByName(String studentName);

    void addStudent(Student student);

}
