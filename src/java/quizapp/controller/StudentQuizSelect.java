package quizapp.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import quizapp.bean.Quiz;
import quizapp.bean.module;
import quizapp.model.ViewQuizzes;

@WebServlet(name = "StudentQuizSelect", urlPatterns = {"/StudentQuizSelect", "/StudentQuizSelect/"})
public class StudentQuizSelect extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ViewQuizzes viewQuizzes = new ViewQuizzes();
        
        HttpSession session = request.getSession();
        
        module specificModule = (module) session.getAttribute("module");
        List quizzes = viewQuizzes.getStuQuizzes(specificModule.getModuleID());
        List quizzesID = viewQuizzes.getStuQuizzesID(specificModule.getModuleID());
        
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
        RequestDispatcher rd = request.getRequestDispatcher("StudentQuizSelect.jsp");
        rd.forward(request, response);
    }
}
