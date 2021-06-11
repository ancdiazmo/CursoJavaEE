package com.tienda.ropa.dao;

import javax.inject.Inject;

import com.tienda.ropa.items.Camiseta;

public class RopaDao {
	
	@Inject
	private Camiseta camiseta1;
	
	public void mostrarCamiseta () {
		camiseta1.setColor("Rojo");
		System.out.println("Hola soy una camiseta de "
				+ "color: " + camiseta1.getColor());
	}
}
