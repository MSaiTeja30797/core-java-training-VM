package oopsconcept;

public class EmployeePersonalDetails  extends EmployeeDetails{
    String nationality;

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public static void main(String[] args) {
		EmployeePersonalDetails empPerDetails =new EmployeePersonalDetails();
		empPerDetails.setId(101);
		empPerDetails.setName("SAI");
		empPerDetails.setDept("cs");
		empPerDetails.setEmail("asa@.com");
		empPerDetails.setMob("123456");
		empPerDetails.setAddress("GNT");
		empPerDetails.setNationality("India");
		System.out.println(empPerDetails.getId());
		System.out.println(empPerDetails.getName());
		System.out.println(empPerDetails.getDept());
		System.out.println(empPerDetails.getEmail());
		System.out.println(empPerDetails.getNationality());
	}
}
