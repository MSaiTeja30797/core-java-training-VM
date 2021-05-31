package oopsconcept;

public class CustomerGetterSetter {
      public static void main(String[] args) {
    	  Customer customer =new Customer();
    	  customer.setId(1001);
    	  customer.setFirstName("sai");
    	  customer.setLastName("teja");
    	  customer.setAccount("savings");
    	  System.out.println(customer.getId());
    	  System.out.println(customer.getFirstName());
    	  System.out.println(customer.getLastName());
    	  System.out.println(customer.getAccount());
    	  }
}
