package com.test.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Login",urlPatterns = "/login",loadOnStartup = 0)
public class LoginServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        String user=req.getParameter("user_name");
        String pass=req.getParameter("passwd");
        if(!user.isEmpty() && !pass.isEmpty()){
            //req.setAttribute("userInfo",user);
            req.getSession().setAttribute("user",user);
        }else {
            //req.setAttribute("userInfo",null);
            req.getSession().setAttribute("user",null);
        }

    }
}
