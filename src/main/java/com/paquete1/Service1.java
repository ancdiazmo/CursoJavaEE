package com.paquete1;

import javax.inject.Inject;

public class Service1 {
	
	@Inject
	private Dao1 dao1;
	
	public void metodo1 () {
		dao1.metodo1();
	}
}
