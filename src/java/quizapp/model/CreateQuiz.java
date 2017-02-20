package quizapp.model;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
/**
 *
 * @author iain
 */
public class CreateQuiz {
    
    public boolean insertQuiz(String quizname, String module, String staffID, LocalDateTime created, int available) throws SQLException, ParseException {
        String driverName = "com.mysql.jdbc.Driver";
        SimpleDateFormat format = new SimpleDateFormat( "MM/dd/yyyy" );  // United States style of format.
        java.util.Date myDate = format.parse( "10/10/2009" );
        //hide userID & password (shippable?)
        /*String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";*/
        
        String localUrl = "jdbc:mysql://localhost:3306/";
        String localdb = "quizapp";
        String luserID = "root";
        String lpassword = "root";
        
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(localUrl + localdb, luserID, lpassword);
            
            PreparedStatement pstmt = connection.prepareStatement(
            "INSERT INTO quizapp.quiz ( staff_id_number, module_id, quiz_name, quiz_available, quiz_added ) " +
            " values (?, ?, ?, ?, ? )");
            pstmt.setString( 1, staffID );
            pstmt.setString( 3, module ); 
            pstmt.setString( 2, quizname ); 
            java.sql.Date sqlDate = new java.sql.Date( myDate.getTime() ); // Notice the ".sql." (not "util") in package name.
            pstmt.setDate( 4, sqlDate ); 
            pstmt.setInt( 5, available );
            pstmt.executeUpdate();
            
            connection.close();
            return true;
        } catch (SQLException e) {
            e.getMessage();
        }
        return false;
    }
}
