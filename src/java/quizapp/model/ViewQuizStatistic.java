package quizapp.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Queue;
import quizpp.util.DatabaseManager;

public class ViewQuizStatistic {
    
    private DatabaseManager db = new DatabaseManager();
    
    private Queue<Integer> statQueue = new LinkedList<Integer>();
    
    public Queue getQuizzes(int quizID) {
        
        String query = "SELECT avg_quiz_score,cumulative_quiz_attempts,cumulative_quiz_total FROM quiz_stats WHERE quiz_id =" + quizID;
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            ResultSet resultSet = statement.executeQuery(query);
            statQueue.add(quizID);
            while (resultSet.next()) {
                statQueue.add(resultSet.getInt("avg_quiz_score"));
                statQueue.add(resultSet.getInt("cumulative_quiz_attempts"));
                statQueue.add(resultSet.getInt("cumulative_quiz_total"));  
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return statQueue;
    }
}
