package quizapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private final String driverName = "com.mysql.jdbc.Driver";
    private final String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
    private final String dbName = "16agileteam1db";
    private final String userID = "16agileteam1";
    private final String password = "8320.at1.0238";
    
    Connection connection;
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName(driverName);
        
        connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
        return connection;
    }
}
