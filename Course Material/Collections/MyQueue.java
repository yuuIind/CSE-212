import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();

		queue.add("A");
		queue.add("B");

		queue.add("C");
		queue.add("D");

		System.out.println("remove: " + queue.remove());

		System.out.println("element: " + queue.element());
	}
}