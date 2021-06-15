package com.tienda.ropa.dao;

import javax.enterprise.inject.Default;
import com.tienda.ropa.items.Camiseta;
import com.tienda.ropa.items.Item;

@Default
public class RopaDao extends DaoAbs {
	
	public Item mostrarItem () {
		Camiseta camiseta1 = new Camiseta ();
		camiseta1.setColor("Rojo");
		return camiseta1;
	}
}
