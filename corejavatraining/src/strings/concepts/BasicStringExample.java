package strings.concepts;

public class BasicStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1= new String("sai");
         String s2="sai";
         System.out.println(s1==s2);
         System.out.println(s1.equals(s2));
         String s3="a";
         String s4="d";
         System.out.println(s4.compareTo(s3));
         String k="    value    momentum";
         k=k.replaceAll("\\s","");
         System.out.println(k);
         
         String str="sai teja sai";
         String find="sai";
         String arr[]=str.split(" ");
         int c=0;
         for(int i=0;i<arr.length;i++) {
        	 if(find.equals(arr[i])) {
        		 c++;
        	 }
         }
         System.out.println(c);
	}

}
