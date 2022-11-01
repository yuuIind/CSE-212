import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	public static void main(String[] argv) {

		String sArray[] = new String[] { "Array 1", "Array 2", "Array 3" };

		List<String> lList = Arrays.asList(sArray);

		System.out.println(lList);
	}
}