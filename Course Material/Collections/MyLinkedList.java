import java.util.LinkedList;

public class MyLinkedList {
	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();

		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");

		for (String str : lList) {
			System.out.println(str);
		}
	}
}