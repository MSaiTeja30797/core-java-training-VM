package assignment30may;

import java.util.Scanner;
import java.util.*;

public class StudentMarks {
Scanner sc=new  Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter no of student marks");
		Scanner sc =new  Scanner(System.in);
		ArrayList<Integer>marks=new ArrayList<Integer>();
		int n;
		n=sc.nextInt();
		int a;
		for(int i=0;i<n;i++)
		{
			a=sc.nextInt();
			marks.add(a);
		}
		
		
		Comparable max = Collections.max(marks);
		System.out.println("Highest Marks = "+max);
		int sum=0;
		float averageg=0;
		for(int i=0;i<marks.size();i++)
		{
			sum=sum+ marks.get(i);
			averageg=sum/marks.size();
			
		}
		System.out.println("average:"+averageg);
		for(int i=0;i<marks.size();i++)
		{
		System.out.print((i+1)+"-"+marks.get(i)+" ");
		}
		
		
		System.out.println("\n3rd sudent marks:"+marks.get(3));
	
		Collections.sort(marks);
		for(int i=0;i<marks.size();i++)
		{
		System.out.print((i+1)+"-"+marks.get(i)+" ");
		}
	}
	
}

