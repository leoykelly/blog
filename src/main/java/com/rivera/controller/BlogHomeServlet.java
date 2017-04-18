package com.rivera.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Kelly on 4/12/2017.
 */



@WebServlet(

        urlPatterns = {"blog-maven/"}

)
public class BlogHomeServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {


            response.sendRedirect("index.jsp");

    }
}

