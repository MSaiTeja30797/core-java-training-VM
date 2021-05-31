package collections.test;
import java.util.*;


class Employee {
         int id;
		String name;
		String dept;
		public Employee(int id,String name,String dept) {
			super();
			this.id=id;
			this.name=name;
			this.dept=dept;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
		}
		
	
}
class EmployeeDetails extends Employee{
	String address;
	String pancard;
	public EmployeeDetails(int id,String name,String dept,String address,String pancard) {
		super(id,name,dept);
		this.address= address;
		this.pancard=pancard;
}
	@Override
	public String toString() {
		return "EmployeeDetails [address=" + address + ", pancard=" + pancard + "]";
	}
	
}

public class SetTest{
	public static void main(String[] args) {
		/*Employee e=new Employee(1,"sai","it");
		ArrayList<Employee> list =new ArrayList<>();
		list.add(e);
		System.out.print(list);*/
	
	ArrayList<String> al =new ArrayList<>();
	al.add("abc");
	al.add("xyz");
	String s=(String)al.get(0);
	System.out.println(s);
	}
}
