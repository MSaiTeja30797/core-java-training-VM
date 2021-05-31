package iobasics;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
public class Details {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 int id;
		String name;
		String dept;
		Scanner sc= new Scanner(System.in);
		File f=new File("C:\\Users\\Sai Teja\\Desktop\\sai.txt");
		FileWriter fr=new FileWriter(f);
		BufferedWriter br = new BufferedWriter(fr);
		br.write("ID\t\tName\t\tDept");
		int n=sc.nextInt();
		while(n!=0) {
			id=sc.nextInt();
			name= sc.next();
			dept= sc.next();
			br.newLine();
			br.write(id+"\t\t"+name+"\t\t"+dept);
		}
		
		
		br.flush();
		br.close();
		
		

	}

}
