
public class PremiereTicket extends Ticket {
	
	private double priceModifier = 1 + (100/100);
	
	public PremiereTicket(){
		super();
	}
	
	public PremiereTicket(String audienceName, String seatNumber, Play play){
		super(audienceName, seatNumber, play);
	}
	
	public PremiereTicket(String audienceName, Play play) {
		super(audienceName, "A" + getSeatN(), play);	
	}
	
	
	public void setPriceModifier(int n) {
		priceModifier = n;
	}
	
	public double getPriceModifier() {
		return priceModifier;
	}
	
	public void displayTicket() {
		System.out.println(getAudienceName() 
				+ " is going to " 
				+ getPlay().eventInfo() 
				+ " with seat number " 
				+ getSeatNumber() 
				+ " with a Premiere Ticket with the price of " 
				+ calculatedPrice() 
				+ " TL");
	}
	
	public void otherDisplay() {
		String s = "\tName: " + getAudienceName() 
		+ "\n\tPlay: " + getPlay().getEventName()
		+ "\n\tPrice: " + calculatedPrice();
		
		System.out.println(s);
	}

	public double calculatedPrice() {
		return getBasePrice()*getPriceModifier();
	}
}
