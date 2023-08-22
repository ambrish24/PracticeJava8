package java8_lambdas_streams.streams.commonops;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import java8_lambdas_streams.domain.Actor;
import java8_lambdas_streams.domain.Movie;
import java8_lambdas_streams.util.MovieUtil;

// FlatMap functionality
public class FlatMap {
	List<Movie> movies = MovieUtil.createMoviesAndActors();
	String[] fruits = new String[]{"apples","oranges"};
	String[] veggies = new String[]{"beans","peas"};
	
	private void flatMapMovies(){
		Stream<Actor> actorsStream = 
				movies.stream().flatMap(m -> m.getActors().stream());
		
		actorsStream.forEach(System.out::println);
	}
	
	private void flatMapVeggies() {
		Stream<List<String>> fruitsAndVeggies = 
				Stream.of(Arrays.asList(fruits), Arrays.asList(veggies));
		fruitsAndVeggies.flatMap(s -> s.stream())
		.forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		new FlatMap().flatMapVeggies();
		new FlatMap().flatMapMovies();
		
	}

}
