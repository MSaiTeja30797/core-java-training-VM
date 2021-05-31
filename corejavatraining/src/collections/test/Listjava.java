package collections.test;
import java.util.*;
import java.util.Map.Entry;
public class Listjava {
	public static void main(String args[]){  
		/*ArrayList<String> list=new ArrayList<String>();
		list.add("sai"); 
		list.add("teja");  
		list.add("java"); 
	
		Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next( ));
        }*/
		HashMap<String,String> hm=new HashMap<>();
		hm.put("first name", "sai");
		hm.put("middle name", "teja");
		hm.put("surname", "maturi");
		System.out.println(hm);
		/*System.out.println(hm.get("middle name"));
		System.out.println(hm.size());
		hm.remove("middle name");
		System.out.println(hm.size());*/
		/*Set<String> keys = hm.keySet();
        for(String key: keys){
            System.out.println("Value of "+key+" is: "+hm.get(key));
        }*/
		
		Set<Entry<String, String>> entires = hm.entrySet();
        for(Entry<String,String> ent:entires){
            System.out.println(ent.getKey()+" ==> "+ent.getValue());
        }
		} 
}
