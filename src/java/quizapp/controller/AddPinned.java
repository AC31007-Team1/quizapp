/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import quizapp.bean.StudentLogin;
import quizapp.model.CreatePinned;

@WebServlet(name = "AddPinnedControler", urlPatterns = {"/AddPinnedControler", "/AddPinnedControler/"})
public class AddPinned extends HttpServlet {

    public AddPinned() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int quizID = Integer.parseInt(request.getParameter("quizID"));
        HttpSession session = request.getSession();
        StudentLogin lg = (StudentLogin) session.getAttribute("StudentLogin");
        int studentID = lg.getID();

        CreatePinned pinned = new CreatePinned();

        try {
            pinned.insertPinned(quizID, studentID);
            response.sendRedirect("/2016-agileteam1");
        } catch (SQLException ex) {
            Logger.getLogger(AddQuiz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(AddPinned.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
