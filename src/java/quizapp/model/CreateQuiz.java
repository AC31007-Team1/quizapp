package quizapp.model;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
/**
 *
 * @author iain
 */
public class CreateQuiz {
    
    public boolean insertQuiz(String quizname, int module, String staffID, LocalDateTime created, int available) throws SQLException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" );  // United States style of format.
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        sdf.format(timestamp);
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
            "INSERT INTO quiz ( staff_id_number, module_id, quiz_name, quiz_available, quiz_added ) " +
            " values (?, ?, ?, ?, ? )");
            pstmt.setString( 1, staffID );
            pstmt.setInt( 2, module ); 
            pstmt.setString( 3, quizname );
            pstmt.setInt( 4, available );
            java.sql.Date timeNow = new Date(Calendar.getInstance().getTime().getTime());
            //java.sql.Date sqlDate = new java.sql.Date( myDate.getTime() ); // Notice the ".sql." (not "util") in package name.
            pstmt.setTimestamp( 5, timestamp ); 
            
            pstmt.executeUpdate();
            
            connection.close();
            return true;
        } catch (SQLException e) {
            e.getMessage();
        }
        return false;
    }
}
