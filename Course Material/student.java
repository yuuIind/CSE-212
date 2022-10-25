public class student {
	String firstName;
	String lastName;
	long id;
	String major;
	String faculty;
	
	public student() {
		
		System.out.println("Enter Name:");
		firstName = MyClass.s.nextLine();
		System.out.println("Enter Last Name:");
		lastName = MyClass.s.nextLine();
		System.out.println("Enter Student ID:");
		id = MyClass.s.nextLong();
		MyClass.s.nextLine();
		
	}
	
	public student(String name, String surname) {
		
		firstName = name;
		lastName = surname;
		
	}
	
public student(long studentID) {
		
		id = studentID;
		
	}

public void printFirstName() {
	
	System.out.println(firstName);
	
}

public void printLastName() {
	
	System.out.println(lastName);
	
}

public void printID() {
	
	System.out.println(id);
	
}

}
