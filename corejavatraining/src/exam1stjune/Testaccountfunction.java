package exam1stjune;

public class Testaccountfunction
{
	public static void main(String[] args)
	{
		SavingsAccount savings = new SavingsAccount(5000, 0.60);
		savings.withdraw(1000);
		savings.deposit(500);
		savings.addInterest();
		System.out.println("Your savings acount balance is");
		System.out.println(savings.getBalance());
		
		
	}
}
