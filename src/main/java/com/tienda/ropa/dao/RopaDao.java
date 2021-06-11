package com.tienda.ropa.dao;

import com.tienda.ropa.items.Camiseta;

public class RopaDao {
	
	public Camiseta mostrarCamiseta () {
		Camiseta camiseta1 = new Camiseta ();
		camiseta1.setColor("Rojo");
		return camiseta1;
	}
}
