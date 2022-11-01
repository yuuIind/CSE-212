import java.util.ArrayList;

public class MyObjectTest {
	public static void main(String[] args) {
		ArrayList<MyObject> myArrayList = new ArrayList<MyObject>();
		MyObject myObject1 = new MyObject();
		MyObject myObject2 = new MyObject();
		MyObject myObject3 = new MyObject();

		myArrayList.add(myObject1);
		System.out.println("Size of the array list is " + myArrayList.size());
		myArrayList.add(myObject2);
		System.out.println("Size of the array list is " + myArrayList.size());
		myArrayList.add(myObject3);
		System.out.println("Size of the array list is " + myArrayList.size());
		for (int i = 0; i < myArrayList.size(); i++) {
			myArrayList.get(i).setMyValue();

		}
		for (int i = 0; i < myArrayList.size(); i++) {
			System.out.println("myValue is " + myArrayList.get(i).getMyValue());

		}
	}
}