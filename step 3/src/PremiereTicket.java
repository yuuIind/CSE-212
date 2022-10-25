
public class PremiereTicket extends Ticket {
	
	private double priceModifier = 1 + (100/100);
	
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
	
	public double calculatedPrice() {
		return getBasePrice()*getPriceModifier();
	}
}
