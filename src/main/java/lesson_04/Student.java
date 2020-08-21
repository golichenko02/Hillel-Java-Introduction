package lesson_04;

public class Student {
    public String name;
    public Integer age;
    public String sex;
    public String group;
    public Integer course;

    public Student(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public void printInfo() {
        System.out.println("name: " + name +
                ", age: " + age +
                ", sex: " + sex +
                ", group: " + group +
                ", course: " + course);
    }
}

class RunStudent {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Vova", 17, "M");
        students[1] = new Student("Vova", 20, "M");
        students[2] = new Student("Vova", 16, "M");
        students[3] = new Student("Vova", 19, "M");
        students[4] = new Student("Vova", 18, "M");

        students[5] = new Student("Masha", 18, "F");
        students[6] = new Student("Masha", 23, "F");
        students[7] = new Student("Masha", 25, "F");
        students[8] = new Student("Masha", 19, "F");
        students[9] = new Student("Masha", 17, "F");

        students = groupRouting(students);
        for (Student st : students) {
            st.printInfo();
        }
    }

    static Student[] groupRouting(Student[] students) {
        for (Student st : students) {
            setValues(st);
        }
        return students;
    }

    static void setValues(Student student) {
        switch (student.age) {
            case 18:
                student.course = 1;
                student.group = student.sex + "_" + student.course;
                break;
            case 19:
                student.course = 2;
                student.group = student.sex + "_" + student.course;
                break;
            case 20:
                student.course = 3;
                student.group = student.sex + "_" + student.course;
                break;
            case 21:
                student.course = 4;
                student.group = student.sex + "_" + student.course;
                break;
            default:
                student.course = 0;
                student.group = "You are schoolar";
        }
    }
}
