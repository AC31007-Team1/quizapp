package quizapp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import quizapp.util.DatabaseManager;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class CreateQuiz {
    
    private DatabaseManager db = new DatabaseManager();
    private boolean status = false;
    
    public boolean insertQuiz(String quizname, int module, int staffID, LocalDateTime created, int available) {
        
        String query = "INSERT INTO quiz ( staff_id_number, module_id, quiz_name, quiz_available, quiz_added ) " +
            " values (?, ?, ?, ?, ? )";
        
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" );  // United States style of format.
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        sdf.format(timestamp);
        
        
        try(Connection connection = db.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            
            preparedStatement.setInt( 1, staffID );
            preparedStatement.setInt( 2, module ); 
            preparedStatement.setString( 3, quizname );
            preparedStatement.setInt( 4, available );
            preparedStatement.setTimestamp( 5, timestamp ); 
            
            preparedStatement.executeUpdate();
            
            status = true;
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
            e.printStackTrace();
        }
        
        return status;
    }
}
