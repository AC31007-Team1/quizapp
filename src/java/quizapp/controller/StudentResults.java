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
import quizapp.bean.Staff;
import quizapp.bean.Student;
import quizapp.bean.StudentQuizStat;
import quizapp.bean.UserLogin;
import quizapp.model.FetchStudentResults;
import quizapp.model.StudentMember;

/*
    @author craigwatt
 */
@WebServlet(name = "StudentResults", urlPatterns = {"/StudentResults"})
public class StudentResults extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        UserLogin userLogin = (UserLogin) session.getAttribute("whoLog");
        gatherStudentResults(userLogin.getID(), request, response);
    }

    private void gatherStudentResults(int matricN, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FetchStudentResults fsr = new FetchStudentResults();
        request.setAttribute("statList", fsr.getStudentStats(matricN));

        RequestDispatcher rd = request.getRequestDispatcher("/studentResults.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
