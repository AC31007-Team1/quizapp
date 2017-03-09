package quizapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import quizapp.bean.StaffLogin;

public class ChangeProfileDetails {

    public boolean editStaffProfile(String firstN, String lastN, int staffID) {

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
        String update_staff = "UPDATE 16agileteam1db.profile_details SET first_name = '" + firstN + "', last_name = '" + lastN + "' WHERE staff_id_number = " + staffID + ";";

        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();

            statement.execute(update_staff);

            System.out.println("Record updated successfully");

            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }
        return true;
    }

    public boolean editStudentProfile(String firstN, String lastN, int matricN) {

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

        String update_student = "UPDATE 16agileteam1db.profile_details SET first_name = '" + firstN + "', last_name = '" + lastN + "' WHERE matriculation_number = " + matricN + ";";

        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();

            statement.execute(update_student);

            System.out.println("Record updated successfully");

            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }

        return true;
    }
}
