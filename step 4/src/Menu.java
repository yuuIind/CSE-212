
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Menu {

	public static void main(String[] args) {
		String eventName;
		String startTime;
		String date;
		String audienceName;
		String seatNumber;
		String accessCode;
		int duration;
		int sysCommand;
		ArrayList <Play> playList = new ArrayList <Play>();
		ArrayList <Ticket> ticketList = new ArrayList <Ticket>();
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
		
		switch(sysCommand) {
		case 1: //sysCommand = 1
			System.out.println("Event Name:");
			eventName = nScanner.nextLine();
			
			System.out.println("Start Time (hh:mm):");
			startTime = nScanner.nextLine();
			
			System.out.println("Date (Mon DD YYYY):");
			date = nScanner.nextLine();
			
			System.out.println("Duration (in hours):");
			duration = nScanner.nextInt();
			nScanner.nextLine();
			
			playList.add(new Play(eventName, startTime, date, duration));
			System.out.println("\nPlay created!\n");
			break;
		
		case 2:
			System.out.println("1: Create Ticket");
			System.out.println("2: Create PremiereTicket");
			System.out.println("3. Create PromotionTicket");
			sysCommand= nScanner.nextInt();
			nScanner.nextLine();
			System.out.println();
			
			if(sysCommand == 1) {
				System.out.println("Audience Name: ");
				audienceName = nScanner.nextLine();
				
				System.out.println("Event Name:");
				eventName = nScanner.nextLine();
				int playCheck = playSearch(eventName, playList);
				if (playCheck != -1) {
					ticketList.add(new Ticket(audienceName, playList.get(playCheck)));				
					System.out.println("Play found!");
					System.out.println("Ticket is purchased!");
				}
				else {
					System.out.println("Unvalid event name");
				}
			}
			else if (sysCommand == 2) {
				System.out.println("Audience Name: ");
				audienceName = nScanner.nextLine();
				
				System.out.println("Event Name:");
				eventName = nScanner.nextLine();
				
				int playCheck = playSearch(eventName, playList);
				if ( playCheck != -1 ) {
					ticketList.add(new PremiereTicket(audienceName, playList.get(playCheck)));

					System.out.println("Play found!");
					System.out.println("Ticket is purchased!");
				}
				else {
					System.out.println("Unvalid event name");
				}
			}
			else if (sysCommand == 3) {
				System.out.println("Audience Name: ");
				audienceName = nScanner.nextLine();
				
				System.out.println("Event Name:");
				eventName = nScanner.nextLine();
				
				System.out.println("Acces Code:");
				accessCode = nScanner.nextLine();
				
				int playCheck = playSearch(eventName, playList);
				if ( playCheck != -1 ) {
					ticketList.add(new PromotionTicket(audienceName, playList.get(playCheck), accessCode));
					System.out.println("Play found!");
					System.out.println("Ticket is purchased!");
				}
				else {
					System.out.println("Unvalid event name");
				}
			}
			break;
			
		case 3: 
			System.out.println("1: Create Ticket");
			System.out.println("2: Create PremiereTicket");
			System.out.println("3. Create PromotionTicket");
			sysCommand= nScanner.nextInt();
			nScanner.nextLine();
			System.out.println();
			
			if(sysCommand == 1) {
				System.out.println("Seat Number: ");
				seatNumber = nScanner.nextLine();
				
				System.out.println("Audience Name: ");
				audienceName = nScanner.nextLine();
				
				System.out.println("Event Name:");
				eventName = nScanner.nextLine();
				
				int playCheck = playSearch(eventName, playList);
				if ( playCheck != -1 ) {
					ticketList.add(new Ticket(audienceName, seatNumber, playList.get(playCheck)));
					System.out.println("Play found!");
					System.out.println("Ticket is purchased with seat number " + seatNumber);
				}
				else {
					System.out.println("Unvalid event name");
				}
			}
			else if (sysCommand == 2) {
				System.out.println("Seat Number: ");
				seatNumber = nScanner.nextLine();
				
				System.out.println("Audience Name: ");
				audienceName = nScanner.nextLine();
				
				System.out.println("Event Name:");
				eventName = nScanner.nextLine();
				
				int playCheck = playSearch(eventName, playList);
				if ( playCheck != -1 ) {
					ticketList.add(new PremiereTicket(audienceName, seatNumber, playList.get(playCheck)));
					
					System.out.println("Play found!");
					System.out.println("Ticket is purchased with seat number " + seatNumber);
				}
				else {
					System.out.println("Unvalid event name");
				}
			}
			else if (sysCommand == 3) {
				System.out.println("Seat Number: ");
				seatNumber = nScanner.nextLine();
				
				System.out.println("Audience Name: ");
				audienceName = nScanner.nextLine();
				
				System.out.println("Event Name:");
				eventName = nScanner.nextLine();
				
				System.out.println("Acces Code:");
				accessCode = nScanner.nextLine();
				
				int playCheck = playSearch(eventName, playList);
				if ( playCheck != -1 ) {
					ticketList.add(new PromotionTicket(audienceName, seatNumber, playList.get(playCheck), accessCode));

					System.out.println("Play found!");
					System.out.println("Ticket is purchased with seat number " + seatNumber);
				}
				else {
					System.out.println("Unvalid event name");
				}
			}
			break;
			
		case 4:
			Iterator<Ticket> iter = ticketList.iterator();
			while (iter.hasNext()) {
				iter.next().displayTicket();
			}
			System.out.println("");
			break;
			
		case 0:
			System.out.println("Terminating the program...");
			break;
			
		default:
			System.out.println("ERROR: Invalid Command.");
			System.out.println("Please, enter a valid command.");
			System.out.println("");
			break;
		}
		} while(sysCommand != 0);
	}
	
	public static int playSearch (String eventName, ArrayList<Play> playList) {
		Iterator<Play> iter = playList.iterator();
		int index = 0;
		while (iter.hasNext()) {
			if(eventName.equals(iter.next().getEventName() ) ){
				return index;
			}
			else {
				index++;
			}
		}
		return -1;
	}
}



