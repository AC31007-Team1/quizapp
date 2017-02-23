/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author iain
 */
public class ViewQuizStatistic {
    private Queue<Integer> statQueue = new LinkedList<Integer>();
    public Queue getQuizzes(int quizID) {
        
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

        // module id from iain
        String query = "SELECT avg_quiz_score,cumulative_quiz_attempts,cumulative_quiz_total FROM quiz_stats WHERE quiz_id =" + quizID;

        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            statQueue.add(quizID);
            while (resultSet.next()) {
                statQueue.add(resultSet.getInt("avg_quiz_score"));
                statQueue.add(resultSet.getInt("cumulative_quiz_attempts"));
                statQueue.add(resultSet.getInt("cumulative_quiz_total"));
                
            }
            

            connection.close();
            
        } catch (SQLException e) {
            e.getMessage();
        }
        
        return statQueue;
    }
}
