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
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Anthony
 */
public class SubmitQuiz {
    
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
            "INSERT INTO student_statistics(matriculation_number, quiz_id, quiz_score, date_taken) " + " values (?, ?, ?, ?)");
            pstmt.setInt( 1, studentMatricID );
            pstmt.setString( 2, quizID ); 
            pstmt.setInt(3, quizScore );
            java.sql.Date timeNow = new Date(Calendar.getInstance().getTime().getTime());
            pstmt.setTimestamp( 4, timestamp ); 
            
            pstmt.executeUpdate();
            
            connection.close();
            return false;
            
        } catch (SQLException e) {
            e.getMessage();
        }
        return true;
    }
    
}
