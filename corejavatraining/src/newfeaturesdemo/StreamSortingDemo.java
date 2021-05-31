package newfeaturesdemo;
import java.util.ArrayList;

import java.util.Collections;

public class StreamSortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> nums = new ArrayList<Integer>();
      nums.add(2);
      nums.add(1);
      nums.add(10);
      nums.add(7);
      nums.add(3);
      nums.forEach(System.out::println);
      
      System.out.println("==== Sorting =====");
      nums.stream().sorted().forEach(System.out::println);
      
      System.out.println("==== Reverse Order Sorting =====");
      nums.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
