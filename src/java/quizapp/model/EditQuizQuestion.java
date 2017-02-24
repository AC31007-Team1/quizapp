/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author iain
 */

public class EditQuizQuestion {
    
    public boolean updateQuizQuestions(String question, int questionID) throws SQLException, ParseException {
        
        //hide userID & password (shippable?)
        /*String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";*/
        
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
        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            
            PreparedStatement pstmt = connection.prepareStatement(
                    "UPDATE quiz_questions SET question=? " + "WHERE quiz_question_id = ?");
           
            pstmt.setString( 1, question );
            pstmt.setInt( 2, questionID );
            
            
            
            pstmt.executeUpdate();
            
            connection.close();
            return true;
        } catch (SQLException e) {
            e.getMessage();
        }
        return false;
    }
    
    public boolean updateQuizAnswers(String correctAnswer, String incorrectAnswer1, String incorrectAnswer2, String incorrectAnswer3, int questionID) throws SQLException, ParseException {
        
        //hide userID & password (shippable?)
        /*String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";*/
        
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
        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            
            PreparedStatement pstmt = connection.prepareStatement(
            "UPDATE quiz_answers SET correct_answer=?, incorrect_answer_one=?, incorrect_answer_two=?, incorrect_answer_three=?"+ "WHERE quiz_question_id=?;");
            pstmt.setString( 1, correctAnswer );
            pstmt.setString( 2, incorrectAnswer1 );
            pstmt.setString( 3, incorrectAnswer2 );
            pstmt.setString( 4, incorrectAnswer3 );
            pstmt.setInt( 2, questionID );
            
            
            pstmt.executeUpdate();
            
            connection.close();
            return true;
        } catch (SQLException e) {
            e.getMessage();
        }
        return false;
    }
}
