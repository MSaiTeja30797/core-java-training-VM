package iobasics;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   File f= new File("firstprogram.txt");
    FileReader fw= new FileReader(f);
    
    System.out.println((char)fw.read());
    System.out.println(fw.read());
    System.out.println(fw.read());
	}

}
