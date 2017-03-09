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
import quizapp.model.StaffMember;
import quizapp.model.StudentMember;

/**
 *
 * @author craigwatt
 */
@WebServlet(name = "AccountProfile", urlPatterns = {"/AccountProfile"})
public class AccountProfile extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("whoLog").equals("staff")) {
            StaffLogin staffLogin = (StaffLogin) session.getAttribute("StaffLogin");
            gatherStaffProfile(staffLogin.getID(), request, response);
        } else if (session.getAttribute("whoLog").equals("student")) {
            StudentLogin studentLogin = (StudentLogin) session.getAttribute("StudentLogin");
            gatherStudentProfile(studentLogin.getID(), request, response);
        }
    }

    private void gatherStaffProfile(int staffID, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StaffMember sm = new StaffMember();
        StaffLogin slbean;
        slbean = sm.getProfile(staffID);
        request.setAttribute("profile", slbean);
        RequestDispatcher rd = request.getRequestDispatcher("/accountProfile.jsp");
        rd.forward(request, response);
    }

    private void gatherStudentProfile(int matricN, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentMember sm = new StudentMember();
        StudentLogin slbean;
        slbean = sm.getProfile(matricN);
        request.setAttribute("profile", slbean);
        RequestDispatcher rd = request.getRequestDispatcher("/accountProfile.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.sendRedirect("/2016-agileteam1/EditProfile");
    }

    @Override
    public String getServletInfo() {
        return "AccountProfile Servlet";
    }

}
