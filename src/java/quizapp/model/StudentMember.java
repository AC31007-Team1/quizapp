package quizapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentMember {
    
    /*
    methods here for getting and setting student details from database
    */

    public boolean isValidStudent(String studentID) {
        
        boolean isStudent = false;
        
        String driverName = "com.mysql.jdbc.Driver";  
        String localUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String localdb = "16agileteam1db";
        String luserID = "16agileteam1";
        String lpassword = "8320.at1.0238";
        
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }
        
        Connection connection = null;
        
        String getStudentID = "SELECT matriculation_number FROM student WHERE matriculation_number=" + studentID;
        
        try {
            connection = DriverManager.getConnection(localUrl + localdb, luserID, lpassword);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(getStudentID);
            
            if(resultSet.next()) {
                isStudent = true;
                System.out.println("LoggedIn");
            } else {
                System.out.println("Failed to login");
                isStudent = false;
            }
            
            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }
        
        return isStudent;
    }  
}