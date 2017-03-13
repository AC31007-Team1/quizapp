package quizapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import quizapp.bean.StudentLogin;
import quizapp.model.FetchStudentPinned;
import quizapp.model.DeleteStudentPinned;

@WebServlet(name = "ViewPinned", urlPatterns = {"/ViewPinned"})
public class ViewPinned extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        StudentLogin studentLogin = (StudentLogin) session.getAttribute("StudentLogin");
        gatherStudentPinned(studentLogin.getID(), request, response);
    }

    private void gatherStudentPinned(int sID, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FetchStudentPinned sP = new FetchStudentPinned();
        request.setAttribute("pinnedList", sP.getQuizzes(sID));
        RequestDispatcher rd = request.getRequestDispatcher("/favourites.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String sss = request.getParameter("DeletePinned");
        int quizID = Integer.parseInt(sss);
        
        DeleteStudentPinned deleteStudentPinned = new DeleteStudentPinned();
        
        StudentLogin studentLogin = (StudentLogin) session.getAttribute("StudentLogin");
        
        boolean didItDelete = deleteStudentPinned.deletePinned(quizID, studentLogin.getID());
        
        if (didItDelete) {
            session.setAttribute("deletePinnedAttempt", quizID);
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("AccountProfile");
            rd.forward(request, response);
        }
    }
}
