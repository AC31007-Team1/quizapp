package quizapp.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import quizapp.util.DatabaseManager;

public class ViewQuizzes {
    
    private DatabaseManager db = new DatabaseManager();
    
    private List quizList = new ArrayList();
    private List quizIDList = new ArrayList();
    
    public List getQuizzes(int moduleID) {
        
        String query = "SELECT * FROM Quiz WHERE module_id =" + moduleID;
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                quizList.add(resultSet.getString("quiz_name"));
            }
            
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return quizList;
    }
    
    public List getQuizzesID(int moduleID) {
        
        String query = "SELECT * FROM Quiz WHERE module_id =" + moduleID ;
   
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                quizIDList.add(resultSet.getInt("quiz_id"));
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return quizIDList;
    } 
}
