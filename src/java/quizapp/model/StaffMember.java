package quizapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import quizapp.bean.StaffLogin;

public class StaffMember {

    /*duwiaudw
    methods here for getting and setting staff details from database
     */
    public boolean isValidStaff(int staffID) {

        boolean isStaff = false;

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

        String getStaffID = "SELECT staff_id_number FROM 16agileteam1db.profile_details WHERE staff_id_number=" + staffID;

        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(getStaffID);

            if (resultSet.next()) {
                isStaff = true;
                System.out.println("LoggedIn");
            } else {
                System.out.println("Failed to login");
                isStaff = false;
            }

            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }

        return isStaff;
    }

    public StaffLogin getProfile(int staffID) {

        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";

        int pid = 0;
        int sid = 0;
        String fn = "sql error";
        String ln = "sql error";
        String em = "sql error";
        String soul = "sql error";
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }

        Connection connection = null;

        String selectProfileQuery = "SELECT profile_id, staff_id_number, first_name, last_name, email, soul FROM 16agileteam1db.profile_details WHERE staff_id_number=" + staffID;
        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(selectProfileQuery);
            if (rs.next()) {
                pid = rs.getInt("profile_id");
                sid = rs.getInt("staff_id_number");
                fn = rs.getString("first_name");
                ln = rs.getString("last_name");
                em = rs.getString("email");
                soul = rs.getString("soul");
            }
            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }

        StaffLogin slforReturn = new StaffLogin();
        slforReturn.setProfile(sid, pid, fn, ln, em, soul);
        return slforReturn;
    }
}
