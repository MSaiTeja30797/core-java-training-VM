package exception.handling;

public class ClassNotFoundTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 Class.forName("HW");
    	 System.out.println("class Found");)
     }
     catch(ClassNotFoundException e) {
    	 e.printStackTrace();
     }
	}

}
