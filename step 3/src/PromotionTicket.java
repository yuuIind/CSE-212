
public class PromotionTicket extends Ticket {
	
	private String accessCode;
	
	public PromotionTicket(String audienceName, String seatNumber, Play play, String accessCode){
		super(audienceName, seatNumber, play);
		this.accessCode = accessCode;
	}
	
	public PromotionTicket(String audienceName, Play play, String accessCode) {
		super(audienceName, "A" + getSeatN(), play);
		this.accessCode = accessCode;
	}
	
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}
	
	public String getAccessCode() {
		return accessCode;
	}
	
	public double calculatedPrice() {
		int discount = Character.getNumericValue(getAccessCode().charAt(3));
		double discountPercent;
		if (discount < 0) {
			discountPercent = 0;
		}
		else {
			discountPercent = 1 - ((10*discount)/100);
		}
		return getBasePrice()*discountPercent;
	}
}
