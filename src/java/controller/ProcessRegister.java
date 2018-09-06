/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Profile;
import util.Validate;

/**
 *
 * @author vothanhtai
 */
public class ProcessRegister extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // Nhận giá trị utf từ user đăng ký
        request.setCharacterEncoding("UTF-8");

        String firstName = request.getParameter("first-name");
        String lastName = request.getParameter("last-name");
        String emailOrPhone = request.getParameter("mobile-or-email");
        String password = request.getParameter("user-password");
        String day = request.getParameter("day");
        String month = request.getParameter("month");
        String year = request.getParameter("year");
        String sex = request.getParameter("sex");
        
        RequestDispatcher rd = request.getRequestDispatcher("register.jsp");

        // thực hiện forward lại trang đăng ký nếu thông tin không hợp lệ
        if (!Validate.checkName(firstName)) {
            request.setAttribute("error", "Firstname is invalid");
            rd.forward(request, response);
        } else if (!Validate.checkName(lastName)) {
            request.setAttribute("error", "Lastname is invalid");
            rd.forward(request, response);
        } else if (!Validate.checkEmailOrPhone(emailOrPhone)) {
            request.setAttribute("error", "Email or phone is invalid");
            rd.forward(request, response);
        } else if (UserDAO.isDuplicateEmailOrPhone(emailOrPhone)) {
            request.setAttribute("error", "Email or phone is already exist");
            rd.forward(request, response);
        } else if (!Validate.checkPassword(password)) {
            request.setAttribute("error", "Password is invalid");
            rd.forward(request, response);
        } else {
            String birthDay = String.format("%s-%s-%s", day, month, year);
            Profile profile = new Profile(-1, firstName, lastName, emailOrPhone, password, birthDay, sex);
            boolean result = UserDAO.addNewUser(profile);
            if (result) {
                response.sendRedirect("login.jsp");
            } else {
                request.setAttribute("error", "Something went wrong. Please try again!");
                rd.forward(request, response);
            }
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Process Register Servlet";
    }// </editor-fold>

}
