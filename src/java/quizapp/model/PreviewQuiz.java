package quizapp.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import quizapp.util.DatabaseManager;

public class PreviewQuiz {
    
    private DatabaseManager db = new DatabaseManager();
    
    private final List quizQuestionList = new ArrayList();
    private final List correctQuizAnswers = new ArrayList();
    private final List incorrectQuizAnswer1 = new ArrayList();
    private final List incorrectQuizAnswer2 = new ArrayList();
    private final List incorrectQuizAnswer3 = new ArrayList();
    private final List answerExplantion = new ArrayList();
    private final List quizIDList = new ArrayList();
    private final List quizUrlList = new ArrayList();
    
    public List getQuizQuestions(String quizID) {
        
        
        String query = "SELECT question FROM quiz_questions WHERE quiz_id =" + quizID;

        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                quizQuestionList.add(resultSet.getString("question"));
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return quizQuestionList;
    }
    
    public List getQuizQuestionsAnswers(String quizID) {
        
        String query = "SELECT correct_answer FROM quiz_answers WHERE quiz_id =" + quizID;
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                correctQuizAnswers.add(resultSet.getString("correct_answer"));
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return correctQuizAnswers;
    }
    
    public List getQuizIncOne(String quizID) {
        
        String query = "SELECT incorrect_answer_one FROM quiz_answers WHERE quiz_id =" + quizID;
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                incorrectQuizAnswer1.add(resultSet.getString("incorrect_answer_one"));
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return incorrectQuizAnswer1;
    }
    
    public List getQuizIncTwo(String quizID) {
        
        String query = "SELECT incorrect_answer_two FROM quiz_answers WHERE quiz_id =" + quizID;
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                incorrectQuizAnswer2.add(resultSet.getString("incorrect_answer_two"));
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return incorrectQuizAnswer2;
    }
    
    public List getQuizIncThree(String quizID) {
        
        String query = "SELECT incorrect_answer_three FROM quiz_answers WHERE quiz_id =" + quizID;
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                incorrectQuizAnswer3.add(resultSet.getString("incorrect_answer_three"));
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return incorrectQuizAnswer3;
    }
    
    public List getQuestionID(String quizID) {
        
        String query = "SELECT quiz_question_id FROM quiz_questions WHERE quiz_id =" + quizID;
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                quizIDList.add(resultSet.getInt("quiz_question_id"));
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return quizIDList;
    }
    
    public List getAnswerExplanation(String quizID) {
        
        String query = "SELECT answer_ex FROM quiz_answers WHERE quiz_id =" + quizID;
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                answerExplantion.add(resultSet.getString("answer_ex"));
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return answerExplantion;
    }
    
    public List getVideoUrl(String quizID) {
        String query = "SELECT video_url FROM quiz_questions WHERE quiz_id =" + quizID;

        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                quizUrlList.add(resultSet.getString("video_url"));
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return quizUrlList;
    }
}
