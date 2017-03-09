package quizapp.controller;

import java.io.IOException;
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

@WebServlet(name = "SubmitQuizController", urlPatterns = {"/SubmitQuiz"})
public class SubmitQuizController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //left blank intetionally
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int studentMatricID;
        String quizID;
        int quizScore;
        
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
        
            
        submitQuiz.enterResults();
        submitQuizStatistics.enterResults();

        RequestDispatcher rd = request.getRequestDispatcher("quizresult.jsp");
        rd.forward(request, response);
    }
}
