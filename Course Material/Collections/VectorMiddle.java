import java.util.Vector;

public class VectorMiddle {
	public static void main(String args[]) {
		Vector<Integer> v = new Vector<Integer>(5);
		for (int i = 0; i < 10; i++) {
			v.insertElementAt(i, 0);
			System.out.println(v);
		}
		// System.out.println(v);
	}
}