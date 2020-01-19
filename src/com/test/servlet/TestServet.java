package com.test.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "TestServlet",urlPatterns = "/test",loadOnStartup = 0)
public class TestServet {

    public void init(){
        System.out.println("servlet starting....");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response){


    }

    public void doPost(HttpServletRequest request, HttpServletResponse response){

    }
}
