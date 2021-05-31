package exception.handling;
import java.util.Scanner;
public class ProductDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String query;
     Scanner sc=new Scanner(System.in);
     System.out.println("details");
     System.out.println("product didnt recieve");
     System.out.println("product damage");
     System.out.println("money refund");
     System.out.println("Enter the query");
     query=sc.next();
     try {
    	 if(query.equals("didntrecieve")) {
    		 System.out.println("How many days completed");
    		 int days=sc.nextInt();
    		 if(days<7) {
    			 throw new ProductDidntRecieve("product will be recievede shortly");
    		 }
    		 else {
    			 throw new ProductDamaged("product will be replaced");
    		 }
    	 }
    	 
    	 else if(query.equals("damaged")) {
    		 throw new ProductDamaged("product will be replaced");
    	 }
    	 else if(query.equals("days")) {
    		 System.out.println("Enter no of days");
    		 int days=sc.nextInt();
    		 if(days>15) {
    			 throw new DaysExceeded("refund time completed");
    		 }
    		 else {
    			 System.out.println("refund possible");
    		 }
    	 }
     }
    	 catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	 
     
	}

}
