package collections.test;
import java.util.*;
public class ComparatorTest {
  public static void main(String[]args) {
	  ArrayList<Product> arr=new ArrayList<Product>();
	  arr.add(new Product(1,"mobile",10000));
	  arr.add(new Product(2,"TV",60000));
	  arr.add(new Product(3,"Laptop",30000));
	  
	  for(Product product:arr)
	  {
         System.out.println(product);
	  }
	  for(Product product: arr) {
		  if(product.getPrice()>=50000)
		  System.out.println(" Above 50000 price Name:" +product.getName()+" id:"+product.getId());
	  }
	  
	  Collections.sort(arr, new PriceSorting());
	  System.out.println("----------Price Sorting--------------------");

	  for(Product product:arr)
	  {


	  System.out.println(product);
	  }
	  
	  Collections.sort(arr, new NameSorting());
	  System.out.println("----------After Name Sorting--------------------");

	  for(Product product:arr)
	  {


	  System.out.println(product);
	  }
	  
  }
}
