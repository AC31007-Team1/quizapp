package quizapp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import quizapp.util.DatabaseManager;

public class SubmitQuiz {
    
    private DatabaseManager db = new DatabaseManager();
    private boolean status = false;
    
    private int studentMatricID;
    private String quizID;
    private int quizScore;

    public SubmitQuiz(int studentMatricID, String quizID, int quizScore) {
        this.studentMatricID = studentMatricID;
        this.quizID = quizID;
        this.quizScore = quizScore;
    }
    
    public boolean enterResults() {
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" );  // United States style of format.
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        sdf.format(timestamp);
        
        String query = "INSERT INTO student_statistics(matriculation_number, quiz_id, quiz_score, date_taken) " + " values (?, ?, ?, ?)";
        
        try(Connection connection = db.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            
            preparedStatement.setInt( 1, studentMatricID );
            preparedStatement.setString( 2, quizID ); 
            preparedStatement.setInt(3, quizScore );
            preparedStatement.setTimestamp( 4, timestamp ); 
            
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
