package newfeaturesdemo;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Employee> employee = new ArrayList<Employee>();

		employee.add(new Employee(101, "Sam", "hr", 58000, 25));
		employee.add(new Employee(102, "Sai", "dev", 90000, 28));
		employee.add(new Employee(103, "venkat", "tester", 58000, 30));
		employee.add(new Employee(104, "anil", "tester", 20000, 31));
		employee.add(new Employee(105, "akash", "dev", 80000, 35));
		employee.add(new Employee(103, "venkat", "tester", 58000, 30));

		employee.forEach(System.out::println);
		System.out.println("======================");
		long employeeCount=employee.stream().count();
		System.out.println("Employee Count = "+employeeCount);

		System.out.println("======================");
		System.out.println("Only HR and Dev");
		employee.stream().filter(s->s.getDept().equalsIgnoreCase("dev")).forEach(System.out::println);
		System.out.println("======================");

		System.out.println("Starts with a");
		employee.stream().filter(s1->s1.getName().startsWith("a")).forEach(s->System.out.println(s));
		System.out.println("======================");

		System.out.println("Salary > 50000");
		employee.stream().filter(s1->s1.getSalary()>50000).forEach(s1->System.out.println(s1));
		System.out.println("======================");

		long count1=employee.stream().filter(s1->s1.getSalary()>50000).count();
		System.out.println("Count of Employee's > 50000 salaries = "+count1);

		System.out.println("======================");
		System.out.println("Length of Names of Employee's");
		employee.stream().map(s->s.getId()+" "+s.getName()+" "+s.getName().length()).forEach(s->System.out.println(s));

		System.out.println("======================");
		employee.stream().map(s->s.getId()+" Name = "+s.getName()+" Dept = "+s.getDept()+" Origianl salary = "+s.getSalary()+" New salary = "
		+s.getSalary()*0.20+" Age = "+s.getAge()).forEach(s->System.out.println(s));
		
		
		employee.stream().sorted((s1,s2)->{
			if(s1.getSalary()==s2.getSalary())
				return 0;
			else if(s1.getSalary()>s2.getSalary())
				return 1;
			else
				return -1;
		}).forEach(System.out::println);
		
		List<Employee> empNameSort =employee.stream().sorted((o1,o2)->
		{
			return o1.getName().compareTo(o2.getName());
		}).collect(Collectors.toList());
		System.out.println("sorting by name");
		empNameSort.forEach(System.out::println);
		
		Employee minSalary =employee.stream().min(Comparator.comparing(Employee::getSalary)).get();
		  System.out.println("min salary"+ minSalary);
		  
		  long sum=employee.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
		  System.out.println("sum of total salary of all employees"+ sum);
		  
		 /* List<Employee>uniquemp=employee.stream().distinict().Collectors.toList());
		  System.out.println("===unique element list");
		  System.out.println("unique elements"+ uniqueemp);*/
		  
		  System.out.println("The distinct elements are :");
		  employee.stream().distinct().forEach(System.out::println);
	       
		  long sk=3;
		  employee.stream().skip(sk).forEach(System.out::println);
	}
}


