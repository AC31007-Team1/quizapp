package quizapp.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import quizapp.bean.QuestionContainer;
import quizapp.model.EditQuizQuestion;

@WebServlet(name = "editQuizQuestion", urlPatterns = {"/editQuizQuestion", "/editQuizQuestion/"})
public class editQuizQuestion extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("editQuizQuestion.jsp");
        rd.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String[] incorrectAnswers = new String[3];
        String correctAnswer = request.getParameter("cAnswer");
        String question = request.getParameter("question");
        String explanation = request.getParameter("eAnswer");
        
        for (int i=0;i<3;i++)
        {
            int a=i+1;
            incorrectAnswers[i] = request.getParameter("answeri"+a);
        }
        
        HttpSession session = request.getSession();
        QuestionContainer questionContainer = (QuestionContainer) session.getAttribute("QuestionContainer");
        EditQuizQuestion editQuizQuestion = new EditQuizQuestion();
        
        editQuizQuestion.updateQuizQuestions(question,questionContainer.getQuestionID());
        editQuizQuestion.updateQuizAnswers(correctAnswer, incorrectAnswers[0], incorrectAnswers[1], incorrectAnswers[2], explanation, questionContainer.getQuestionID());
        
        response.sendRedirect("/2016-agileteam1/ViewQuizzes");
    } 
}
