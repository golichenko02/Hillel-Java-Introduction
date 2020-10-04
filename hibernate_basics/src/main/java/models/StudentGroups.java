package models;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity
@Table(name = "student_groups")
public class StudentGroups {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "group_name", length = 30, nullable = false, unique = true)
    private String groupName;

    @OneToMany(mappedBy = "groupId", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Student> students;

    public StudentGroups(String group) {
        this.groupName = group;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        student.setGroupId(this);
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public int getId() {
        return id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String group) {
        this.groupName = group;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "id=" + id +
                ", group='" + groupName + '\'' +
                '}';
    }
}
