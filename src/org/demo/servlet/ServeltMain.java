package org.demo.servlet;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServeltMain extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServeltMain() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		      String method = request.getParameter("method");
		      try {
		    	  //反射关键代码获取方法
				Method mh = this.getClass().getMethod(method,HttpServletRequest.class,HttpServletResponse.class);
				mh.invoke(this, request,response);
			} catch (Exception e) {
				e.printStackTrace();
			}  
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
        doGet(request, response);		
	}

}
