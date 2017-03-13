package quizapp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import quizapp.util.DatabaseManager;

public class AddQuizQuestions {
    
    private DatabaseManager db = new DatabaseManager();

    public void submitQuestion(String question, String quizid, String videoUrl) {
        
        String query = "INSERT INTO quiz_questions(quiz_id, question, video_url)" + "VALUES(?, ?, ?)";
        
        try(Connection connection = db.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            
            preparedStatement.setString(1, quizid);
            preparedStatement.setString(2, question);
            preparedStatement.setString(3, videoUrl);

            preparedStatement.execute();

            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }


    public void submitAnswers(String answerc, String[] answeri, String eAnswer, String quizid) {
        
        int ID = 0;
        String idquery ="SELECT MAX(quiz_question_id) AS MAX FROM quiz_questions";
        String query = "INSERT INTO quiz_answers(quiz_question_id, quiz_id, correct_answer, incorrect_answer_one," + 
                "incorrect_answer_two, incorrect_answer_three, answer_ex)" + " VALUES(?, ?, ?, ?, ?, ?, ?);";
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement(); ResultSet rs = statement.executeQuery(idquery); PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            
            if(rs.next()){
                ID = rs.getInt(1);
            }
            
            preparedStatement.setInt(1, ID);
            preparedStatement.setString(2, quizid);
            preparedStatement.setString(3, answerc);
            
            for(int i = 0; i < 3; i++) {
                preparedStatement.setString(i+4, answeri[i]);
            }
            preparedStatement.setString(7, eAnswer);
            preparedStatement.execute();

            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
