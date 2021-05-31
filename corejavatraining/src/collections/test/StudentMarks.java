package collections.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class StudentMarks {
 public static void main(String[] args) {
  ArrayList <Integer> studentMarks = new ArrayList<Integer>();
  Scanner input = new Scanner(System.in);
  System.out.println("Enter number of students");
  int numStudents=input.nextInt();
  System.out.println("Enter Marks");
  int mark;
  for(int i=1; i<=numStudents;i++)
  {
   mark = input.nextInt();
   studentMarks.add(mark);
  }
  Collections.sort(studentMarks);
  System.out.println("Highest Number: "+Collections.max(studentMarks));
  double average=0;
  int sum=0;
  for(int i=0;i<studentMarks.size();i++)
  {
   sum=sum+i;
  }
  System.out.println("total"+sum);
  System.out.println(studentMarks);
 }
}