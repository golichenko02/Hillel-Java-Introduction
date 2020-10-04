package dao;


import models.Student;
import org.hibernate.Session;
import utils.HibernateUtil;

import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    List<Student> students;

    @Override
    public List<Student> findAllStudents() {
        students = (List<Student>) HibernateUtil.getSessionFactory().openSession().createQuery("From Student").list();
        return students;
    }

    @Override
    public Student findStudentById(int studentId) {
        return (Student) HibernateUtil.getSessionFactory().openSession().get(Student.class, studentId);
    }

    @Override
    public List<Student> findStudentByName(String studentName) {
        return (List<Student>) HibernateUtil.getSessionFactory().openSession().createSQLQuery("Select * From Students s where s.fio like '" + studentName + "'").addEntity(Student.class).list();

    }

    @Override
    public void addStudent(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }
}
