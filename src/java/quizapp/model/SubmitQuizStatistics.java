/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Anthony
 */
public class SubmitQuizStatistics {
    
    private String quizID;
    private int quizScore;
    private int newAverage;
    private int newAttempts;
    private int newTotal;
    
    String driverName = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
    String dbName = "16agileteam1db";
    String userID = "16agileteam1";
    String password = "8320.at1.0238";

    public SubmitQuizStatistics(String quizID, int quizScore) {
        this.quizID = quizID;
        this.quizScore = quizScore;
    } 
    
    public void getInitResults() {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            
            Statement statement = connection.createStatement();
            
            String query = "SELECT * FROM quiz_stats WHERE quiz_id=" + quizID;
            
            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next())
            {
                newAverage = resultSet.getInt("avg_quiz_score");
                newAttempts = resultSet.getInt("cumulative_quiz_attempts");
                newTotal = resultSet.getInt("cumulative_quiz_total");
            }
            
            connection.close();
            
        } catch (SQLException e) {
            e.getMessage();
        }
    }
    
    public void enterResults() {
        // Average = sum / total
        
        getInitResults();
        
        newTotal = newTotal + quizScore;
        newAttempts++;
        newAverage = (newTotal/newAttempts);
        
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            
            // need check somewhere to prevent row duplication e.g. if row exists do insert if not do update
            PreparedStatement pstmt = connection.prepareStatement(
            "INSERT INTO quiz_stats(quiz_id, avg_quiz_score, cumulative_quiz_attempts, cumulative_quiz_total) " + " values (?, ?, ?, ?)");
            pstmt.setString( 1, quizID );
            pstmt.setInt( 2, newAverage ); 
            pstmt.setInt(3, newAttempts );
            pstmt.setInt( 4, newTotal ); 
            
            pstmt.executeUpdate();
            
            connection.close();
            
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
