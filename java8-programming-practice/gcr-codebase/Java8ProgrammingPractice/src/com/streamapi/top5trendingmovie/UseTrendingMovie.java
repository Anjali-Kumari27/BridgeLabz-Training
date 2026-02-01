package com.streamapi.top5trendingmovie;

import java.util.*;
import java.util.stream.Collectors;

/*
 * Top 5 Trending Movies
   ○ Scenario: From a huge movie list, find the top 5 based on rating and release
year.
   ○ Task: Use filter(), sorted(), limit().
 */
public class UseTrendingMovie {

	public static void main(String[] args) {

		List<Movie> movies = Arrays.asList(new Movie("Inception", 8.8, 2010), new Movie("Interstellar", 8.7, 2014),
				new Movie("The Dark Knight", 9.0, 2008), new Movie("Oppenheimer", 8.9, 2023),
				new Movie("Dune: Part Two", 8.8, 2024), new Movie("Parasite", 8.6, 2019),
				new Movie("The Matrix", 8.7, 1999), new Movie("Spirited Away", 8.6, 2001));

		// Stream processing 
		List<Movie> top5TrendingMovies = movies.stream()

				// Filter movies (Ensuring high quality input) 
				.filter(movie -> movie.getRating() >= 8.5)

				// Sort by rating (desc), then by release year (desc) 
				.sorted(Comparator.comparing(Movie::getRating).reversed().thenComparing(Movie::getReleaseYear)
						.reversed())

				// Limit to top 5 
				.limit(5)

				// Collect result 
				.collect(Collectors.toList());

		// Display result 
		System.out.println("\n=====================================================");
		System.out.println("                 Top 5 Trending Movies                 ");
		System.out.println("=====================================================\n");
		top5TrendingMovies.forEach(System.out::println);
	}
}
