package com.tienda.ropa.service;

import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.tienda.ropa.dao.IDao;
import com.tienda.ropa.items.Item;
import com.tienda.utiles.TiendaAbs;

public class RopaService extends TiendaAbs {
	
	@Inject @Default
	private IDao ropaDao;
	
	public Item mostrarItem () {
		System.out.println(SI);
		return ropaDao.mostrarItem();
	}
}
