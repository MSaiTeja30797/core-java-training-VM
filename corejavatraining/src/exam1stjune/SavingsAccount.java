package exam1stjune;

public class SavingsAccount
{
	private double balance;
	private double rateofinterest;

	public SavingsAccount()
	{
		balance = 0;
		rateofinterest = 0;
	}

	public SavingsAccount(double initialBalance, double initialInterest)
	{
		balance = initialBalance;
		rateofinterest = initialInterest;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	public void addInterest()
	{
		balance = balance + balance * rateofinterest;
	}

	public double getBalance()
	{
		return balance;
	}

}
