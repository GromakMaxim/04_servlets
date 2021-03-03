package com.example.demoServlets.servlet;

import com.example.demoServlets.repository.Repository;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ResultServ", value = "/result/*")
public class ResultServ extends HttpServlet {
    Repository repository = Repository.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        if(req.getRequestURI().contains("/result")){
            PrintWriter pr = resp.getWriter();
            pr.println(repository.show());
        }
    }
}
