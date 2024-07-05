package com.flyaway.servlets;

import com.flyaway.dao.AdminDAO;
import com.flyaway.model.Admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AdminLoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        AdminDAO adminDAO = new AdminDAO();
        Admin admin = adminDAO.login(username, password);

        if (admin != null) {
            response.sendRedirect("admin.jsp");
        } else {
            response.sendRedirect("admin-login.jsp?error=Invalid credentials");
        }
    }
}
