package serializationbasics;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;


public class SerializatinDemo {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
      Employee emp= new Employee(1,"sai");
      FileOutputStream fis=new FileOutputStream("abc.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fis);
      oos.writeObject(emp);
      System.out.println("=====serialization done==");
	}

}
