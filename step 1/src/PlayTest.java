import java.util.Scanner;

public class PlayTest {

	public static void main(String[] args) {
		String eventName;
		String startTime;
		String date;
		int duration;
		int sysCommand;
		Play[] playList = new Play[10];
		int indexPlay = 0;
		Scanner nScanner=new Scanner(System.in);
		
		do {
		System.out.println("1: Create new Play");
		System.out.println("2: Display all Plays");
		System.out.println("0: Exit");
		System.out.println("Enter the command");
		sysCommand= nScanner.nextInt();
		nScanner.nextLine();
		System.out.println();
		
		if((sysCommand < 0) || (sysCommand > 2)) {
			System.out.println("ERROR: Invalid Command.");
			System.out.println("Please, enter a valid command.");
			System.out.println("");
		}
		if(sysCommand == 1){
			System.out.println("Event Name:");
			eventName = nScanner.nextLine();
			
			System.out.println("Start Time (hh:mm):");
			startTime = nScanner.nextLine();
			
			System.out.println("Date (Mon DD YYYY):");
			date = nScanner.nextLine();
			
			System.out.println("Duration (in hours):");
			duration = nScanner.nextInt();
			nScanner.nextLine();
			
			playList[indexPlay] = new Play(eventName, startTime, date, duration);
			indexPlay++;
			
			System.out.println("\nPlay created!\n");
		}
		else if(sysCommand== 2){
			for(int i = 0; i < playList.length; i++) {
				if(playList[i] == null) {
					break;
				}
				playList[i].display();	
			}
			System.out.println("");
		}
		else if(sysCommand== 0){
			System.out.println("Terminating the program...");
		}
		} while(sysCommand != 0);
	}
}
