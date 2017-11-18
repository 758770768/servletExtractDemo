package org.demo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTwo
 */
@WebServlet("/servletTwo")
public class ServletTwo extends ServeltMain {
	private static final long serialVersionUID = 1L;
       
   
    public ServletTwo() {
        super();
    }
 
	public void three(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at three: ").append(request.getContextPath());
	}

	public  void four(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at four: ").append(request.getContextPath());
	}

}
