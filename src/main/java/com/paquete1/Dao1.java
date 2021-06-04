package com.paquete1;

import javax.inject.Inject;

public class Dao1 {
	
	@Inject
	private Clase1 clase1;
	
	public void metodo1 () {
		clase1.setAtributo1("Hola soy un atributo");
		System.out.println("Hola soy un Clase1 de "
				+ "atributo: " + clase1.getAtributo1());
	}
}
