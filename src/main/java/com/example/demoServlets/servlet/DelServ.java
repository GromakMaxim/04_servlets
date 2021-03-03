package com.example.demoServlets.servlet;

import com.example.demoServlets.repository.Repository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DelServ", value = "/del/*")
public class DelServ extends HttpServlet {
    Repository repository = Repository.getInstance();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getRequestURI().contains("/userdel")) {
            req.getRequestDispatcher("/del-form.jsp").forward(req, resp);
        } else if (req.getRequestURI().contains("/del-success")){
            repository.deleteItem(Integer.parseInt(req.getParameter("id")));
            req.getRequestDispatcher("/del-success.jsp").forward(req, resp);
        }
    }
}
