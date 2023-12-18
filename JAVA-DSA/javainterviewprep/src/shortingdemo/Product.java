package shortingdemo;


	import java.util.Objects;
//compareabe compares in single object with there varbiels 
	//like price in this example
	/*
	 * single shorting
	 * original object is modifed
	 * 
	 * 
	 * 
	 */
	public class Product implements Comparable<Product>{

		private int id;
		private String name;
		private String category;
		private int price;
		public Product(int id, String name, String category, int price) {
			super();
			this.id = id;
			this.name = name;
			this.category = category;
			this.price = price;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;

}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	
	
	
	@Override
	public int compareTo(Product o) 
	{
		return this.name.compareTo(o.name);
	}
	public int compareTo1(Product o2) {
	    return Integer.compare(this.price, o2.price);
	}

	
	
}