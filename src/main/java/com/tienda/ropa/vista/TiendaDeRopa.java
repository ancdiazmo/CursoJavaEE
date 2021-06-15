package com.tienda.ropa.vista;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tienda.ropa.items.Item;
import com.tienda.ropa.service.RopaService;

public class TiendaDeRopa extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private RopaService ropaService;
       
    public TiendaDeRopa() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Item camiseta1 = ropaService.mostrarItem();
		System.out.println(camiseta1.toString());
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/TiendaDeRopa.jsp");
		dispatcher.forward(request, response);
	}
}
