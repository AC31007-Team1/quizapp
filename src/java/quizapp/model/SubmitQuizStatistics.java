package quizapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SubmitQuizStatistics {
    
    private String quizID;
    private int quizScore;
    private int newAverage;
    private int newAttempts;
    private int newTotal;
    private boolean activeTable = false;
    
    private String driverName = "com.mysql.jdbc.Driver";
    private String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
    private String dbName = "16agileteam1db";
    private String userID = "16agileteam1";
    private String password = "8320.at1.0238";

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
                activeTable = true;
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
            
            if(activeTable) {
                PreparedStatement pstmt = connection.prepareStatement(
                "UPDATE quiz_stats SET avg_quiz_score = ?, cumulative_quiz_attempts = ?, cumulative_quiz_total = ? WHERE quiz_id = ?");
                pstmt.setInt( 1, newAverage );
                pstmt.setInt( 2, newAttempts ); 
                pstmt.setInt(3, newTotal );
                pstmt.setString( 4, quizID ); 
            
                pstmt.executeUpdate();
            
                connection.close();
            
            } else {
            PreparedStatement pstmt = connection.prepareStatement(
            "INSERT INTO quiz_stats(quiz_id, avg_quiz_score, cumulative_quiz_attempts, cumulative_quiz_total) " + " values (?, ?, ?, ?)");
            pstmt.setString( 1, quizID );
            pstmt.setInt( 2, newAverage ); 
            pstmt.setInt(3, newAttempts );
            pstmt.setInt( 4, newTotal ); 
            
            pstmt.executeUpdate();
            
            connection.close();
            } 
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
