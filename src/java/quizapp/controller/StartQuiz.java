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
import quizapp.bean.StudentQuiz;
import quizapp.model.PreviewQuiz;

@WebServlet(name = "StartQuiz", urlPatterns = {"/StartQuiz"})
public class StartQuiz extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // left blank intetionally
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        String quizID = request.getParameter("quiz");

        
        Quiz quiz = new Quiz();
        PreviewQuiz previewQuiz = new PreviewQuiz();
        
        quiz.setQuizID(quizID);
        quiz.setQuizQuestions(previewQuiz.getQuizQuestions(quizID));
        quiz.setQuizCAnswers(previewQuiz.getQuizQuestionsAnswers(quizID));
        quiz.setQuizI1Answers(previewQuiz.getQuizIncOne(quizID));
        quiz.setQuizI2Answers(previewQuiz.getQuizIncTwo(quizID));
        quiz.setQuizI3Answers(previewQuiz.getQuizIncThree(quizID));
        quiz.setQuizQuestionID(previewQuiz.getQuestionID(quizID));
        quiz.setQuizEAnswers(previewQuiz.getAnswerExplanation(quizID));
        quiz.setQuizVideoUrls(previewQuiz.getVideoUrl(quizID));
        
        session.setAttribute("Quiz", quiz);
        
        StudentQuiz studentQuiz = new StudentQuiz();
        session.setAttribute("StudentQuiz", studentQuiz);
                
        RequestDispatcher rd = request.getRequestDispatcher("startquiz.jsp");
        rd.forward(request, response);
        
    }
}
