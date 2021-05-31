package Multithreadingbasics;

class Account{
	synchronized public void balance(int times) {
		for(int i=1;i<=times;i++) {
			System.out.println(Thread.currentThread().getName()+"is updating");
		}
		
		for(int i=0;i<=times;i++) {
			System.out.println(Thread.currentThread().getName()+"can apply for loan");
		}
	}
}
class Transaction implements Runnable{
	Account account =new Account();
	public void run() {
		account.balance(4);
	}
	
}

public class SynchronizationDemo2 {
   public static void main(String[]args) {
	   Transaction check =new Transaction();
	   Thread thread =new Thread(check);
	   Thread thread1=new Thread(check);
	   thread.setName("withdraw");
	   thread1.setName("Deposit");
	   thread.start();
	   thread1.start();
   }
}
