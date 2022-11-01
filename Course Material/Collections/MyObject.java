import java.util.Scanner;

public class MyObject {
	int myValue;

	public MyObject() {
		myValue = -4;
	}

	public void setMyValue() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter number");
		myValue = myScanner.nextInt();
	}

	public int getMyValue() {
		return myValue;
	}
}