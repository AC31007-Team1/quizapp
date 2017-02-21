package quizapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StaffMember {
    
    /*duwiaudw
    methods here for getting and setting staff details from database
    */

    public boolean isValidStaff(String staffID) {
        
        boolean isStaff = false;
        
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
        
        String getStaffID = "SELECT staff_id_number FROM 16agileteam1db.profile_details WHERE staff_id_number=" + staffID;
       
        try {
            connection = DriverManager.getConnection(localUrl + localdb, luserID, lpassword);
            Statement statement = connection.createStatement();
            

            ResultSet resultSet = statement.executeQuery(getStaffID);

            if(resultSet.next()) {
                isStaff = true;
                System.out.println("LoggedIn");
            } else {
                System.out.println("Failed to login");
                isStaff = false;
            }
          
            
            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }
        
        return isStaff;
    }  
    public String getfName(String staffID, String fName){
        
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
        
        String queryfName = "SELECT first_name FROM 16agileteam1db.profile_details WHERE staff_id_number="+staffID;
        try 
        {
            connection = DriverManager.getConnection(localUrl + localdb, luserID, lpassword);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(queryfName);
            if(resultSet.next())
            {
               // String fName = resultSet.getString("first_name");
            }
            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }
      
        return fName;
    }
}

