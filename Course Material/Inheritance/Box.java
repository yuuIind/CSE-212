public class Box {

	double width;
	double height;
	double depth;
	public Box() {
	}
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	public void getVolume() {
		System.out.println("Volume is : " + width * height * depth);
	}
}