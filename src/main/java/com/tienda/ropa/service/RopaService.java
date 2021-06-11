package com.tienda.ropa.service;

import javax.inject.Inject;

import com.tienda.ropa.dao.RopaDao;
import com.tienda.ropa.items.Camiseta;

public class RopaService {
	
	@Inject
	private RopaDao ropaDao;
	
	public Camiseta mostrarCamiseta () {
		return ropaDao.mostrarCamiseta();
	}
}
