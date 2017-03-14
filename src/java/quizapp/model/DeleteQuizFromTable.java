package quizapp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import quizapp.util.DatabaseManager;

public class DeleteQuizFromTable {
    
    private DatabaseManager db = new DatabaseManager();
    
    public void DeleteQuizFromTable(int quizID) {
        
        String query = "DELETE FROM Quiz WHERE Quiz_ID=?";
        
        try(Connection connection = db.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            
            preparedStatement.setInt(1, quizID);
            
            preparedStatement.executeUpdate();
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
