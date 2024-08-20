package Methods;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie> {
	int year;
	double rating;
	String name;

	Movie(String na, int ye, double ra) {
		this.rating = ra;
		this.year = ye;
		this.name = na;
	}

	public int compareTo(Movie m) {
		return this.year - m.year;
	}

	public double getRating() {
		return rating;
	}

	public int getYear() {
		return year;
	}

	public String getName() {
		return name;
	}
}

public class Movie_Compare {

	public static void main(String[] args) {
		ArrayList<Movie> a = new ArrayList<>();
		a.add(new Movie("KGF Chapter 2 :", 2022, 5));
		a.add(new Movie("Jawaan :", 2023, 4.5));
		a.add(new Movie("Tanhaji :", 2020, 3));
		for (Movie list : a) {
			System.out.println(list.getName() + " " + list.getYear() + " " + list.getRating());
		}
		

	}

}
