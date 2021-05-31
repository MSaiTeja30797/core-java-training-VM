package collections.test;

import java.util.ArrayList;


class Student{
		int id;
		String name;
		String branch;
	public	Student(int id,String name,String branch){
		this.id=id;
		this.name=name;
		this.branch=branch;
	}

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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", branch=" + branch + "] \n";
	}
}
public class StudentDetails {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al=new ArrayList<Student>(); 
		Student  s1 =  new Student(1001,"sai","IT");
		Student s2 =  new Student(1002,"teja","IT");
		Student s3 = new Student(1003,"maturi","IT");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println(al);
	   
	}

}
