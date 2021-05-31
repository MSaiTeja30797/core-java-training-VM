package newfeaturesdemo;

interface Validate{
	void ValidateLogin();
		
	
}

class Car{
	void myLogin() {
		System.out.println("you can login using username and password");
	}
	
}

class Bus{
	void login() {
		System.out.println("hi");
	}
}
public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Validate v=()->System.out.println("Login validation");
   v.ValidateLogin();
   
   Car c= new Car();
   Validate v1=c::myLogin;
   v1.ValidateLogin();
   
   Bus b=new Bus();
   Validate v2=b::login;
   v2.ValidateLogin();
   
	}

}
