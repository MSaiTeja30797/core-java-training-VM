package newfeaturesdemo;

interface StringLength{
	int getLength(String str);
}
public class LamdaExpressionStringcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		StringLength s=(String str)->str.length();
        int length =s.getLength("saiteja");
        System.out.println("length="+length);
	}
	

}
