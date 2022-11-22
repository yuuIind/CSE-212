package lab;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		
		
		
		
		ArrayList<Movie> list = new ArrayList<Movie>();
		
		list.add(new Movie());
		list.add(new Movie());
		list.add(new Movie());
		
		Collections.sort(list, new RatingCompare());

		for (Movie movie : list) {
			movie.display();
		}
		
//		ArrayList<String> list = new ArrayList<String>();
//		
//		list.add("Software");
//		
//		list.add("Data");
//		
//		list.add("OperatingSystem");
//		
//		Collections.sort(list, Collections.reverseOrder());
//		
//		
//		
//		System.out.println(list);
		
	}

}
