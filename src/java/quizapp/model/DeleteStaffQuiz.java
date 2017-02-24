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
public class DeleteStaffQuiz {

    public boolean delete(int quizID) {

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
        String query1 = "DELETE FROM 16agileteam1db.quiz_answers WHERE quiz_id=" + quizID;
        String query2 = "DELETE FROM 16agileteam1db.quiz_questions WHERE quiz_id =" + quizID;
        String query3 = "DELETE FROM 16agileteam1db.quiz_stats WHERE quiz_id =" + quizID;
        String query4 = "DELETE FROM 16agileteam1db.quiz WHERE quiz_id =" + quizID;
        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();

            statement.execute(query1);
            statement.execute(query2);
            statement.execute(query3);
            statement.execute(query4);
            connection.close();

        } catch (SQLException e) {
            e.getMessage();
            return false;
        }
        return true;
    }
}
