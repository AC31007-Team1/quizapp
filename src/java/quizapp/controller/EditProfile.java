/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import quizapp.bean.StaffLogin;
import quizapp.bean.StudentLogin;
import quizapp.model.ChangeProfileDetails;
import quizapp.model.StaffMember;
import quizapp.model.StudentMember;

/**
 *
 * @author craigwatt
 */
@WebServlet(name = "EditProfile", urlPatterns = {"/EditProfile"})
public class EditProfile extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("whoLog").equals("staff")) {
            StaffLogin staffLogin = (StaffLogin) session.getAttribute("StaffLogin");
            gatherStaffProfile(staffLogin, request, response);
        } else if (session.getAttribute("whoLog").equals("student")) {
            StudentLogin studentLogin = (StudentLogin) session.getAttribute("StudentLogin");
            gatherStudentProfile(studentLogin, request, response);
        }
    }

    private void gatherStaffProfile(StaffLogin staffLogin, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StaffMember sm = new StaffMember();
        staffLogin = sm.getProfile(staffLogin.getID());
        request.setAttribute("profile", staffLogin);
        RequestDispatcher rd = request.getRequestDispatcher("/editProfile.jsp");
        rd.forward(request, response);
    }

    private void gatherStudentProfile(StudentLogin studentLogin, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentMember sm = new StudentMember();
        studentLogin = sm.getProfile(studentLogin.getID());
        request.setAttribute("profile", studentLogin);
        RequestDispatcher rd = request.getRequestDispatcher("/editProfile.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        ChangeProfileDetails changeProfile = new ChangeProfileDetails();
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String email = request.getParameter("email");

        //changeProfile.updateProfile(first_name, last_name, slbean.getStaffID());
        if (session.getAttribute("whoLog").equals("staff")) {
            StaffLogin staffLogin = (StaffLogin) session.getAttribute("StaffLogin");
            if (changeProfile.editStaffProfile(first_name, last_name, email, staffLogin.getID())) {
                response.sendRedirect("/2016-agileteam1/AccountProfile");
            }
        } else if (session.getAttribute("whoLog").equals("student")) {
            StudentLogin studentLogin = (StudentLogin) session.getAttribute("StudentLogin");
            if (changeProfile.editStudentProfile(first_name, last_name, email, studentLogin.getID())) {
                response.sendRedirect("/2016-agileteam1/AccountProfile");
            }
        }
    }

    @Override
    public String getServletInfo() {
        return "AccountProfile Servlet";
    }
}
