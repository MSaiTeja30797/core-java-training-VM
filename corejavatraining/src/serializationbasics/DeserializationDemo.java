package serializationbasics;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;

public class DeserializationDemo {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("abc.ser");
	      ObjectInputStream ois = new ObjectInputStream(fis);
	      
	      Employee e =(Employee) ois.readObject();
	      System.out.println(e.id + " "+e.name);

	}

}
