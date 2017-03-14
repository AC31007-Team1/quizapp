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
import quizapp.bean.Staff;
import quizapp.bean.Student;
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("whoLog").equals("staff")) {
            Staff staff = (Staff) session.getAttribute("StaffLogin");
            gatherStaffProfile(staff, request, response);
        } else if (session.getAttribute("whoLog").equals("student")) {
            Student student = (Student) session.getAttribute("StudentLogin");
            gatherStudentProfile(student, request, response);
        }
        /**
         * switch (session.getAttribute("whoLog")) { case "staff": statements //
         * they are executed if variable == c1 break; case "student": statements
         * // they are executed if variable == c2 break; default: statements //
         * they are executed if none of the above case is satisfied break; }
         */
    }

    private void gatherStaffProfile(Staff staff, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StaffMember sm = new StaffMember();
        staff = sm.getProfile(staff.getID());
        request.setAttribute("profile", staff);
        RequestDispatcher rd = request.getRequestDispatcher("/editProfile.jsp");
        rd.forward(request, response);
    }

    private void gatherStudentProfile(Student student, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentMember sm = new StudentMember();
        student = sm.getProfile(student.getID());
        request.setAttribute("profile", student);
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
            Staff staff = (Staff) session.getAttribute("StaffLogin");
            if (changeProfile.editStaffProfile(first_name, last_name, email, staff.getID())) {
                response.sendRedirect("/2016-agileteam1/AccountProfile");
            }
        } else if (session.getAttribute("whoLog").equals("student")) {
            Student student = (Student) session.getAttribute("StudentLogin");
            if (changeProfile.editStudentProfile(first_name, last_name, email, student.getID())) {
                response.sendRedirect("/2016-agileteam1/AccountProfile");
            }
        }
    }

    @Override
    public String getServletInfo() {
        return "AccountProfile Servlet";
    }
}
