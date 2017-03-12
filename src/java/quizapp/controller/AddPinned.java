package quizapp.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import quizapp.bean.StudentLogin;
import quizapp.model.CreatePinned;

@WebServlet(name = "AddPinned", urlPatterns = {"/AddPinned", "/AddPinned/"})
public class AddPinned extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String quizID = request.getParameter("quiz");
        
        StudentLogin lg = (StudentLogin) session.getAttribute("StudentLogin");
        
        int studentID = lg.getID();

        CreatePinned pinned = new CreatePinned();

        pinned.insertPinned(quizID, studentID);
        response.sendRedirect("index.jsp");

    }

}
