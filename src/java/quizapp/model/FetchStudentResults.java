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
import java.sql.Timestamp;
import java.time.Instant;
import java.util.LinkedList;
import quizapp.bean.StaffQuiz;
import quizapp.bean.StudentQuizStat;


public class FetchStudentResults {

    public LinkedList<StudentQuizStat> getStudentStats(int matricN) {
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";

        int qid = 0;
        String qn = "sql error";
        int qs = 0;
        Timestamp ts = null;
        Instant dt = null;
        
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }
        Connection connection = null;
        LinkedList<StudentQuizStat> statListForReturn = new LinkedList<StudentQuizStat>();
        String selectStatsQuery = "SELECT student_statistics.quiz_id, quiz_score, date_taken, quiz_name FROM 16agileteam1db.student_statistics, 16agileteam1db.quiz WHERE matriculation_number=" + matricN;
        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(selectStatsQuery);
            while(rs.next()) {
                qid = rs.getInt("quiz_id");
                qn = rs.getString("quiz_name");
                qs = rs.getInt("quiz_score");
                
                ts = rs.getTimestamp("date_taken");
                dt = ts.toInstant();
                StudentQuizStat tempStat = new StudentQuizStat(qid,qn,qs,dt);
                statListForReturn.add(tempStat);
            }
            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }
        return statListForReturn;
    }
}
