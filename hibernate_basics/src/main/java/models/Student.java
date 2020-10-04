package models;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "fio", length = 255, nullable = false, unique = true)
    private String fio;

    @Column(name = "year_of_admission", nullable = false)
    private short yearOfAdmission;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", nullable = false)
    private StudentGroups groupId;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Mark> marks;

    public Student(String fio, short yearOfAdmission, StudentGroups group) {
        this.fio = fio;
        this.yearOfAdmission = yearOfAdmission;
        this.groupId = group;
        marks = new ArrayList<>();
    }

    public void addMark(Mark mark) {
        mark.setStudent(this);
        marks.add(mark);
    }

    public void removeMark(Mark mark) {
        marks.remove(mark);
    }


    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public short getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(short yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public StudentGroups getGroupId() {
        return groupId;
    }

    public void setGroupId(StudentGroups group) {
        this.groupId = group;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", yearOfAdmission=" + yearOfAdmission +
                ", group=" + groupId +
                '}';
    }
}
