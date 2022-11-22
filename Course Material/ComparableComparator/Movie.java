package lab;

import java.util.Scanner;

public class Movie implements Comparable<Movie> {
	
	String name;
	double rating;
	int year;
	
	public Movie() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = s.nextLine();
		System.out.print("Enter rating: ");
		rating = s.nextDouble();
		System.out.print("Enter year: ");
		year = s.nextInt();
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Rating: " + rating);
		System.out.println("Year: " + year);

	}

	@Override
	public int compareTo(Movie o) { // this-> küçük -
									// aynı 0
									// büyük +
//		
//		for(int i = 0; i<name.length(); i++) {
//			char a = name.charAt(i);
//			char b = o.name.charAt(i);
//			if(a<b) return -1;
//			else if(a>b) return 1;
//		}
//		return 0;
		
		
		return name.compareTo(o.name);
		
		
//		if(rating < o.rating) return -1;
//		else if (rating > o.rating) return 1;
//		else return 0;
	}

}
