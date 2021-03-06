package quizapp.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import quizapp.util.DatabaseManager;

public class AddAccount {
    
    private DatabaseManager db = new DatabaseManager();
    private boolean status = false;

    public boolean insertStaffAccount(String staffID, String staffFN, String staffLN, String staffE) {
        
        String insertStaffTableSQL = "INSERT INTO 16agileteam1db.staff "
                + "VALUES(" + staffID + ");";
        String insertProfileTableSQL = "INSERT INTO 16agileteam1db.profile_details(staff_id_number, first_name, last_name, email, soul) "
                + "VALUES(" + staffID + ",'" + staffFN + "','" + staffLN + "','" + staffE + "','staff');";

        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            statement.execute(insertStaffTableSQL);
            statement.execute(insertProfileTableSQL);
            connection.close();
            
            status = true;
            
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
            e.printStackTrace();
        }
        
        return status;
    }

    public boolean insertStudentAccount(String matricN, String studentFN, String studentLN, String studentE) {
        
        String insertStudentTableSQL = "INSERT INTO 16agileteam1db.student (matriculation_number) "
                + "VALUES(" + matricN + ");";
        String insertProfileTableSQL = "INSERT INTO 16agileteam1db.profile_details(matriculation_number, first_name, last_name, email, soul) "
                + "VALUES(" + matricN + ",'" + studentFN + "','" + studentLN + "','" + studentE + "','student');";
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            statement.execute(insertStudentTableSQL);
            statement.execute(insertProfileTableSQL);
            connection.close();
            
            status = true;
            
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
            e.printStackTrace();
        }
        
        return status;
    }
}
