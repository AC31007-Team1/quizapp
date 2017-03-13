package quizapp.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import quizapp.util.DatabaseManager;

public class ChangeProfileDetails {
    
    private DatabaseManager db = new DatabaseManager();

    public boolean editStaffProfile(String firstN, String lastN, String email, int staffID) {

        String update_staff = "UPDATE 16agileteam1db.profile_details "
                + "SET first_name = '" + firstN + "', last_name = '" 
                + lastN + "' , email = '" + email  
                + "' WHERE staff_id_number = " + staffID + ";";
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            statement.execute(update_staff);
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean editStudentProfile(String firstN, String lastN, String email, int matricN) {

        String update_student = "UPDATE 16agileteam1db.profile_details "
                + "SET first_name = '" + firstN + "', last_name = '" 
                + lastN + "' , email = '" + email + 
                "' WHERE matriculation_number = " + matricN + ";";

        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            statement.execute(update_student);
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return true;
    }
}
