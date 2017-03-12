package quizapp.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import quizpp.util.DatabaseManager;

public class DeleteStaffQuiz {
    
    private DatabaseManager db = new DatabaseManager();
    private boolean status = false;

    public boolean delete(int quizID) {
        
        String query1 = "DELETE FROM 16agileteam1db.quiz_answers WHERE quiz_id=" + quizID;
        String query2 = "DELETE FROM 16agileteam1db.quiz_questions WHERE quiz_id =" + quizID;
        String query3 = "DELETE FROM 16agileteam1db.quiz_stats WHERE quiz_id =" + quizID;
        String query4 = "DELETE FROM 16agileteam1db.quiz WHERE quiz_id =" + quizID;
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            statement.addBatch(query1);
            statement.addBatch(query2);
            statement.addBatch(query3);
            statement.addBatch(query4);
            
            statement.executeBatch();
            
            status = true;
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
            e.printStackTrace();
        }
        return status;
    }
    
    public boolean changeAvailability(int quizID) {
        
        int currentA = 0;

        String query1 = "SELECT quiz_available FROM 16agileteam1db.quiz WHERE quiz_id = " + quizID;
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            ResultSet rs = statement.executeQuery(query1);
            
            while(rs.next()) {
                currentA = rs.getInt("quiz_available");
            }
            if(currentA == 1){
                currentA = 0;
            }
            else{
                currentA = 1;
            }
            
            String query2 = "UPDATE 16agileteam1db.quiz SET quiz_available = " + currentA + " WHERE quiz_id = " + quizID;
            
            statement.execute(query2);
            
            status = true;
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
            e.printStackTrace();
        }
        return status;
    }
}
