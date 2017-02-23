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
    
    public List getQuizQuestions(String quizID) {
        
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";
        
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }

        Connection connection = null;

        // module id from iain
        String query = "SELECT * FROM quiz_questions WHERE quiz_id =" + quizID;

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
        
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";
        
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }

        Connection connection = null;

        // module id from iain
        String query = "SELECT * FROM quiz_answers WHERE quiz_id =" + quizID;

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
        
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";
        
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }

        Connection connection = null;

        // module id from iain
        String query = "SELECT * FROM quiz_answers WHERE quiz_id =" + quizID;

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
        
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";
        
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }

        Connection connection = null;

        // module id from iain
        String query = "SELECT * FROM quiz_answers WHERE quiz_id =" + quizID;

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
        
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";
        
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }

        Connection connection = null;

        // module id from iain
        String query = "SELECT * FROM quiz_answers WHERE quiz_id =" + quizID;

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
}
