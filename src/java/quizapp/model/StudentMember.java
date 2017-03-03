package quizapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import quizapp.bean.StudentLogin;

public class StudentMember {

    /*
    methods here for getting and setting student details from database
     */
    public boolean isValidStudent(int studentID) {

        boolean isStudent = false;
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";

        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }

        Connection connection = null;

        String getStudentID = "SELECT matriculation_number FROM student WHERE matriculation_number=" + studentID;

        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(getStudentID);

            if (resultSet.next()) {
                isStudent = true;
                System.out.println("LoggedIn");
            } else {
                System.out.println("Failed to login");
                isStudent = false;
            }

            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }

        return isStudent;
    }
    
    public StudentLogin getProfile(int matricN) {

        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";

        int pid = 0;
        int mN = 0;
        String fn = "sql error";
        String ln = "sql error";
        String em = "sql error";
        String soul = "sql error";
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }

        Connection connection = null;

        String selectProfileQuery = "SELECT profile_id, matriculation_number, first_name, last_name, email, soul FROM 16agileteam1db.profile_details WHERE matriculation_number=" + matricN;
        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(selectProfileQuery);
            if (rs.next()) {
                pid = rs.getInt("profile_id");
                mN = rs.getInt("matriculation_number");
                fn = rs.getString("first_name");
                ln = rs.getString("last_name");
                em = rs.getString("email");
                soul = rs.getString("soul");
            }
            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }

        StudentLogin slforReturn = new StudentLogin();
        slforReturn.setProfile(mN, pid, fn, ln, em, soul);
        return slforReturn;
    }
}
