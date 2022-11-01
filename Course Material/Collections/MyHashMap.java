import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MyHashMap {

	public static void main(String[] args) {
		HashMap<String, String> hMap = new HashMap<String, String>();
		hMap.put("1", "One");
		hMap.put("2", "Two");
		hMap.put("3", "Three");

		Collection<String> c = hMap.values();
		Iterator<String> itr = c.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}