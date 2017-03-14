package quizapp.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import quizapp.bean.Staff;
import quizapp.bean.UserLogin;
import quizapp.util.DatabaseManager;

public class StaffMember extends UserMember{
    
    private DatabaseManager db = new DatabaseManager();
    
    public boolean isValidStaff(int staffID) {

        boolean isStaff = false;

        String getStaffID = "SELECT staff_id_number FROM 16agileteam1db.profile_details WHERE staff_id_number=" + staffID;
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            ResultSet resultSet = statement.executeQuery(getStaffID);

            if (resultSet.next()) {
                isStaff = true;
                System.out.println("LoggedIn");
            } else {
                System.out.println("Failed to login");
                isStaff = false;
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return isStaff;
    }

    public UserLogin getProfile(int staffID) {

        int pid = 0;
        int sid = 0;
        String fn = "sql error";
        String ln = "sql error";
        String em = "sql error";
        String soul = "sql error";
        
        String selectProfileQuery = "SELECT profile_id, staff_id_number, first_name, last_name, email, soul FROM 16agileteam1db.profile_details WHERE staff_id_number=" + staffID;
        
        try(Connection connection = db.getConnection(); Statement statement = connection.createStatement()) {
            
            ResultSet rs = statement.executeQuery(selectProfileQuery);
            
            if (rs.next()) {
                pid = rs.getInt("profile_id");
                sid = rs.getInt("staff_id_number");
                fn = rs.getString("first_name");
                ln = rs.getString("last_name");
                em = rs.getString("email");
                soul = rs.getString("soul");
            }
            
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        UserLogin slforReturn = new Staff(staffID);
        slforReturn.setProfile(sid, pid, fn, ln, em, soul);
        return slforReturn;
    }

    @Override
    public boolean isValid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
