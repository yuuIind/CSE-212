
public class PromotionTicket extends Ticket {
	
	private String accessCode;
	
	public PromotionTicket(String audienceName, String seatNumber, Play play, String accessCode){
		super(audienceName, seatNumber, play);
		setAccessCode(accessCode);
	}
	
	public PromotionTicket(String audienceName, Play play, String accessCode) {
		super(audienceName, "A" + getSeatN(), play);
		setAccessCode(accessCode);
	}
	
	public void setAccessCode(String accessCode) {
		if(accessCode.length() < 4){
			System.out.println("The access code that you entered is incorrect");
			System.out.println("You will be charged with base ticket price");
			this.accessCode = "def0";
		}
		this.accessCode = accessCode;
	}
	
	public String getAccessCode() {
		return accessCode;
	}

	public void displayTicket() {
		System.out.println(getAudienceName() 
				+ " is going to " 
				+ getPlay().eventInfo() 
				+ " with seat number " 
				+ getSeatNumber() 
				+ " with a Promotion Ticket with the price of " 
				+ calculatedPrice() 
				+ " TL");
	}
	
	public double calculatedPrice() {
		int discount = Character.getNumericValue(getAccessCode().charAt(3));
		double discountPercent;
		if (discount < 0) {
			discountPercent = 0;
		}
		else {
			discountPercent = 1 - ((double)(10*discount)/100);
		}
		return getBasePrice()*discountPercent;
	}
}