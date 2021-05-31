package collections.test;
import java.util.*;
public class ArrayListTest {
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();
		list.add("sai"); 
		list.add("teja");  
		list.add("java"); 
	     Collections.sort(list);
		   
            System.out.print(list);
        
		
		/*Map <Integer,String> map=new HashMap<>();
		map.put(1, "sai");
		System.out.println(map);*/
		 /*SortedSet<String> set = new TreeSet<>();   
		set.add("ravi");
		set.add("john");
		set.add("anil");
		set.add("kumar");
		System.out.print(set);*/
		
	}
}
