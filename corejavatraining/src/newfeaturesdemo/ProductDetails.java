package newfeaturesdemo;
 import java.util.ArrayList;
public class ProductDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Product> product = new ArrayList<Product>();
		
		product.add(new Product(1001, "Pen", "Stationary", 10, 100));
		product.add(new Product(1002, "Books", "Stationary", 30, 80));
        product.add(new Product(1003, "Laptop", "Electronics", 40000, 10));
		product.add(new Product(1004, "Mobile", "Electronics", 20000, 30));
		product.add(new Product(1005, "TV", "Electronics", 60000, 15));
		product.add(new Product(1006, "Car", "Toy", 1000, 50));
		product.add(new Product(1007, "Bus", "Toy", 2000, 20));
		product.add(new Product(1008, "Chips", "Snackes", 10, 20));
		product.add(new Product(1009, "Milk", "Drinkes", 50, 60));
		
		product.forEach(System.out::println);
		System.out.println("======================");
		long productCount=product.stream().count();
		System.out.println("Total product Count = "+productCount);
		
		System.out.println("======================");
         System.out.println("Price Greater than 50000");
		product.stream().filter(s1->s1.getPrice()>50000).forEach(s1->System.out.println(s1));
		
		System.out.println("============product to Uppercase===========");
		product.stream().map(s -> s.getPname().toUpperCase()).forEach(System.out::println);
		
		System.out.println("============Category to Lowercase===========");
		product.stream().map(s -> s.getCategory().toLowerCase()).forEach(System.out::println);
	}

}
