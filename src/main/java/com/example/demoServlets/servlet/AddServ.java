package com.example.demoServlets.servlet;

import com.example.demoServlets.model.User;
import com.example.demoServlets.repository.Repository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddServ", value = "/add/*")
public class AddServ extends HttpServlet {
    Repository repository = Repository.getInstance();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getRequestURI().contains("/useradd")) {
            req.getRequestDispatcher("/add-form.jsp").forward(req, resp);
        } else if (req.getRequestURI().contains("/add-success")){
            repository.save(new User(req.getParameter("name"),
                    req.getParameter("surname"),
                    req.getParameter("age"),
                    req.getParameter("email")));
            req.getRequestDispatcher("/add-success.jsp").forward(req, resp);
        }
    }
}
