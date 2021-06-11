package com.tienda.ropa.service;

import javax.inject.Inject;

import com.tienda.ropa.dao.RopaDao;

public class RopaService {
	
	@Inject
	private RopaDao rojaDao;
	
	public void mostrarCamiseta () {
		rojaDao.mostrarCamiseta();
	}
}
