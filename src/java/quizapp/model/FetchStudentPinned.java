package quizapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import quizapp.bean.Pinned;
import quizapp.util.DatabaseManager;

public class FetchStudentPinned {
    
    private DatabaseManager db = new DatabaseManager();

    public LinkedList<Pinned> getQuizzes(int studentID) {

        String qid;
        String qn = "sql error";
        
        LinkedList<String> quizID = new LinkedList<String>();
        LinkedList<Pinned> pinnedListForReturn = new LinkedList<Pinned>();
        String selectQuizQuery = "SELECT quiz_id FROM 16agileteam1db.stu_fav WHERE matriculation_number=" + studentID;
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
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
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return pinnedListForReturn;
    }

    private LinkedList getQuizName(LinkedList quizID) {

        LinkedList quizName = new LinkedList<>();

        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            for (int i = 0; i < quizID.size(); i++) {
                String selectQuizQuery = "SELECT quiz_name FROM 16agileteam1db.quiz WHERE quiz_id=" + quizID.get(i);
                ResultSet rs = statement.executeQuery(selectQuizQuery);
                while (rs.next()) {
                    quizName.add(rs.getString("quiz_name"));
                } 
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }   
        return quizName;
    }
}
