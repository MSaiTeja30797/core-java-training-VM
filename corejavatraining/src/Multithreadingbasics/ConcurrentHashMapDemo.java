package Multithreadingbasics;
import java.util.*;
public class ConcurrentHashMapDemo {
  public static void main(String []args) {
	  HashMap<String,Integer> hm=new HashMap<String,Integer>();
	  hm.put("sai",78);
	  hm.put("teja",85);
	  hm.put("anudeep",90);
	  System.out.println("elements= "+hm);
	  /*hm.computeIfAbsent("lalit", a->75);
	  hm.computeIfAbsent("jay", a->70);
	  System.out.println(hm.containsValue(95));
	  System.out.println(hm.containsValue(94));
	  System.out.println(hm.containsValue(70));
	  System.out.println(hm.containsKey("hi"));
	  System.out.println(hm.containsKey("sam"));
	  System.out.println(hm.containsKey("After adding= "+hm));*/
	  
	  for(Integer val: hm.values()) {
		  System.out.println(val);
		  hm.computeIfAbsent("mahesh:", a->90);
		  hm.put("sam", 89);
	  }
	  System.out.println();
	  }
}
