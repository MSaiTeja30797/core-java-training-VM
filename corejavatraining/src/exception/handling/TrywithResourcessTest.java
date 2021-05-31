package exception.handling;

import java.io.*;
public class TrywithResourcessTest {
   public static void main(String[] args) {
	   try(FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\Sai Teja\\Desktop\\sai.txt"))){
		   String s="sai teja";
		   byte[] by=s.getBytes();
		   fos.write(by);
		   System.out.println("success");
	   }
	   catch(FileNotFoundException e) {
		   e.printStackTrace();
	   }
	   catch(IOException e1) {
		   e1.printStackTrace();
	   }
   }
}
