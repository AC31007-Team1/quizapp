package quizapp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import quizapp.util.DatabaseManager;

public class EditQuizQuestion {
    
    private DatabaseManager db = new DatabaseManager();
    private boolean status = false;
    
    public boolean updateQuizQuestions(String question, int questionID, String videourl) {
        
        String query = "UPDATE quiz_questions SET question=?, video_url=? " + "WHERE quiz_question_id = ?";
        
        try(Connection connection = db.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            
            preparedStatement.setString( 1, question );
            preparedStatement.setString( 2, videourl );
            preparedStatement.setInt( 3, questionID );
            preparedStatement.executeUpdate();
            
            status = true;
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
            e.printStackTrace();
        }
        return status;
    }
    
    public boolean updateQuizAnswers(String correctAnswer, String incorrectAnswer1, String incorrectAnswer2, String incorrectAnswer3, String explanation, int questionID) {
        
        String query = "UPDATE quiz_answers SET correct_answer=?, incorrect_answer_one=?, incorrect_answer_two=?, incorrect_answer_three=?, answer_ex=?"
                + "WHERE quiz_question_id = ?";
        
        try(Connection connection = db.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            
            preparedStatement.setString( 1, correctAnswer );
            preparedStatement.setString( 2, incorrectAnswer1 );
            preparedStatement.setString( 3, incorrectAnswer2 );
            preparedStatement.setString( 4, incorrectAnswer3 );
            preparedStatement.setString( 5, explanation);
            preparedStatement.setInt( 6, questionID );
            
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
