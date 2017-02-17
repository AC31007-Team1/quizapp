package quizapp.model;

import java.sql.*;

public class AddAccount {

    public AddAccount() {
    }

    public boolean insertStaffAccount(String staffN, String staffE) {
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://localhost:3306/";
        String dbName = "quizapp";
        //hide userID & password (shippable?)
        String userID = "root";
        String password = "abc";
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }

        Connection connection = null;
        Statement statement = null;
        try {
            //staff id number will be made by staff Craig will fix
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizapp", userID, password);
            statement = connection.createStatement();
            String query = "INSERT INTO quizapp.profile_details(staff_id_number, first_name, last_name, email, status) VALUES (?, ?, ?, ?, 'staff');";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "");
            preparedStatement.setString(2,staffN);
            preparedStatement.setString(3,"''");
            preparedStatement.setString(4,staffE);
            connection.prepareStatement(query);
            preparedStatement.execute();
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
