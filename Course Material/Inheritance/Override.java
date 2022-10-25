public class Override { 
	public static void main(String args[]) { 
	B subOb = new B(1, 2, 3); 
	subOb.show(); // this calls show() in B 
	System.out.println();
	System.out.println();
	System.out.println("Result of anotherShow:");
	subOb.anotherShow();   //this calls show() in A
	} 
}