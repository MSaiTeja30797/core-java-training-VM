package exam1stjune;

import java.util.*;
public class StringProgram
{
public static void main(String[] args)
{
String s;
System.out.println("Enter a sentence");
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
String words[]=s.split(" ");
int flag=0;
char count[]=s.toCharArray();
for(int i=0;i<count.length;i++)
{
 if(count[i]!=' ')
 {
     flag++;
 }
}
System.out.println("Words->"+words.length);
System.out.println("Character->"+flag);
}
}
