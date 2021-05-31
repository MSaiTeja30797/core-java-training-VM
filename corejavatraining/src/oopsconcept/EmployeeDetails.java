package oopsconcept;

public class EmployeeDetails extends Employee {
	
	String email;
	String mob;
	String address;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	/*public EmployeeDetails(int id,String name,String dept,String email,String mob,String address)
	
	{
		super(id,name,dept);
		this.email=email;
		this.mob=mob;
		this.address=address;
		
		
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+email+" "+mob+" "+address;
		
	}

	
	public static void main(String[] args)
	{
		
		EmployeeDetails empd = new EmployeeDetails(100,"abc","it","a@b","123","tnl");
		
		System.out.println(empd);
		
		
	}*/
}