package com.excelr.day8.collections;

public class Product {

	int id;
	String name;
	String category;
	int price;
	
	Product(int id, String name, String category, int price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	
	

}
