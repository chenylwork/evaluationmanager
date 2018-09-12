package com.evaluationmanager.interceptor;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.evaluationmanager.entiy.User;

public class LoginFilter extends HttpServlet implements Filter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		    HttpServletRequest req = (HttpServletRequest) request;  
	        HttpServletResponse resp = (HttpServletResponse) response;  
	        HttpSession session = req.getSession(true); 
	        //获取请求的路径
	        String url = req.getRequestURI();  
	        //
	        User user = (User)session.getAttribute("LOGINED_USER");
	        if (user==null && url.indexOf("login.jsp") == -1) {
	        	String location = "/evaluationmanager/login.jsp";
	        	resp.sendRedirect(location);
	            //request.getRequestDispatcher(location).forward(request, response);  
	            System.out.println("成功拦截到外星人企图入侵网站后台   :  " + url); 
	            
			}else{
				chain.doFilter(request, response);  
			}
	       
	}

}
