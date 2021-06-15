package com.tienda.ropa.items;

public class Camiseta extends Item {
	
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Camiseta [color=" + color + "]";
	}
	
}
