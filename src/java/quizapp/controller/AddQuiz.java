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
import quizapp.bean.StaffLogin;
import quizapp.model.CreateQuiz;


@WebServlet(name = "AddQuiz", urlPatterns = {"/AddQuiz", "/AddQuiz/"})
public class AddQuiz extends HttpServlet{
    public AddQuiz() {
}
    
@Override
    public void init(ServletConfig config) throws ServletException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("AddQuiz.jsp");
        rd.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String quizname = request.getParameter("quizname");
        int module = Integer.parseInt(request.getParameter("module"));
        HttpSession session = request.getSession();
        StaffLogin lg = (StaffLogin) session.getAttribute("StaffLogin");
        String staffID=lg.getStaffID();
        LocalDateTime created = LocalDateTime.now();
        int available = 0;
        CreateQuiz initquiz = new CreateQuiz();
        
        try {
            initquiz.insertQuiz(quizname,module,staffID,created,available); 
            response.sendRedirect("/quizapp");
        } catch (SQLException ex) {
            Logger.getLogger(AddQuiz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(AddQuiz.class.getName()).log(Level.SEVERE, null, ex);
        }

        
 
    }

}

