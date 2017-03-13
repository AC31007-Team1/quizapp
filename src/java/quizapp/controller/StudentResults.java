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
import quizapp.bean.StaffLogin;
import quizapp.bean.StudentLogin;
import quizapp.bean.StudentQuizStat;
import quizapp.model.FetchStudentResults;
import quizapp.model.StudentMember;

/*
    @author craigwatt
*/
@WebServlet(name = "StudentResults", urlPatterns = {"/StudentResults"})
public class StudentResults extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet StudentResults</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StudentResults at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("whoLog").equals("staff")) {
            StaffLogin staffLogin = (StaffLogin) session.getAttribute("StaffLogin");
            //shouldn't be the case
            //gatherStaffProfile(staffLogin.getID(), request, response);
        } else if (session.getAttribute("whoLog").equals("student")) {
            StudentLogin studentLogin = (StudentLogin) session.getAttribute("StudentLogin");
            gatherStudentResults(studentLogin.getID(), request, response);
        }
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
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
