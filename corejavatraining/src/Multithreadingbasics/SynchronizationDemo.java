package Multithreadingbasics;

class Bottle
{
	public void drink(int time)
	{
		for(int i=0;i<time;i++)
		{
			System.out.println(Thread.currentThread().getName()+"is drinking "+i);
		}
	}
}
class DrinkWater implements Runnable
{
	Bottle bottle=new Bottle();
	public void run()
	{
		bottle.drink(6);
	}
}
public class SynchronizationDemo {
public static void main(String[] args) {
	DrinkWater drinkwater=new DrinkWater();
	Thread k=new Thread(drinkwater);
	Thread m=new Thread(drinkwater);
	k.setName("sai ");
	m.setName("teja ");
	
	k.start();
	m.start();
}
}
