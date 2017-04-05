package com.rivera.controller;

import com.rivera.entity.User;
import com.rivera.persistance.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(

        name = "Login",
        urlPatterns = {"/login"}

)

public class Login extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UserDAO userDao = new UserDAO();

        User user = userDao.getUserByUserName(request.getUserPrincipal().getName());

        request.getSession().setAttribute("user", user);

        response.sendRedirect("/");

    }

}