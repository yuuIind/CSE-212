
public class Ticket {
	private String audienceName;
	private String seatNumber;
	private Play play;
	private static int seatN = 1;
	private static final int basePrice = 200;
	
	public Ticket(String audienceName, String seatNumber, Play play) {
		setAudienceName(audienceName);
		setSeatNumber(seatNumber);
		setPlay(play);
	}
	
	public Ticket(String audienceName, Play play) {
		setAudienceName(audienceName);
		setPlay(play);
		setSeatNumber("A" + seatN ); 	
	}
	
	public void setAudienceName(String audienceName) {
		this.audienceName = audienceName;
	}
	
	public String getAudienceName() {
		return audienceName;
	}
	
	public void setSeatNumber(String seatNumber) {
		this.seatNumber= seatNumber;
		seatN +=1;
	}
	
	public String getSeatNumber() {
		return seatNumber;
	}
	
	public void setPlay(Play play) {
		this.play = play;
	}

	public Play getPlay() {
		return play;
	}
	
	public static void setSeatN(int n) {
		seatN = n;
	}
	
	public static int getSeatN() {
		return seatN;
	}
	
	public static int getBasePrice() {
		return basePrice;
	}
	
	public void displayTicket() {
		System.out.println(getAudienceName() 
				+ " is going to " 
				+ play.eventInfo() 
				+ " with seat number " 
				+ getSeatNumber() 
				+ " with a Base Ticket with the price of " 
				+ calculatedPrice() 
				+ " TL");
	}
	
	public double calculatedPrice() {
		return basePrice;
	}
	
}