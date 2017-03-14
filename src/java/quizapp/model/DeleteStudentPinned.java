package quizapp.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import quizapp.util.DatabaseManager;

public class DeleteStudentPinned {
    
    private DatabaseManager db = new DatabaseManager();
    private boolean status = false;

    public boolean deletePinned(int quizID,int studentID) {
        
        String query = "DELETE FROM 16agileteam1db.stu_fav WHERE quiz_id=" + quizID + " AND matriculation_number=" + studentID;
        
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            statement.execute(query);
            
            status = true;
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
            e.printStackTrace();
        }
        return status;
    }
}
