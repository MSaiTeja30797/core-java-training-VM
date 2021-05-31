package oopsconcept;

public class TestAssociation {
    public static void main(String[] args) {
    	showAggregation();
    }
    static void showAggregation()
    {
    	Address address=new Address();
    	address.setCity("Tnl");
    	address.setCity("Ap");
    	address.setState("India");
    	System.out.println(address);
    			
    }
}
