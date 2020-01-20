package com.test.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "UserListFilter",urlPatterns = "/list")
public class UserListFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter starting...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("=========分支2.0开发=========");
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        HttpSession session=request.getSession();
        String user= (String) session.getAttribute("user");

        if(null!=user){
            filterChain.doFilter(servletRequest,servletResponse);   //放行
        }else {
            System.out.println("=======被拦截，跳转到登录页面！=========");
            servletRequest.getRequestDispatcher("/login.jsp").forward(servletRequest,servletResponse);
        }

    }

    public int add(int a,int b){
        return a+b;
    }

    @Override
    public void destroy() {

    }
}
