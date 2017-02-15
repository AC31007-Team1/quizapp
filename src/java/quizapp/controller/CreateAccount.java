/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import quizapp.model.User;
import quizapp.bean.AccountCreationData;

/**
 *
 * @author craigwatt
 */
@WebServlet(name = "CreateAccount", urlPatterns = {"/CreateAccount"})

@MultipartConfig
public class CreateAccount extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        // TODO Auto-generated method stub
        //connect to database??
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("createAccount.jsp");
        rd.forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String uName = request.getParameter("username");
            String uEmail = request.getParameter("email");
            String uSoul = request.getParameter("soulChoice");
            //int sMatric = 0;
            if(!uSoul.equals("Student")){
                AccountCreationData acdStaff = new AccountCreationData();
                acdStaff.setStaffData(uName, uEmail);
                
                User staffRegModel = new User();
                staffRegModel.insertStaffAccount();
            }
            else{
                String sMatric = request.getParameter("matric");
                
                AccountCreationData acdStudent = new AccountCreationData();
                acdStudent.setStudentData(uName, uEmail, sMatric);
                
                User studentRegModel = new User();
                studentRegModel.insertStudentAccount();
            }
            /**
            if(fname.equals(null) || sname.equals(null)){
                response.sendRedirect("/Instagrim");
            }

            if(!fname.equals("") && !sname.equals("")){
                HttpSession session=request.getSession();
                LoggedIn lg= (LoggedIn)session.getAttribute("LoggedIn");
                String username="majed";
                if (lg.getlogedin()){
                    username=lg.getUsername();
                }
                else{response.sendRedirect("/Instagrim");}
                PicModel tm = new PicModel();
                tm.setCluster(cluster);
                tm.setflname(fname, sname, username);
                response.sendRedirect("/Instagrim/Profile/"+username);
                }
            else{response.sendRedirect("/Instagrim");} 
            */
    }

    @Override
    public String getServletInfo() {
        return "doGet (request forward to create Account JSP page.  doPost ()";
    }// </editor-fold>

}
