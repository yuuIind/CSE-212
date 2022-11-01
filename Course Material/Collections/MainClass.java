import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		int[] intArray = new int[] { 5, 4, 3, 2, 1 };
		Arrays.sort(intArray);
		for (int i : intArray) {
			System.out.println(i);
		}
	}
}