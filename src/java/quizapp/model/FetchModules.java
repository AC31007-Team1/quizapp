package quizapp.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import quizapp.util.DatabaseManager;

final public class FetchModules {
    
    private DatabaseManager db = new DatabaseManager();
    
    public String returnModules(int module_id) {
        
        String foundName="";
        module_id++;
        
        String getModuleID = "SELECT module_name FROM modules WHERE module_id=" + module_id;
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            ResultSet resultSet = statement.executeQuery(getModuleID);
            
            while(resultSet.next())
            {
                foundName = resultSet.getString("module_name");
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return foundName;
    }  
    
    public int returnModuleCount() {
        
        int moduleCount=0;
        String getCount = "SELECT COUNT(*) FROM modules;";
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            ResultSet resultSet = statement.executeQuery(getCount);
            
            while(resultSet.next())
            {
                moduleCount = resultSet.getInt("COUNT(*)");
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
       
        return moduleCount;
    }  
}