package Multithreadingbasics;
class Parent{
	void phone() {
		System.out.println("XIAMO");
	}
}
public class Annonymous {
    public static void main(String[] args) {
    	Parent parent =new Parent();
    	parent.phone();
    	Parent parent2 =new Parent() {
    		void phone() {
    			System.out.println("MI");
    		}
    	};
    	parent2.phone();
    }
}
