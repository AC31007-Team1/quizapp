package quizapp.model;

import java.sql.*;

public class AddAccount {

    public AddAccount() {
    }

    public boolean insertStaffAccount(String staffID, String staffN, String staffE) {
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String localUrl = "jdbc:mysql://localhost:3306/";
        String localdb = "quizapp";
        String dbName = "16agileteam1db";
        //hide userID & password (shippable?)
        String userID = "16agileteam1";
        String password = "8320.at1.0238";
        String luserID = "root";
        String lpassword = "abc";
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }
        Connection connection = null;
        Statement statement = null;
        Statement statement2 = null;
        String insertStaffTableSQL = "INSERT INTO quizapp.staff "
                + "VALUES("+staffID+");";
        String insertProfileTableSQL = "INSERT INTO quizapp.profile_details(staff_id_number, first_name, last_name, email, soul) "
                + "VALUES("+staffID+",'"+staffN+"','lollypop','"+staffE+"','staff');";
        try {
            //staff id number will be made by staff Craig will fix
            connection = DriverManager.getConnection(localUrl + localdb, luserID, lpassword);
            statement = connection.createStatement();
            statement2 = connection.createStatement();
            //statement.addBatch(insertStaffTableSQL);
            //statement.addBatch(insertProfileTableSQL);
            statement.execute(insertStaffTableSQL);
            statement2.execute(insertProfileTableSQL);
            connection.close();
            return true;
        } catch (Exception e) {
            e.getMessage();
        }
        return false;
    }

    public boolean insertStudentAccount() {
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://localhost:3306/";
        String dbName = "quizcraigdb";
        String userID = "root";
        String password = "abc";
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
