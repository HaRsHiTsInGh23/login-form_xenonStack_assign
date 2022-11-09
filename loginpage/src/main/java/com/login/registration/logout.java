package com.login.registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class logout
 */
@WebServlet(urlPatterns ={"/LogoutServlet"})
public class logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
   
    public logout() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		session.invalidate();
		response.sendRedirect("login.jsp");

	}

}
