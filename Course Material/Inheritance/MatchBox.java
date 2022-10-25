public class MatchBox extends Box {

	int numberOfMatches;
	public MatchBox() {
	}
	MatchBox(double w, double h, double d, int m) {
		super(w, h, d); 
		/*super(w, h, d) is a superclass constructor. It initializes the subclass instance variables which are taken from the superclass.*/
		/* MatchBox is subclass and Box is the superclass.  */

		numberOfMatches = m;
	}
}