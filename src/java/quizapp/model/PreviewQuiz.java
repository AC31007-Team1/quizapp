package quizapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PreviewQuiz {
    private final List quizQuestionList = new ArrayList();
    private final List correctQuizAnswers = new ArrayList();
    private final List incorrectQuizAnswer1 = new ArrayList();
    private final List incorrectQuizAnswer2 = new ArrayList();
    private final List incorrectQuizAnswer3 = new ArrayList();
    private final List answerExplantion = new ArrayList();
    private final List quizIDList = new ArrayList();
    
    private final String driverName = "com.mysql.jdbc.Driver";
    private final String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
    private final String dbName = "16agileteam1db";
    private final String userID = "16agileteam1";
    private final String password = "8320.at1.0238";
    
    public List getQuizQuestions(String quizID) {
        
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }

        Connection connection = null;

        // module id from iain
        String query = "SELECT question FROM quiz_questions WHERE quiz_id =" + quizID;

        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                quizQuestionList.add(resultSet.getString("question"));
            }

            connection.close();
            
        } catch (SQLException e) {
            e.getMessage();
        }
        
        return quizQuestionList;
    }
    
    public List getQuizQuestionsAnswers(String quizID) {
        
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }

        Connection connection = null;

        // module id from iain
        String query = "SELECT correct_answer FROM quiz_answers WHERE quiz_id =" + quizID;

        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                correctQuizAnswers.add(resultSet.getString("correct_answer"));
            }

            connection.close();
            
        } catch (SQLException e) {
            e.getMessage();
        }
        
        return correctQuizAnswers;
    }
    
    public List getQuizIncOne(String quizID) {
        
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }

        Connection connection = null;

        // module id from iain
        String query = "SELECT incorrect_answer_one FROM quiz_answers WHERE quiz_id =" + quizID;

        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                incorrectQuizAnswer1.add(resultSet.getString("incorrect_answer_one"));
            }

            connection.close();
            
        } catch (SQLException e) {
            e.getMessage();
        }
        
        return incorrectQuizAnswer1;
    }
    
    public List getQuizIncTwo(String quizID) {
        
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }

        Connection connection = null;

        // module id from iain
        String query = "SELECT incorrect_answer_two FROM quiz_answers WHERE quiz_id =" + quizID;

        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                incorrectQuizAnswer2.add(resultSet.getString("incorrect_answer_two"));
            }

            connection.close();
            
        } catch (SQLException e) {
            e.getMessage();
        }
        
        return incorrectQuizAnswer2;
    }
    
    public List getQuizIncThree(String quizID) {
        
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }

        Connection connection = null;

        // module id from iain
        String query = "SELECT incorrect_answer_three FROM quiz_answers WHERE quiz_id =" + quizID;

        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                incorrectQuizAnswer3.add(resultSet.getString("incorrect_answer_three"));
            }

            connection.close();
            
        } catch (SQLException e) {
            e.getMessage();
        }
        
        return incorrectQuizAnswer3;
    }
    
    public List getQuestionID(String quizID) {
        
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }

        Connection connection = null;

        // module id from iain
        String query = "SELECT quiz_question_id FROM quiz_questions WHERE quiz_id =" + quizID;

        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                quizIDList.add(resultSet.getInt("quiz_question_id"));
            }

            connection.close();
            
        } catch (SQLException e) {
            e.getMessage();
        }
        
        return quizIDList;
    }
    
    public List getAnswerExplanation(String quizID) {
        
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }

        Connection connection = null;

        // module id from iain
        String query = "SELECT answer_ex FROM quiz_answers WHERE quiz_id =" + quizID;

        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                answerExplantion.add(resultSet.getString("answer_ex"));
            }

            connection.close();
            
        } catch (SQLException e) {
            e.getMessage();
        }
        
        return answerExplantion;
    }
}
