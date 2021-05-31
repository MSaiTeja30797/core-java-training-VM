package iobasics;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		File f=new File("firstprogram.txt");
		FileWriter fw=new FileWriter(f);
		

		fw.write("a");
		fw.write("hi");
		fw.write(99);
		
		//fw.flush();
		//fw.close();
		
		System.out.println("Written");
		
	}

}