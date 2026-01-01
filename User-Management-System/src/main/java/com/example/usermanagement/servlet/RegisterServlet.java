package com.example.usermanagement.servlet;

import com.example.usermanagement.dao.UserDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        UserDao dao = new UserDao();
        if (dao.registerUser(req.getParameter("username"),
                             req.getParameter("password"))) {
            res.getWriter().print("Registration Successful");
        } else {
            res.getWriter().print("Registration Failed");
        }
    }
}
