import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MyMap {
	public static void main(String[] args) {
		Map<String, int[]> map = new TreeMap<String, int[]>();

		int[] array1 = new int[3];
		array1[0] = 0;
		array1[1] = 1;
		array1[2] = 2;
		map.put("array1", array1);

		int[] array2 = new int[4];
		array2[0] = 3;
		array2[1] = 4;
		array2[2] = 5;
		array2[3] = 6;
		map.put("array2", array2);

		int[] array;

		Iterator<String> iter = map.keySet().iterator();

		while (iter.hasNext()) {
			String arrayName = iter.next();
			array = map.get(arrayName);
			System.out.print(arrayName + ":");
			for (int i = 0; i < array.length; i++) {
				System.out.print(" " + array[i]);
			}
			System.out.println();
		}
	}
}