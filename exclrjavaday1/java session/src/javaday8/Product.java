package javaday8;

public class Product {
	public int id;
	public String productname;
public String category;
	public int price;
	
	public Product(int id, String productname, String category, int price) {
		super();
		this.id = id;
		this.productname = productname;
		this.category = category;
		this.price = price;
	}
	public static void main(String[] args) {
		
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productname=" + productname + ", category=" + category + ", price=" + price
				+ ",]";
	
	
	
	}

}
