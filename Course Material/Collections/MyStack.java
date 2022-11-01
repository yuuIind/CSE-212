import java.util.Stack;

public class MyStack {
	public static void main(String args[]) {
		Stack<String> s = new Stack<String>();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
}