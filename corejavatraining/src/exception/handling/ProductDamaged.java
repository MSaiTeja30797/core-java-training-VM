package exception.handling;

public class ProductDamaged  extends Exception{
   String message;
   public ProductDamaged(String message) {
	   this.message=message;
   }
@Override
public String toString() {
	return "ProductDamaged [message=" + message + "]";
}
   
}
