package oopsconcept;

import java.util.*;

public class Cafeteria {

 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
System.out.println("Welcome to the Hotel");
  String s1="Idly";
  String s2="Dose";
  String s3="upma";
  String s4="poori";
  String s5="Noodles";
  String s6="Manchuria ";
  String s7="Water Bottle";

System.out.println("Select the items");
System.out.println("1."+" "+s1+"   "+"20/-");
System.out.println("2."+" "+s2+"   "+"30/-");
System.out.println("3."+" "+s3+"   "+"20/-");
System.out.println("4."+" "+s4+"   "+"35/-");
System.out.println("5."+" "+s5+"   "+"50/-");
System.out.println("6."+" "+s6+"   "+"50/-");
System.out.println("7."+" "+s7+"   "+"15/-");

  int num,sum=0;
  num=sc.nextInt();
while(num!=-1) {
    
   int g=1;
  switch (num) {
    case 1:
System.out.println("You ordered"+" "+ s1);
System.out.println("Enter quantity");
      g=sc.nextInt();
     ;
      sum=sum+(20*g);
      g=1;
break;
    case 2:
System.out.println("You ordered"+" "+s2);
System.out.println("Enter quantity");
g =sc.nextInt();
      sum=sum+(30*g);

      g=1;
break;
    case 3:
System.out.println("You ordered"+" "+s3);
System.out.println("Enter quantity");
g =sc.nextInt();
      sum=sum+(20*g);

      g=1;
break;

    case 4:
System.out.println("You ordered"+" "+s4);
System.out.println("Enter quantity");
g =sc.nextInt();
      sum=sum+(35*g);

      g=1;
break;

    case 5:
System.out.println("You ordered"+" "+s5);
System.out.println("Enter quantity");
g =sc.nextInt();
sum=sum+(50*g);

      g=1;
break;

case 6:
System.out.println("You ordered"+" "+s6);
System.out.println("Enter quantity");
      g = sc.nextInt();
      sum = sum + (50 * g);

      g = 1;
break;

    case 7:
System.out.println("You ordered"+" "+s7);
System.out.println("Enter quantity");
      g = sc.nextInt();
      sum = sum + (15 * g);

      g = 1;
break;

  }
  }
System.out.println(sum);
sc.close();
 }
}
