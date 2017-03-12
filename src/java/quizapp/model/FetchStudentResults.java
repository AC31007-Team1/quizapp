package quizapp.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.LinkedList;
import quizapp.bean.StudentQuizStat;
import quizpp.util.DatabaseManager;

public class FetchStudentResults {
    
    private DatabaseManager db = new DatabaseManager();

    public LinkedList<StudentQuizStat> getStudentStats(int matricN) {

        int qid = 0;
        String qn = "sql error";
        int qs = 0;
        Timestamp ts = null;
        Instant dt = null;
        
        LinkedList<StudentQuizStat> statListForReturn = new LinkedList<StudentQuizStat>();
        
        String selectStatsQuery = "SELECT student_statistics.quiz_id, quiz_name, quiz_score, date_taken FROM 16agileteam1db.student_statistics INNER JOIN 16agileteam1db.quiz ON 16agileteam1db.student_statistics.quiz_id=16agileteam1db.quiz.quiz_id WHERE matriculation_number =" + matricN;
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
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
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return statListForReturn;
    }
}
