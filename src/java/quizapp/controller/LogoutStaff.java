package quizapp.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import quizapp.bean.StaffLogin;

@WebServlet(name = "LogoutStaff", urlPatterns = {"/LogoutStaff"})
public class LogoutStaff extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        StaffLogin staffLogin = (StaffLogin) session.getAttribute("StaffLogin");
        staffLogin.setLoggedOut();
        session.invalidate();
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }

}
