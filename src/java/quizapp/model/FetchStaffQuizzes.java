package quizapp.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import quizapp.bean.StaffQuiz;
import quizapp.util.DatabaseManager;

public class FetchStaffQuizzes {
    
    private DatabaseManager db = new DatabaseManager();

    public LinkedList<StaffQuiz> getQuizzes(int staffID) {
        
        LinkedList<StaffQuiz> quizListForReturn = new LinkedList<StaffQuiz>();
        String selectQuizQuery = "SELECT quiz_id, quiz_name, quiz_available, quiz_added FROM 16agileteam1db.quiz WHERE staff_id_number=" + staffID;

        int qid = 0;
        String qn = "sql error";
        int qa = 0;
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            ResultSet rs = statement.executeQuery(selectQuizQuery);
            
            while(rs.next()) {
                qid = rs.getInt("quiz_id");
                qn = rs.getString("quiz_name");
                qa = rs.getInt("quiz_available");
                StaffQuiz tempQuiz = new StaffQuiz(qid,qn,qa);
                quizListForReturn.add(tempQuiz);
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return quizListForReturn;
    }
}
