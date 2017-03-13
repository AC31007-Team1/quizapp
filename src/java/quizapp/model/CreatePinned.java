package quizapp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import quizapp.util.DatabaseManager;

public class CreatePinned {
    
    private DatabaseManager db = new DatabaseManager();
    boolean pinnedStatus = false;

    public void insertPinned(String quizID, int studentID) {
        
        String query = "INSERT INTO 16agileteam1db.stu_fav (quiz_id, matriculation_number ) "
                        + " values (?, ?)";

        boolean pinned = checkPinned(quizID, studentID);
        
        if (pinned) {
            try(Connection connection = db.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {

                preparedStatement.setString(1, quizID);
                preparedStatement.setInt(2, studentID);

                preparedStatement.executeUpdate();

                connection.close();

            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean checkPinned(String qi, int si) {
        
        String query = "SELECT fav_id FROM 16agileteam1db.stu_fav WHERE quiz_id=" + qi + " AND matriculation_number=" + si;
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement();) {
            
            ResultSet rs = statement.executeQuery(query);
            
            pinnedStatus = !rs.isBeforeFirst();

            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return pinnedStatus;
    }
}
