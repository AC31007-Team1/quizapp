package quizapp.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import quizapp.model.QuizQuestions;

@WebServlet(name = "SubmitQuestions", urlPatterns = {"/SubmitQuestions", "/SubmitQuestions/"})
public class SubmitQuestions extends HttpServlet{
    public SubmitQuestions() {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        QuizQuestions qq = new QuizQuestions();

        String question = request.getParameter("question");
        String cAnswer = request.getParameter("answerc");
        String[] iAnswer = new String[3];

        // is it possible to have array here? or have '3' change to question amount
        for(int i = 0; i < 3; i++) {
            iAnswer[i] = request.getParameter("answeri" + i);
        }


        qq.submitQuestion(question);
        qq.submitAnswers(cAnswer, iAnswer);


        response.sendRedirect("submitquestions.jsp"); // will need to replace and find way of only submitting one question at a time??
    }
}
