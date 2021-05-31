package corejavatrainingbasics;

public class Caluclator 
{
	int num1,num2,num3;
	int num4;
	double d;
	long sum;
	 void add(int num1,int num2)
	{
		sum=num1+num2;
		System.out.println(sum);
	}
	 double add(int num1,double d1)
		{
			d=num1+d1;
			return d;
		}
	 void add(int num1,int num2,int num3)
	 {
		 sum=num1+num2+num3;
		 System.out.println(sum);
	 }
	 long add(int num1,int num2,int num3,int num4)
		{
			sum=num1+num2+num3+num4;
			return sum;
		}

}