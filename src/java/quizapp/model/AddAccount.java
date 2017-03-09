package quizapp.model;

import java.sql.*;

public class AddAccount {

    public AddAccount() {
    }

    public boolean insertStaffAccount(String staffID, String staffFN, String staffLN, String staffE) {
        String driverName = "com.mysql.jdbc.Driver";
        //hide userID & password (shippable?)
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";

        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }
        Connection connection = null;
        Statement statement = null;
        Statement statement2 = null;

        String insertStaffTableSQL = "INSERT INTO 16agileteam1db.staff "
                + "VALUES(" + staffID + ");";
        String insertProfileTableSQL = "INSERT INTO 16agileteam1db.profile_details(staff_id_number, first_name, last_name, email, soul) "
                + "VALUES(" + staffID + ",'" + staffFN + "','" + staffLN + "','" + staffE + "','staff');";

        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            statement = connection.createStatement();
            statement2 = connection.createStatement();
            statement.execute(insertStaffTableSQL);
            statement2.execute(insertProfileTableSQL);
            connection.close();
            return true;
        } catch (SQLException e) {
            e.getMessage();
        }
        return false;
    }

    public boolean insertStudentAccount(String matricN, String studentFN, String studentLN, String studentE) {
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
        Statement statement = null;
        Statement statement2 = null;
        
        String insertStudentTableSQL = "INSERT INTO 16agileteam1db.student (matriculation_number) "
                + "VALUES(" + matricN + ");";
        String insertProfileTableSQL = "INSERT INTO 16agileteam1db.profile_details(matriculation_number, first_name, last_name, email, soul) "
                + "VALUES(" + matricN + ",'" + studentFN + "','" + studentLN + "','" + studentE + "','student');";
        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            statement = connection.createStatement();
            statement2 = connection.createStatement();
            statement.execute(insertStudentTableSQL);
            statement2.execute(insertProfileTableSQL);
            connection.close();
            return true;
        } catch (Exception e) {
            e.getMessage();
        }
        return false;
    }
}
