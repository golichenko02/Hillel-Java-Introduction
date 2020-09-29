package connection_to_db;

import java.io.IOException;
import java.sql.*;

public class ConnectionToUniversity {

    private static Connection connection;


    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = getConnection();
            System.out.println("Connection to DB successful!");

            System.out.println(deleteStudent(7) + " deleted.");
            System.out.println(deleteStudent(11) + " deleted.");
            System.out.println(deleteStudent(12) + " deleted.");
            System.out.println(deleteStudent(14) + " deleted.");
            System.out.println(deleteStudent(13) + " deleted.");

            addStudent("Iryna Igorivna Kompan", "AS-182", (short) 2018);
            addStudent("Volodymyr Serhiiovych Holichenko", "AS-182", (short) 2018);
            addStudent("Maksym Viktorovych Tolstopyat", "AS-192", (short) 2019);
            addStudent("Ruslan Serhiiovych Savin", "AS-193", (short) 2019);
            addStudent("Anita Andriivna Chebanova", "PAS-193", (short) 2019);
            addStudent("Zlata Andriivna Kuznetsova", "AS-193", (short) 2019);
            addStudent("Anastasiia Bangivna Chan", "AS-192", (short) 2019);
            addStudent("Daniil Yurievich Bykov", "EAS-193", (short) 2019);


            printAllStudents();
            printStudentById(17);
            printStudentById(18);
            printStudentById(19);
            printStudentsByName("anastasiia    bangivna    chan");
            printStudentsByName("volodymyr        Serhiiovych    holichenko");
            connection.close();
        } catch (ClassNotFoundException | IOException | SQLException ex) {
            System.out.println("Connection failed...");
            ex.printStackTrace();
        }

    }


    public static void addStudent(String fio, String groupName, Short yearOfAdmission) throws SQLException {
        String sql = "INSERT INTO university.students (fio, group_id, year_of_admission) Values (?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, fio);
        preparedStatement.setShort(2, getGroupId(groupName));
        preparedStatement.setShort(3, yearOfAdmission);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public static String deleteStudent(int studentId) throws SQLException {
        Statement statement = connection.createStatement();
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE  FROM university.students WHERE student_id = ?");
        preparedStatement.setInt(1, studentId);
        ResultSet rs = statement.executeQuery("SELECT fio FROM university.students WHERE student_id = " + studentId);
        preparedStatement.executeUpdate();
        rs.next();
        String deletedSt = rs.getString(1);
        preparedStatement.close();
        statement.close();
        return deletedSt;
    }

    public static void printAllStudents() throws SQLException {
        System.out.println("List of all students");
        printStudents(sqlQuery() + orderBy());
    }

    public static void printStudentById(int studentId) throws SQLException {
        System.out.print("Student with ID " + studentId + ": ");
        printStudents(sqlQuery() + " WHERE s.student_id = " + studentId);
    }

    public static void printStudentsByName(String name) throws SQLException {
        System.out.println("Info about student " + normalize(name) + ": ");
        printStudents(sqlQuery() + String.format(" WHERE s.fio LIKE '%s'", normalize(name)));
    }

    private static String normalize(String name) {
        String[] fio = name.trim().split("\\s+");
        return Character.toUpperCase(fio[0].charAt(0)) + fio[0].substring(1) + " " +
                Character.toUpperCase(fio[1].charAt(0)) + fio[1].substring(1) + " " +
                Character.toUpperCase(fio[2].charAt(0)) + fio[2].substring(1);
    }

    private static String sqlQuery() {
        return "SELECT s.fio fio, s.year_of_admission, g.group_name g_name " +
                " FROM university.students s LEFT JOIN university.groups g ON s.group_id = g.group_id ";
    }

    private static String orderBy() {
        return " ORDER BY g_name, fio";
    }


    private static void printStudents(String sqlQuery) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            System.out.printf("%-30s" + "%d" + "\t%s\n", resultSet.getString(1), resultSet.getShort(2), resultSet.getString(3));

        }
    }


    private static Short getGroupId(String groupName) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = String.format("SELECT DISTINCT group_id FROM university.groups WHERE group_name LIKE '%s' limit 1", groupName);
        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            Short groupId = resultSet.getShort("group_id");
            statement.close();
            return groupId;
        } else {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO university.groups (group_name) value (?)");
            preparedStatement.setString(1, groupName);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            return getGroupId(groupName);
        }
    }

    private static Connection getConnection() throws SQLException, IOException {
        String url = "jdbc:mysql://localhost/university?serverTimezone=UTC&useSSL=false";
        String username = "root";
        String password = "Holichenko_02";

        return DriverManager.getConnection(url, username, password);
    }
}
