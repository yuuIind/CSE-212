import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		StudentContainingCourse[] studentList = new StudentContainingCourse[10];
		int indexStd = 0;
		
		Scanner nScanner=new Scanner(System.in);
		int sysCommand;
		do{
			System.out.println("1: Enter a student");
			System.out.println("2: Display all");
			System.out.println("0: Exit");
			System.out.println("Enter the command");
			sysCommand=nScanner.nextInt();
			nScanner.nextLine();
			if((sysCommand < 0) || (sysCommand > 2)) {
				System.out.println("ERROR: Invalid Command.");
				System.out.println("Please, enter a valid command.");
				System.out.println("");
			}
			if(sysCommand == 1){
				studentList[indexStd] = new StudentContainingCourse();
				indexStd++;
			}
			else if(sysCommand== 2){
				for(int i = 0; i < studentList.length; i++) {
					if(studentList[i] == null) {
						break;
					}
					System.out.println("Student " + (i+1) +":");
					studentList[i].displayInformation();
				}
			}
			else if(sysCommand== 0){
				System.out.println("Terminating the program...");
			}
		}while(sysCommand != 0);
	}
}
