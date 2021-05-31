package exception.handling;

class Training {
 void train() throws Exception{
	 System.out.println("Dot net zero Knowledge");
 }
}

public class ThrowsTest{
	public static void main(String []args) throws Exception{
		Training training= new Training();
		training.train();	}
}