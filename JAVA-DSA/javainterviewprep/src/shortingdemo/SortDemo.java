package shortingdemo;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

	public class SortDemo {

		public static void main(String[] args) {

			ArrayList<String> names = new ArrayList<String>();
			names.add("manoj");
			names.add("sourab");
			names.add("ankit");
			
			System.out.println("names :"+ names);
			Collections.sort(names);
			System.out.println("after sort names :"+ names);
	ArrayList<Integer> marks = new ArrayList<Integer>();
			marks.add(78);
			marks.add(23);
			marks.add(40);
			
			System.out.println("marks :"+ marks);
			Collections.sort(marks);
			System.out.println("after sort marks :"+ marks);
			
			ArrayList<Product> products = new ArrayList<Product>();
			products.add(new Product(1, "laptop", "electronics", 70000));
			products.add(new Product(2, "head phone", "electronics", 4000));
			products.add(new Product(3, "Arrow shirt", "cloth", 6000));
	      
			Collections.sort(products);

			System.out.println("---after sorting using comparable ---");
			System.out.println("shorting by name");
			for(Product product : products)
				System.out.println(product);
			
	     // Add some products to the list
	        products.add(new Product(1, "Product A", "Category X", 100));
	        products.add(new Product(2, "Product B", "Category Y", 50));
	        products.add(new Product(3, "Product C", "Category Z", 75));

	        // Sort the products by price
	        Collections.sort(products, (p1, p2) -> p1.compareTo1(p2));

	        // Print the sorted list
	        System.out.println("short based on price");
	        System.out.println("================");
	        for (Product product : products) {
	            System.out.println(product);
	        }

	}

	}
	class PriceComparator implements Comparator<Product>
	{
//compartor compares tow different objects
		//multipe shorting
		//seprate class
		@Override
		public int compare(Product o1, Product o2) {
			if(o1.getPrice()==o2.getPrice())
				return 0;
			else if(o1.getPrice() > o2.getPrice())
				return 1;
			return -1;
		}
		
	}
	class NameComparator implements Comparator<Product>
	{

		@Override
		public int compare(Product o1, Product o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}