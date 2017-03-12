package quizapp.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import quizapp.bean.StudentLogin;
import quizpp.util.DatabaseManager;

public class StudentMember {

    private DatabaseManager db = new DatabaseManager();
    
    public boolean isValidStudent(int studentID) {

        boolean isStudent = false;
        
        String getStudentID = "SELECT matriculation_number FROM student WHERE matriculation_number=" + studentID;

        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            ResultSet resultSet = statement.executeQuery(getStudentID);

            if (resultSet.next()) {
                isStudent = true;
                System.out.println("LoggedIn");
            } else {
                System.out.println("Failed to login");
                isStudent = false;
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return isStudent;
    }
    
    public StudentLogin getProfile(int matricN) {
        
        int pid = 0;
        int mN = 0;
        String fn = "sql error";
        String ln = "sql error";
        String em = "sql error";
        String soul = "sql error";
        
        String selectProfileQuery = "SELECT profile_id, matriculation_number, first_name, last_name, email, soul FROM 16agileteam1db.profile_details WHERE matriculation_number=" + matricN;
        
       try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            ResultSet rs = statement.executeQuery(selectProfileQuery);
            
            if (rs.next()) {
                pid = rs.getInt("profile_id");
                mN = rs.getInt("matriculation_number");
                fn = rs.getString("first_name");
                ln = rs.getString("last_name");
                em = rs.getString("email");
                soul = rs.getString("soul");
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
      
        StudentLogin slforReturn = new StudentLogin();
        slforReturn.setProfile(mN, pid, fn, ln, em, soul);
        return slforReturn;
    }
}
