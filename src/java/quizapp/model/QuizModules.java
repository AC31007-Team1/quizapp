/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author iain
 */
public class QuizModules {
    
    public String findModule(int id) {

        String driverName = "com.mysql.jdbc.Driver";
        
        String localUrl = "jdbc:mysql://localhost:3306/";
        String localdb = "quizapp";
        String luserID = "root";
        String lpassword = "root";
        String modulename="";
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }
        
        Connection connection = null;
        
        String getModule = "SELECT module_name FROM modules WHERE module_id=" + id;
        try {
            connection = DriverManager.getConnection(localUrl + localdb, luserID, lpassword);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(getModule);
            while (resultSet.next()) {
                modulename = resultSet.getString("module_name");
            }
           
            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }
        return modulename;
    }
}
