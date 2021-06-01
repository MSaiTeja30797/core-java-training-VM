package exam1stjune;

import java.util.*;
class EmployeeDetails
{
    private String firstName;
    private String lastName;
    EmployeeDetails(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }
    void validation () throws Exception
    {
        if(firstName==null && lastName==null)
        {
            throw new NullPointerException("Entry Missing");
        }
        
        else if(firstName.length()<3 && lastName.length()<3)
        {
            throw new Exception("name should be minimum 3 character");
        }
    }
}


public class Employee
{
    public static void main(String arg[])
    {
    	System.out.println("Enter first name and last name");
        Scanner sc=new Scanner(System.in);
        EmployeeDetails emp=new EmployeeDetails(sc.next(),sc.next());
        try
        {
        emp.validation();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}