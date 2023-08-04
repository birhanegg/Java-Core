package oop;

//A Java program to demonstrate Comparator interface
import java.io.*;
import java.util.*;

import prob1.Employee;

//A class 'Movie' that implements Comparable
class Movie implements Comparable<Movie> {
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	public int compareTo(Movie m)
	{
		return this.year - m.year;
	}

	// Constructor
	public Movie(String nm, double rt, int yr)
	{
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() { return rating; }
	public String getName() { return name; }
	public int getYear() { return year; }
}



//Driver class
public class Main {
	public static void main(String[] args)
	{
		List<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));

		// Sort by rating : (1) Create an object of
		// ratingCompare
		//				 (2) Call Collections.sort
		//				 (3) Print Sorted list
		System.out.println("Sorted by rating");
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(list, ratingCompare);  //custom sort
		for (Movie movie : list)
			System.out.println(movie.getRating() + " "
							+ movie.getName() + " "
							+ movie.getYear());

		// Call overloaded sort method with RatingCompare
		// (Same three steps as above)
		System.out.println("\nSorted by name");
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list, nameCompare);
		for (Movie movie : list)
			System.out.println(movie.getName() + " "
							+ movie.getRating() + " "
							+ movie.getYear());

		// Uses Comparable to sort by year
		System.out.println("\nSorted by year");
		Collections.sort(list);
		for (Movie movie : list)
			System.out.println(movie.getYear() + " "
							+ movie.getRating() + " "
							+ movie.getName() + " ");
	}
}






















if(this==obj)
	return true;
Employee emp= (Employee) obj;
if(this.name!= emp.getName() || this.salary!= emp.getSalary())
return false;
return true;