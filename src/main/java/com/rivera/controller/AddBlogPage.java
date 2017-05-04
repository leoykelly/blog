package com.rivera.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(

        name = "AddEntry",
        urlPatterns = {"/addEntryPage"}

)
/**
 * Created by Kelly on 5/4/2017.
 */
public class AddBlogPage extends HttpServlet{


        public void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {


            response.sendRedirect("addEntry.jsp");

        }
    }
