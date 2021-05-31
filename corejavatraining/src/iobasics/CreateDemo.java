package iobasics;


import java.io.File;
import java.io.IOException;

public class CreateDemo {
	
	public static void main(String[] args)throws IOException
	{
		File f=new File("firstprogram.txt");
		
		if(f.exists())
		{
			System.out.println("Present");
			
		}
		
		else
		{
			System.out.println("Not Present");
			f.createNewFile();
			System.out.println("Created");

			
		}
	}

}