
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Menu {
	
	private static ArrayList <Displayable> itemList = new ArrayList <Displayable>();
	private static ArrayList <Play> playList = new ArrayList <Play>();
	private static ArrayList <Ticket> ticketList = new ArrayList <Ticket>();
	
	public static void main(String[] args) {
		String eventName;
		String startTime;
		String date;
		String audienceName;
		String seatNumber;
		String accessCode;
		int duration;
		int sysCommand;
		
		Scanner nScanner=new Scanner(System.in);
		
		do {
		System.out.println("1: Create new Play");
		System.out.println("2: Buy a Ticket");
		System.out.println("3. Buy a Ticket with seat number");
		System.out.println("4. Display all Tickets");
		System.out.println("5. Display all Contens");
		System.out.println("0: Exit");
		System.out.println("Enter the command");
		sysCommand= nScanner.nextInt();
		nScanner.nextLine();
		System.out.println();
		
		switch(sysCommand) {
		case 1: //Create new Play
			Play p = createPlay(1);
			itemList.add(p);
			playList.add(p);
			break;
		
		case 2: // Buy a Ticket
			System.out.println("1: Create Ticket");
			System.out.println("2: Create PremiereTicket");
			System.out.println("3. Create PromotionTicket");
			sysCommand= nScanner.nextInt();
			nScanner.nextLine();
			System.out.println();
			
			if(sysCommand == 1) {
				Ticket ticket = new Ticket();
				createTicket(2, ticket);
				itemList.add(ticket);
				ticketList.add(ticket);
			}
			else if (sysCommand == 2) {
				PremiereTicket ticket = new PremiereTicket();
				createTicket(2, ticket);
				itemList.add(ticket);
				ticketList.add(ticket);
			}
			else if (sysCommand == 3) {
				PromotionTicket ticket = new PromotionTicket();
				createTicket(2, ticket);
				itemList.add(ticket);
				ticketList.add(ticket);
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
				Ticket ticket = new Ticket();
				createTicket(3, ticket);
				itemList.add(ticket);
				ticketList.add(ticket);
			}
			else if (sysCommand == 2) {
				PremiereTicket ticket = new PremiereTicket();
				createTicket(3, ticket);
				itemList.add(ticket);
				ticketList.add(ticket);
			}
			else if (sysCommand == 3) {
				PromotionTicket ticket = new PromotionTicket();
				createTicket(3, ticket);
				itemList.add(ticket);
				ticketList.add(ticket);
			}
			break;
			
		case 4:
			Iterator<Ticket> iter = ticketList.iterator();
			while (iter.hasNext()) {
				iter.next().displayTicket();
			}
			System.out.println("");
			break;
			
		case 5:
			for(Displayable d : itemList) {
				if (d instanceof Play) {
					System.out.println("Play:");
					d.otherDisplay();
				}
				else if (d instanceof Ticket) {
					System.out.println("Ticket:");
					d.otherDisplay();
				}
			}
			
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
	
	public static void createTicket(int command, Ticket ticket) {
		Scanner nScanner=new Scanner(System.in);
		
		if (command == 3) {
			System.out.println("Seat Number: ");
			ticket.setSeatNumber(nScanner.nextLine());
		}
		else {
			ticket.setSeatNumber("A" + Ticket.getSeatN());
		}
		
		System.out.println("Audience Name: ");
		ticket.setAudienceName(nScanner.nextLine());
		
		System.out.println("Event Name:");
		String eventName = nScanner.nextLine();
		
		int playCheck = playSearch(eventName, playList);
		if ( playCheck != -1 ) {
			ticket.setPlay(playList.get(playCheck));
			System.out.println("Play found!");
			System.out.println("Ticket is purchased with seat number " + ticket.getSeatNumber());
		}
		else {
			System.out.println("Unvalid event name");
		}
		
		if (ticket instanceof PromotionTicket) {
			System.out.println("Acces Code:");
			((PromotionTicket) ticket).setAccessCode(nScanner.nextLine());
		}
		
	}
	
	public static Play createPlay(int command) {
		Scanner nScanner=new Scanner(System.in);
		Play play = new Play();
		
		System.out.println("Event Name:");
		play.setEventName(nScanner.nextLine()) ;
		
		System.out.println("Start Time (hh:mm):");
		play.setStartTime(nScanner.nextLine());
		
		System.out.println("Date (Mon DD YYYY):");
		play.setDate(nScanner.nextLine());
		
		System.out.println("Duration (in hours):");
		play.setDuration(nScanner.nextInt());
		nScanner.nextLine();
		
		System.out.println("\nPlay created!\n");

		return play;
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


