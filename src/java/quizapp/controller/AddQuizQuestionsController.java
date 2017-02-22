package quizapp.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.http.HttpSession;
import quizapp.bean.*;

@WebServlet(name = "AddQuizQuestions", urlPatterns = {"/AddQuizQuestions", "/AddQuizQuestions/"})
public class AddQuizQuestionsController extends HttpServlet{
    public AddQuizQuestionsController() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("addQuizQuestions.jsp");
            rd.forward(request,response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String quizID = request.getParameter("quiz");
        
        HttpSession session = request.getSession();
        
        Quiz quiz = new Quiz();
        
        quiz.setQuizID(quizID);
        
        session.setAttribute("Quiz", quiz);
        session.setAttribute("QuizID", quiz.getQuizID());
        
        RequestDispatcher rd = request.getRequestDispatcher("addQuizQuestions.jsp");
            rd.forward(request,response);
    }
}
