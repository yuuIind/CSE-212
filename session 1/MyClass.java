import java.util.Scanner;

public class MyClass {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		//comment
		/**
		 * 
		 */
//		String a = "Asaddqw";
//		String b = "World";
//		int c = 10;
//		System.out.println("Hello World!");
//		System.out.println(a + c + b);
//		System.out.printf(a + c + b + "\n");
//		System.out.printf("Hello" + "World" + "\n");
//		if(a == "a") {
//			System.out.println(true);
//		}
//		else {
//			System.out.println(false);
//		}
//		Scanner s = new Scanner(System.in);
//		String a = s.nextLine();
//		String b = s.next();
//		int c = s.nextInt();
//		s.nextLine();
//		String d = s.nextLine();
//		
//		System.out.println(s);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		student a = new student();
		student b = new student();
		
		a.printFirstName();
		a.printLastName();
		a.printID();
		
		b.printFirstName();
		b.printLastName();
		b.printID();
	}

}
