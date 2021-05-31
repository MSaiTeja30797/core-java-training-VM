package iobasics;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String str="";
			File f=new File("C:\\Users\\Sai Teja\\Desktop\\reverse.txt");
			FileReader fr = new FileReader(f);
			int r= fr.read();
			while(r!=-1) {
				str=str+(char)r;
				r=fr.read();
			}
			fr.close();
			StringBuffer sb =new StringBuffer(str);
			String str1 = sb.reverse().toString();
			FileWriter fw =new FileWriter(f);
			fw.write(str1);
			fw.flush();
			fw.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
