import java.util.Scanner;

public class StudentContainingCourseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentContainingCourse s1= null;
		StudentContainingCourse s2= null;
		StudentContainingCourse s3= null;
		Scanner nScanner=new Scanner(System.in);
		int sysCommand;
		do{
			System.out.println("1: Enter student1");
			System.out.println("2: Enter student2");
			System.out.println("3: Enter student3");
			System.out.println("4: Display all");
			System.out.println("0: Exit");
			System.out.println("Enter the command");
			sysCommand=nScanner.nextInt();
			nScanner.nextLine();
			if((sysCommand < 0) || (sysCommand > 4)) {
				System.out.println("ERROR: Invalid Command.");
				System.out.println("Please, enter a valid command.");
				System.out.println("");
			}
			if(sysCommand == 1){
				s1 = new StudentContainingCourse();
			}
			else if(sysCommand== 2){
				s2 = new StudentContainingCourse();
			}
			else if(sysCommand== 3){
				s3 = new StudentContainingCourse();
			}
			else if(sysCommand== 4){
				if(s1 != null) {
					s1.displayInformation();
				}
				if(s2 != null) {
					s2.displayInformation();
				}
				if(s3 != null) {
					s3.displayInformation();
				}
			}
			else if(sysCommand== 0){
				System.out.println("Terminating the program...");
			}
		}while(sysCommand != 0);
		
	}
}
