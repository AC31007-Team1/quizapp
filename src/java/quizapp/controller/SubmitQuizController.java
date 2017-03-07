package quizapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import quizapp.bean.Quiz;
import quizapp.bean.StudentLogin;
import quizapp.bean.StudentQuiz;
import quizapp.model.SubmitQuiz;
import quizapp.model.SubmitQuizStatistics;

/**
 *
 * @author Anthony
 */
@WebServlet(name = "SubmitQuizController", urlPatterns = {"/SubmitQuiz"})
public class SubmitQuizController extends HttpServlet {
    
    private int studentMatricID;
    private String quizID;
    private int quizScore;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        Quiz quiz = (Quiz) session.getAttribute("Quiz");
        StudentQuiz studentQuiz = (StudentQuiz) session.getAttribute("StudentQuiz");
        StudentLogin studentLogin = (StudentLogin) session.getAttribute("StudentLogin");
        
        studentMatricID = studentLogin.getID();
        quizID = quiz.getQuizID();
        //possible that this isn't getting the right result?
        quizScore = studentQuiz.getScoreTally();
        
        SubmitQuiz submitQuiz = new SubmitQuiz(studentMatricID, quizID, quizScore);
        SubmitQuizStatistics submitQuizStatistics = new SubmitQuizStatistics(quizID, quizScore);
        
        
            // change to submit complete form or view quiz results page?
            
            submitQuiz.enterResults();
            submitQuizStatistics.enterResults();
            
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
    }
}
