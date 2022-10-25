
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
		if(accessCode.lenght < 4){
			System.out.println("The access code that you entered is incorrect");
			System.out.println("You will be charged with base ticket price");
			this.accessCode = "def0";
		}
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
