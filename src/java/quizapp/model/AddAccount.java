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
        /*
        String localUrl = "jdbc:mysql://localhost:3306/";
        String localdb = "quizapp";
        String luserID = "root";
        String lpassword = "root";
        */
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }
        Connection connection = null;
        Statement statement = null;
        Statement statement2 = null;
        
        String insertStaffTableSQL = "INSERT INTO 16agileteam1db.staff "
                + "VALUES("+staffID+");";
        String insertProfileTableSQL = "INSERT INTO 16agileteam1db.profile_details(staff_id_number, first_name, last_name, email, soul) "
                + "VALUES("+staffID+",'"+staffFN+"','"+staffLN+"','"+staffE+"','staff');";
        
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

    public boolean insertStudentAccount() {
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
        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            statement = connection.createStatement();
            String query = "";
            /**
             * PreparedStatement preparedStatement =
             * connection.prepareStatement(query);
             * preparedStatement.setString(1, "1");
             * preparedStatement.setString(2, question);
             * preparedStatement.execute();
             */
            connection.close();

        } catch (Exception e) {
            e.getMessage();
        }
        return true;
    }
}
