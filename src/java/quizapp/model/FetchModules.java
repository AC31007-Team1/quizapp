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
 * @author Iain
 */
final public class FetchModules {
    
    public String returnModules(int module_id) {
        
        String foundName="";
        module_id++;
        String driverName = "com.mysql.jdbc.Driver";  
        String localUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String localdb = "16agileteam1db";
        String luserID = "16agileteam1";
        String lpassword = "8320.at1.0238";
        
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }
        
        Connection connection = null;
        
        String getModuleID = "SELECT module_name FROM modules WHERE module_id=" + module_id;
        
        try {
            connection = DriverManager.getConnection(localUrl + localdb, luserID, lpassword);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(getModuleID);
            while(resultSet.next())
            {
                foundName = resultSet.getString("module_name");
            }
            
            
            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }
        
        return foundName;
    }  
    
    public int returnModuleCount() {
        
        String driverName = "com.mysql.jdbc.Driver";  
        String localUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String localdb = "16agileteam1db";
        String luserID = "16agileteam1";
        String lpassword = "8320.at1.0238";
        int moduleCount=0;
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }
        
        Connection connection = null;
        
        String getCount = "SELECT COUNT(*) FROM modules;";
        
        try {
            connection = DriverManager.getConnection(localUrl + localdb, luserID, lpassword);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(getCount);
            while(resultSet.next())
            {
                moduleCount = resultSet.getInt("COUNT(*)");
            }
            
            
            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }
        
        return moduleCount;
    }  
}