package com.flyaway.servlets;

import com.flyaway.dao.UserDAO;
import com.flyaway.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);

        UserDAO userDAO = new UserDAO();
        boolean success = userDAO.registerUser(user);

        if (success) {
            response.sendRedirect("confirmation.jsp");
        } else {
            response.sendRedirect("register.jsp?error=Registration failed");
        }
    }
}
