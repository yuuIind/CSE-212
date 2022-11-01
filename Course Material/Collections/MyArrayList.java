import java.util.ArrayList;

public class MyArrayList {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add(1, "INSERTED");
		for (String str : arrayList)
			System.out.println(str);
	}
}