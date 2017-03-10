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
import quizapp.bean.*;
import quizapp.model.*;

@WebServlet(name = "PreviewQuiz", urlPatterns = {"/PreviewQuiz"})
public class PreviewQuizController extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("previewQuiz.jsp");
            rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();

        String quizID = request.getParameter("quiz");
        
        Quiz quiz = new Quiz();
        PreviewQuiz previewQuiz = new PreviewQuiz();
        
        quiz.setQuizQuestions(previewQuiz.getQuizQuestions(quizID));
        quiz.setQuizCAnswers(previewQuiz.getQuizQuestionsAnswers(quizID));
        quiz.setQuizI1Answers(previewQuiz.getQuizIncOne(quizID));
        quiz.setQuizI2Answers(previewQuiz.getQuizIncTwo(quizID));
        quiz.setQuizI3Answers(previewQuiz.getQuizIncThree(quizID));
        quiz.setQuizQuestionID(previewQuiz.getQuestionID(quizID));
        
        session.setAttribute("Quiz", quiz);
        
        RequestDispatcher rd = request.getRequestDispatcher("previewQuiz.jsp");
        rd.forward(request,response);
    }


}
