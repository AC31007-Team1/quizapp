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
import quizapp.bean.Pinned;


public class FetchStudentPinned {

    public LinkedList<Pinned> getQuizzes(int studentID) {
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";

        int qid = 0;
        String qn = "sql error";
        //timestamp
        
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }
        //java.sql.timestamp
        Connection connection = null;
        LinkedList<Pinned> quizListForReturn = new LinkedList<Pinned>();
        String selectQuizQuery = "SELECT quiz_id, quiz_name FROM 16agileteam1db.favorite WHERE student_id=" + studentID;
        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(selectQuizQuery);
            while(rs.next()) {
                qid = rs.getInt("quiz_id");
                qn = rs.getString("quiz_name");
                Pinned tempQuiz = new Pinned(qid, qn);
                quizListForReturn.add(tempQuiz);
            }
            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }
        return quizListForReturn;
    }
}
