/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import quizapp.model.DeleteStaffQuiz;

/**
 *
 * @author craigwatt
 */
@WebServlet(name = "ChangeAvailability", urlPatterns = {"/ChangeAvailability"})
public class ChangeAvailability extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String aaa = "";
        aaa = request.getParameter("Availability");
        int quizID = Integer.parseInt(aaa);
        DeleteStaffQuiz deleteStaffQuiz = new DeleteStaffQuiz();
        boolean didItChange;
        didItChange = deleteStaffQuiz.changeAvailability(quizID);
        HttpSession session = request.getSession();
        if (didItChange) {
            session.setAttribute("changeAttempt", quizID);
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
