package collections.test;
import java.util.Comparator;
public class NameSorting implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
           
} 