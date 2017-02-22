
package quizapp.model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DisplayQuiz extends HttpServlet{
    
    String driverName = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/";
    String dbName = "quizme";
    String userID = "root";
    String password = "root";

    Connection connection = null;
    Statement statement = null;
    ResultSet result = null;
    List list = new ArrayList();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        
        response.setContentType("text/html:chatset=UFT-8");
        PrintWriter out = response.getWriter();
        try{
            


            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            statement = connection.createStatement();
            String query = "SELECT * FROM Quiz"; // my sql statement

            result = statement.executeQuery(query);

            while(result.next())
            {
                list.add(result.getString("id"));
            }
            result.close();

            connection.close();


        } catch (Exception e) 
        {
            e.getMessage();
        }
        finally
        {
            request.setAttribute("QuizData", list);
            RequestDispatcher rd = request.getRequestDispatcher("/displayQuizTable.jsp");
            rd.forward(request, response);
        }
    }
}
