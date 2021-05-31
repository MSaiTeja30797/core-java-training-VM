package assignment30may;

import java.io.*;
import java.util.SortedSet;
import java.util.TreeSet;

import java.util.LinkedHashSet;

public class States {
   public static void main(String[] args) throws IOException {
	
	
	File f=new File("C:\\Users\\Sai Teja\\Desktop\\states.txt");
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	
	LinkedHashSet<String>states=new LinkedHashSet<String>();
	
	String line=br.readLine();
	while(line!=null)
	{
		states.add(line);
		line=br.readLine();
	}
	System.out.println("Total states = "+states.size());
	System.out.println(states.remove("maharastra"));
	System.out.println(states);
	System.out.println("the names start with a:");
	for (String i : states) {
		
		if(i.startsWith("a"))
		{
			System.out.println(i);
		}
	}
	
	
	
	SortedSet<String>sortstates=new TreeSet<String>(states);
	     System.out.println("afer sorting"+sortstates);
	
}
}

