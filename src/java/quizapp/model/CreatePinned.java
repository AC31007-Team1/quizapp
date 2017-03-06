package quizapp.model;

import java.sql.*;
import java.text.ParseException;

public class CreatePinned {

    public void AddPinned() {
    }

    public boolean insertPinned(int quizID, int studentID) throws SQLException, ParseException {
        
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
            "INSERT INTO favorite (quiz_id, student_id ) " +
            " values (?, ?)");
            pstmt.setInt( 1, quizID );
            pstmt.setInt( 2, studentID ); 

            
            pstmt.executeUpdate();
            
            connection.close();
            return true;
        } catch (SQLException e) {
            e.getMessage();
        }
        return false;
    }
}
