package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class MovieNode {
	
	String movieTitle;
	String director;
	int yearOfRelease;
	double rating;
	MovieNode next , prev;
	
	public MovieNode(String movieTitle , String director, int yearOfRelease, double rating) {
		
		this.movieTitle = movieTitle;
		this.director = director;
		this.yearOfRelease = yearOfRelease;
		this.rating = rating;
		this.next = this.prev = null;
	}

}
