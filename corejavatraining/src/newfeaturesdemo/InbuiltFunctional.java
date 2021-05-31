package newfeaturesdemo;
import java.util.function.Function;
import java.util.function.Predicate;

public class InbuiltFunctional {
    public static void main(String[] args) {
    	Predicate <Integer> p=(var1)-> var1>2;
    	System.out.println(p.test(1));
    	Predicate <String> p2=(v1)-> v1.startsWith("a");
    	System.out.println(p2.test("ashok"));
    	Function<String,String> f1=(var)->var.concat("hello welcome");
    	System.out.println(f1.apply("sai "));
    }
}
