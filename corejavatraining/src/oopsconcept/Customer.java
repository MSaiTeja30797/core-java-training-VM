package oopsconcept;

public class Customer {

	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	String firstName;
	String lastName;
	String account;
	/*public Customer()
	{
		System.out.println("In default Constructor");
	}
	public Customer(int id, String firstName) {
		super();
		this.id = id;
		this.firstName = firstName;
		System.out.println(id);
		System.out.println(firstName);
	}


	public Customer(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println(id);
		System.out.println(firstName);
		System.out.println(lastName);
	}*/
	}