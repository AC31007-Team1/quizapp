/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.model;

import java.sql.*;

/**
 *
 * @author craigwatt
 */
public class User {

    public User() {
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://localhost:3306/";
        String dbName = "quizme";
        String userID = "root";
        String password = "root";
    }

    
    public boolean insertStaffAccount() {
        PreparedStatement ps;
        return true;
    }
    
    public boolean insertStudentAccount() {
        PreparedStatement ps;
        return true;
    }
    
    
}
