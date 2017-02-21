/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anthony
 */
public class ViewModules {
    
    
    private static List<String> modules = new ArrayList<String>();
    private int moduleCount = 0;
    
    
    public List<String> getModules() {
        
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";

        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }


        Connection connection = null;
        Statement statement = null;


        // first value set as 1 as quiz_question_id is one, this will be gathered before hand once quizzes are dynamic
        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            statement = connection.createStatement();
            String query = "SELECT * FROM modules;"; // my sql statement

            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next()) {
                modules.add(resultSet.getString("module_name"));
            }

            connection.close();


        } catch (SQLException e) {
            e.getMessage();
        }
        
        System.out.println(modules);
        
        
        return modules;
    }
    
}
