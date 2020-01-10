package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ComparatorImpl {
	
	public class Product {
		int price;
		String name;
		
		public Product(int price, String name) {
			this.price = price;
			this.name = name;
		}
	}
	
	public static void main(String[] args) {
		ComparatorImpl comparatorImpl = new ComparatorImpl();
		List<Product> products =  new ArrayList<Product>();
		products.add(comparatorImpl.new Product(10, "Rose"));
		products.add(comparatorImpl.new Product(100, "Bouquet"));
		products.add(comparatorImpl.new Product(50, "Plant"));
		System.out.println("Before Sorting:");
		Consumer<Product> impl = a->System.out.println(a.price + "; " + a.name);
		products.forEach(impl);
		Collections.sort(products, (a, b)-> a.name.compareTo(b.name));
		System.out.println("==================================");
		System.out.println("After Sorting based on name:");
		products.forEach(impl);
		Collections.sort(products, (a, b)-> a.price - b.price);
		System.out.println("==================================");
		System.out.println("After Sorting based on Price:");
		products.forEach(impl);
	}

}
