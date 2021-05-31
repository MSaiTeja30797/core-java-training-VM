package exception.handling;

public class DaysExceeded extends Exception {
	String message;
	   public DaysExceeded(String message) {
		   this.message=message;
	   }
	@Override
	public String toString() {
		return "DaysExceeded [message=" + message + "]";
	}
	   
}
