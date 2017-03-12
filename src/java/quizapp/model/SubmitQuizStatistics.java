package quizapp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import quizpp.util.DatabaseManager;

public class SubmitQuizStatistics {
    
    private DatabaseManager db = new DatabaseManager();
    
    private String quizID;
    private int quizScore;
    private int newAverage;
    private int newAttempts;
    private int newTotal;
    private boolean activeTable = false;

    public SubmitQuizStatistics(String quizID, int quizScore) {
        this.quizID = quizID;
        this.quizScore = quizScore;
    } 
    
    public void getInitResults() {
            
        String query = "SELECT * FROM quiz_stats WHERE quiz_id=" + quizID;
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next())
            {
                activeTable = true;
                newAverage = resultSet.getInt("avg_quiz_score");
                newAttempts = resultSet.getInt("cumulative_quiz_attempts");
                newTotal = resultSet.getInt("cumulative_quiz_total");
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void enterResults() {
        
        getInitResults();
        
        newTotal = newTotal + quizScore;
        newAttempts++;
        newAverage = (newTotal/newAttempts);
        
        String query = "UPDATE quiz_stats SET avg_quiz_score = ?, cumulative_quiz_attempts = ?, cumulative_quiz_total = ? WHERE quiz_id = ?";
        
        try(Connection connection = db.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            
            if(activeTable) {
                preparedStatement.setInt( 1, newAverage ); 
                preparedStatement.setInt( 2, newAttempts );
                preparedStatement.setInt( 3, newTotal );
                preparedStatement.setString( 4, quizID );
                
                preparedStatement.executeUpdate();
            
            connection.close();
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
