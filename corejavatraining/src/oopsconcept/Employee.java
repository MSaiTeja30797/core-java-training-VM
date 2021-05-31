package oopsconcept;

public class Employee {
int id;
String name;
String dept;

/*Employee(){}
public Employee(int id,String name,String dept)
{
	this.id=id;
	this.name=name;
	this.dept=dept;
}*/
/*public String toString()
{
	return id+"  "+name+"  "+dept;
}*/
/*void show()
{
	System.out.println("Emo id :"+id);
	System.out.println("Emo name :"+name);
	System.out.println("Emo dept :"+dept);
	
}*/
/*public static void main(String[] args) {
	Employee emp=new Employee();
	
Employee emp1=new Employee(100,"sai","it");
System.out.println(emp);
System.out.println(emp1);


}*/
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
}
