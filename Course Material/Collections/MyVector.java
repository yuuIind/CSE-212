import java.util.Vector;

public class MyVector {
	public static void main(String args[]) {
		Vector<Integer> v = new Vector<Integer>(5);
		for (int i = 0; i < 10; i++) {
			v.add(i);
		}
		System.out.println(v);
	}
}