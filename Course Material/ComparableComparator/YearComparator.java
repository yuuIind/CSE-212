package lab;

import java.util.Comparator;

public class YearComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.year < o2.year) return -1;
		else if (o1.year > o2.year) return 1;
		else return 0;
	}

}
