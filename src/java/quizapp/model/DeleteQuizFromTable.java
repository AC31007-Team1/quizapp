/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author warrenmansell
 */


public class DeleteQuizFromTable {
    public void DeleteQuizFromTable(int quizID)
    {
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://localhost:3306/";
        String dbName = "quizme";
        String userID = "root";
        String password = "root";

        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }


        Connection connection = null;
        Statement statement = null;


        // first value set as 1 as quiz_id is one, this will be gathered before hand once quizzes are dynamic
        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            statement = connection.createStatement();
            String query = "DELETE FROM Quiz WHERE Quiz_ID=?";
            
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setInt(1, quizID);
            
            preparedStatement.executeUpdate();
            
            connection.close();


        } catch (Exception e) {
            e.getMessage();
        }
    }
    
}
