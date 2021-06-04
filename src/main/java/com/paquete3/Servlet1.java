package com.paquete3;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.paquete1.Service1;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Service1 service1;
       
    public Servlet1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service1.metodo1();
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/Servlet1.jsp");
		dispatcher.forward(request, response);
	}

}
