package quizapp.model;

import java.sql.*;

public class AddAccount {

    public AddAccount() {
    }

    public boolean insertStaffAccount() {
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
