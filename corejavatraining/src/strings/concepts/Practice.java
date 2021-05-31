package strings.concepts;

public class Practice {

	public static void main(String[] args) {
		
		//copying char arr to a string
	char arr[]= {'s','a','i',' ','t','e','j','a'};
    
	String str=String.copyValueOf(arr);
    System.out.println(str);
    String str1=String.copyValueOf(arr,3,5);
    System.out.println(str1);
    
    
    
    //comparing StringBuffer object to String object in java
    String a = "Wellcome to the class";
    StringBuffer b = new StringBuffer("Wellcome to the class");
    
    if(a.contentEquals(b)){
        System.out.println("equal");
    } 
    else {
        System.out.println("not equal");
    }
    StringBuffer c = new StringBuffer("Wellcome");
    if(a.contentEquals(c)){
        System.out.println("equal");
    } 
    else {
        System.out.println("not equal");
    }
	
    
    //convert string object into byte array
    String x = "teja";
    byte[] y = str.getBytes();
    System.out.println("String length: "+x.length());
    System.out.println("Byte array length: "+y.length);
    
    //index of
    System.out.println("first occurance: "+a.indexOf("to"));
    
    //start with
    System.out.println("string starts with "+a.startsWith("Wellcome"));
	
	}
}
