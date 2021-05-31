package exception.handling;

public class LowBalanceException extends Exception {
    String message;
    LowBalanceException(String message){
    	this.message=message;
    }
	public String toString() {
		return message;

	}

}
