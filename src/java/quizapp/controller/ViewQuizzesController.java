package quizapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import quizapp.model.*;
import quizapp.bean.*;

@WebServlet(name = "ViewQuizzes", urlPatterns = {"/ViewQuizzes"})
public class ViewQuizzesController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ViewQuizzes viewQuizzes = new ViewQuizzes();
        
        HttpSession session = request.getSession();
        
        module specificModule = (module) session.getAttribute("module");
        List quizzes = viewQuizzes.getStaffQuizzes(specificModule.getModuleID());
        List quizzesID = viewQuizzes.getStaffQuizzesID(specificModule.getModuleID());
        
        if(!quizzes.isEmpty()) {
            Quiz quiz = new Quiz();
            
            quiz.setQuizList(quizzes);
            quiz.setQuizIDList(quizzesID);
            
            quiz.setQuizSet(true);
            
            session.setAttribute("Quiz", quiz);
        } else {
            Quiz quiz = new Quiz();
            
            session.setAttribute("Quiz", quiz);
        }
        
        RequestDispatcher rd = request.getRequestDispatcher("viewQuizzes.jsp");
            rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
