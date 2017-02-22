package quizapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ViewQuizzes {
    
    private List quizList = new ArrayList();
    private List quizIDList = new ArrayList();
    
    
    public List getQuizzes() {
        
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
        String query = "SELECT * FROM Quiz WHERE module_id = 1" ;

        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                quizList.add(resultSet.getString("quiz_name"));
            }

            connection.close();
            
        } catch (SQLException e) {
            e.getMessage();
        }
        
        return quizList;
    }
    
    
}
