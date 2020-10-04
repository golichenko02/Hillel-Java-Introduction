package services;

import dao.StudentDAOImpl;
import models.Student;

import java.util.List;

public class StudentService {

    private StudentDAOImpl studentDAO = new StudentDAOImpl();


    public List<Student> findAllStudents() {
        return studentDAO.findAllStudents();
    }

    public Student findStudentById(int studentId) {
        return studentDAO.findStudentById(studentId);
    }

    public List<Student> findStudentByName(String studentName) {
        return studentDAO.findStudentByName(studentName);
    }

    public void addStudent(Student student) {
        studentDAO.addStudent(student);
    }
}
