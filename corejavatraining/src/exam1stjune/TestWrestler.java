package exam1stjune;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestWrestler {

	public static void main(String[] args) {
		ArrayList<Wrestler> wrestlers = new ArrayList<Wrestler>();
		wrestlers.add(new Wrestler("Sai","Teja", 85));
		wrestlers.add(new Wrestler("Ashok", "Guptha", 100));
		wrestlers.add(new Wrestler("Raju", "Ram", 220));
		wrestlers.add(new Wrestler("yaswanth", "Raj", 170));
		
		long count = wrestlers.stream().count();
		System.out.println("No of wrestlers :"+count);
		
		long  wsum = wrestlers.stream().filter(x->x.getWeight()>200).map(x->x.getWeight()).reduce(0,(y,z)->y+z);
		
		 System.out.println("sum of wrestlers weight > 200  are : "+wsum);
		 System.out.println("FirstName of  wrestlers are: ");
		 wrestlerFirstName(wrestlers).forEach(p->System.out.println(p));
		 
		 System.out.println("wrestlers sorted by firstname are :");
		 sortbywrestlerFirstName(wrestlers).forEach(p->System.out.println(p.getFirstName()));
	 
	}
	private static List<String> wrestlerFirstName(List <Wrestler> list)
	{
		 return list.stream().map(p->p.getFirstName()).collect(Collectors.toList());
		
	}
	private static List<Wrestler> sortbywrestlerFirstName(List <Wrestler> list)
	{
		 return list.stream().sorted(Comparator.comparing(Wrestler::getFirstName)).collect(Collectors.toList());
	}
	}