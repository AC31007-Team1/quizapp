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
import java.util.List;

/**
 *
 * @author craigwatt
 */
public class DeleteStudentPinned {

    public boolean delete(int quizID,int studentID) {

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
        String query = "DELETE FROM 16agileteam1db.stu_fav WHERE quiz_id=" + quizID + " AND matriculation_number=" + studentID;
        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();

            statement.execute(query);
            connection.close();

        } catch (SQLException e) {
            e.getMessage();
            return false;
        }
        return true;
    }
    
    public boolean changeAvailability(int quizID) {

        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";
        int currentA =0;
        
        
        
        

        Connection connection = null;

        String query1 = "SELECT quiz_available FROM 16agileteam1db.quiz WHERE quiz_id = " +quizID;
        

        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(query1);
            while(rs.next()) {
                currentA = rs.getInt("quiz_available");
            }
            if(currentA == 1){
                currentA = 0;
            }
            else{
                currentA = 1;
            }
            String query2 = "UPDATE 16agileteam1db.quiz SET quiz_available = " + currentA + " WHERE quiz_id = " + quizID;
            statement.execute(query2);
            connection.close();
            

        } catch (SQLException e) {
            e.getMessage();
            return false;
        }
        
        
        //String query2 = "UPDATE 16agileteam1db.quiz SET quiz_available = " + newA + " WHERE quiz_id = " + quizID;
        return true;
    }
}
