package quizapp.model;

import java.sql.*;
import java.text.ParseException;

public class CreatePinned {

    public void AddPinned() {
    }

    public boolean insertPinned(int quizID, int studentID) throws SQLException, ParseException {

        boolean already = isAlreadyPinned(quizID, studentID);

        if (already == false) {

            String driverName = "com.mysql.jdbc.Driver";
            String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
            String dbName = "16agileteam1db";
            String userID = "16agileteam1";
            String password = "8320.at1.0238";

            try {
                Class.forName(driverName);
            } catch (ClassNotFoundException e) {
            }
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);

                PreparedStatement pstmt = connection.prepareStatement(
                        "INSERT INTO 16agileteam1db.stu_fav (quiz_id, maturculation_number ) "
                        + " values (?, ?)");
                pstmt.setInt(1, quizID);
                pstmt.setInt(2, studentID);

                pstmt.executeUpdate();

                connection.close();
                return true;

            } catch (SQLException e) {
                e.getMessage();
            }
            return false;
        } else {
            return false;

        }

    }

    public boolean isAlreadyPinned(int qi, int si) {
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";

        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);

            Statement statement = connection.createStatement();

            String query = "SELECT quiz_id FROM 16agileteam1db.favortie WHERE quiz_id=" + qi + " AND student_id=" + si;
            ResultSet rs = statement.executeQuery(query);

            if (rs == null) {
                return false;
            } else {
                return true;
            }

        } catch (SQLException e) {
            e.getMessage();
        }
        return false;
    }
}
