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
import java.util.LinkedList;
import quizapp.bean.StaffQuiz;


public class FetchStaffQuizzes {

    public LinkedList<StaffQuiz> getQuizzes(int staffID) {
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";

        int qid = 0;
        String qn = "sql error";
        int qa = 0;
        //timestamp
        
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }
        //java.sql.timestamp
        Connection connection = null;
        LinkedList<StaffQuiz> quizListForReturn = new LinkedList<StaffQuiz>();
        String selectQuizQuery = "SELECT quiz_id, quiz_name, quiz_available, quiz_added FROM 16agileteam1db.quiz WHERE staff_id_number=" + staffID;
        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(selectQuizQuery);
            while(rs.next()) {
                qid = rs.getInt("quiz_id");
                qn = rs.getString("quiz_name");
                qa = rs.getInt("quiz_available");
                StaffQuiz tempQuiz = new StaffQuiz(qid,qn,qa);
                quizListForReturn.add(tempQuiz);
            }
            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }
        return quizListForReturn;
    }
}
