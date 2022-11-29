
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Menu {
	
	private static ArrayList <Displayable> itemList = new ArrayList <Displayable>();
	private static ArrayList <Ticket> ticketList = new ArrayList <Ticket>();
	
	public static void main(String[] args) {
		int sysCommand;
		
		Scanner nScanner=new Scanner(System.in);
		
		/*
		 * READY PLAY AND TICKET LIST FOR TESTING 
		 * 6 DIFFERENT PLAY AND 6 DIFFERENT BASE TICKET WITHOUT SEAT
		 * 
		itemList.add(new Play("machbeth","12:30","01/01/2001",3));
		itemList.add(new Play("othello","12:30","25/12/2001",3));
		itemList.add(new Play("Hamlet","12:30","13/12/2001",3));
		itemList.add(new Play("Romeo And Juliet","12:30","14/01/2001",3));
		itemList.add(new Play("5th Play","12:30","01/01/2011",3));
		itemList.add(new Play("6th Play","12:30","01/01/2000",3));
		itemList.add(new Ticket("Aud1",((Play)itemList.get(0))));
		ticketList.add(new Ticket("Aud1",((Play)itemList.get(0))));
		itemList.add(new Ticket("Aud2",((Play)itemList.get(1))));
		ticketList.add(new Ticket("Aud2",((Play)itemList.get(1))));
		itemList.add(new Ticket("Aud3",((Play)itemList.get(2))));
		ticketList.add(new Ticket("Aud3",((Play)itemList.get(2))));
		itemList.add(new Ticket("Aud4",((Play)itemList.get(3))));
		ticketList.add(new Ticket("Aud4",((Play)itemList.get(3))));
		itemList.add(new Ticket("Aud5",((Play)itemList.get(4))));
		ticketList.add(new Ticket("Aud5",((Play)itemList.get(4))));
		itemList.add(new Ticket("Aud6",((Play)itemList.get(5))));
		ticketList.add(new Ticket("Aud6",((Play)itemList.get(5))));*/
		
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
			Collections.sort(ticketList);
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
			break;
			
		case 0:
			System.out.println("Terminating the program...");
			nScanner.close();
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
		
		int playCheck = playSearch(eventName, itemList);
		if ( playCheck != -1 ) {
			ticket.setPlay(((Play)itemList.get(playCheck)));
		}
		else {
			System.out.println("\nUnvalid event name. Please, try again\n");
			ticket = null;
			return;
		}
		
		if (ticket instanceof PromotionTicket) {
			boolean control = true;
			while(control)try {
				System.out.println("Acces Code:");
				String accesCode = nScanner.nextLine();
				Integer.parseInt(accesCode.substring(3, 4));
				((PromotionTicket) ticket).setAccessCode(accesCode);
				control = false;
			}
			catch(NumberFormatException e) {
				System.out.println("\nInvalid acces Code. Please try again.\n");
				control = true;
			}
		}
		
		System.out.println("Play found!");
		System.out.println("Ticket is purchased with seat number " + ticket.getSeatNumber() + "\n");
		
	}
	
	public static Play createPlay(int command) {
		Scanner nScanner=new Scanner(System.in);
		Play play = new Play();
		
		System.out.println("Event Name:");
		play.setEventName(nScanner.nextLine()) ;
		
		System.out.println("Start Time (hh:mm):");
		play.setStartTime(nScanner.nextLine());
		
		System.out.println("Date (DD/MM/YYYY):");
		play.setDate(nScanner.nextLine());
		
		System.out.println("Duration (in hours):");
		play.setDuration(nScanner.nextInt());
		nScanner.nextLine();
		
		System.out.println("\nPlay created!\n");
		
		return play;
	}
	
	public static int playSearch (String eventName, ArrayList<Displayable> itemList) {
		int index = 0;
		for (Displayable d : itemList ) {
			if (d instanceof Play) {
				if(eventName.equals(( (Play)d).getEventName() )){
					return index;
				}
				else {
					index++;
				}
			}
			else {
				index++;
			}
		}
		return -1;
	}
}


