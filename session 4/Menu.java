import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		String eventName;
		String startTime;
		String date;
		String audienceName;
		String seatNumber;
		int duration;
		int sysCommand;
		Play[] playList = new Play[10];
		Ticket[] ticketList = new Ticket[10];
		int indexPlay = 0;
		int indexTicket = 0;
		Scanner nScanner=new Scanner(System.in);
		
		do {
		System.out.println("1: Create new Play");
		System.out.println("2: Buy a Ticket");
		System.out.println("3. Buy a Ticket with seat number");
		System.out.println("4. Display all Tickets");
		System.out.println("0: Exit");
		System.out.println("Enter the command");
		sysCommand= nScanner.nextInt();
		nScanner.nextLine();
		System.out.println();
		
		if((sysCommand < 0) || (sysCommand > 4)) {
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
			System.out.println("Audience Name: ");
			audienceName = nScanner.nextLine();
			
			System.out.println("Event Name:");
			eventName = nScanner.nextLine();
			
			int playCheck = playSearch(eventName, playList);
			if ( playCheck != -1 ) {
				ticketList[indexTicket] = new Ticket(audienceName, playList[playCheck]);
				indexTicket++;
				
				System.out.println("Play found!");
				System.out.println("Ticket is purchased!");
			}
			else {
				System.out.println("Unvalid event name");
			}
			
		}
		else if(sysCommand== 3){
			System.out.println("Seat Number: ");
			seatNumber = nScanner.nextLine();
			
			System.out.println("Audience Name: ");
			audienceName = nScanner.nextLine();
			
			System.out.println("Event Name:");
			eventName = nScanner.nextLine();
			
			int playCheck = playSearch(eventName, playList);
			if ( playCheck != -1 ) {
				ticketList[indexTicket] = new Ticket(audienceName, seatNumber, playList[playCheck]);
				indexTicket++;
				
				System.out.println("Play found!");
				System.out.println("Ticket is purchased with seat number " + seatNumber);
			}
			else {
				System.out.println("Unvalid event name");
			}
		}
		else if(sysCommand== 4){
			for(int i = 0; i < ticketList.length; i++) {
				if(ticketList[i] == null) {
					break;
				}
				ticketList[i].displayTicket();	
			}
			System.out.println("");
		}
		else if(sysCommand== 0){
			System.out.println("Terminating the program...");
		}
		} while(sysCommand != 0);
	}
	
	public static int playSearch (String eventName, Play[] playList) {
		int index = 0;
		while (playList[index] != null) {
			if(eventName.equals(playList[index].getEventName() ) ){
				return index;
			}
			else {
				index += 1;
			}
		}
		return -1;
	}
}

