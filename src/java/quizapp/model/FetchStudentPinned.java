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
import java.util.ArrayList;
import java.util.LinkedList;
import quizapp.bean.Pinned;

public class FetchStudentPinned {

    public LinkedList<Pinned> getQuizzes(int studentID) {
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";

        String qid;
        String qn = "sql error";
        //timestamp

        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }
        //java.sql.timestamp
        LinkedList<Pinned> pinnedListForReturn = new LinkedList<Pinned>();
        Connection connection = null;
        LinkedList<String> quizID = new LinkedList<String>();
        String selectQuizQuery = "SELECT quiz_id FROM 16agileteam1db.favorite WHERE student_id=" + studentID;
        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(selectQuizQuery);
            while (rs.next()) {
                qid = rs.getString("quiz_id");
                quizID.add(qid);
            }
            
            LinkedList <String> quizName = new LinkedList<String>();
            quizName = getQuizName(quizID);
            
            for(int i = 0; i < quizID.size(); i++)
            {
                Pinned tempPinned = new Pinned(quizID.get(i), quizName.get(i));
                pinnedListForReturn.add(tempPinned);
            }

            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }
        return pinnedListForReturn;
    }

    private LinkedList getQuizName(LinkedList quizID) {

        LinkedList quizName = new LinkedList<>();

        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();
            for (int i = 0; i < quizID.size(); i++) {
                String selectQuizQuery = "SELECT quiz_name FROM 16agileteam1db.quiz WHERE quiz_id=" + quizID.get(i);
                ResultSet rs = statement.executeQuery(selectQuizQuery);
                while (rs.next()) {
                    quizName.add(rs.getInt("quiz_name"));
                }
            }

            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }
        
        return quizName;
    }
}
