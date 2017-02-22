package quizapp.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddQuizQuestions", urlPatterns = {"/AddQuizQuestions", "/AddQuizQuestions/"})
public class AddQuizQuestionsController extends HttpServlet{
    public AddQuizQuestionsController() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("addQuizQuestions.jsp");
            rd.forward(request,response);
    }
}
