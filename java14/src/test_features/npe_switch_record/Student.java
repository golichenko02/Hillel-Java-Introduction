package test_features.npe_switch_record;

public class Student {


    public enum Course {FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, UNKNOWN}

    private Human human;
    private Course course;
    private Integer group;


    public Student(Human human, Course course, Integer group) {
        this.human = human;
        this.course = course;
        this.group = group;
    }

    public Student(Human human, Integer group) {
        this.group = group;
        this.human = human;
    }

    public Human getHuman() {
        return human;
    }

    public Course getCourse() {
        return course;
    }


    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
