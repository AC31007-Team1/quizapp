package quizapp.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDateTime;
import quizapp.bean.Staff;
import quizapp.model.CreateQuiz;


@WebServlet(name = "AddQuiz", urlPatterns = {"/AddQuiz", "/AddQuiz/"})
public class AddQuiz extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("AddQuiz.jsp");
        rd.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        CreateQuiz initquiz = new CreateQuiz();
        
        HttpSession session = request.getSession();
        Staff lg = (Staff) session.getAttribute("StaffLogin");
        
        int module = Integer.parseInt(request.getParameter("module"));
        int staffID=lg.getID();
        int available = 0;
        
        String quizname = request.getParameter("quizname");
        
        LocalDateTime created = LocalDateTime.now();
        
        if(initquiz.insertQuiz(quizname,module,staffID,created,available)) {
            response.sendRedirect("/2016-agileteam1/");
        } else {
            // UPDATE WITH ERROR PAGE
            response.sendRedirect("/2016-agileteam1/");
        }
    }
}

