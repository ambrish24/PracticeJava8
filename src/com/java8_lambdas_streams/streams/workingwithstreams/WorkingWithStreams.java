package java8_lambdas_streams.streams.workingwithstreams;
import java.util.List;

import java8_lambdas_streams.domain.Movie;
import java8_lambdas_streams.util.MovieUtil;

//Working with Streams
public class WorkingWithStreams {

	List<Movie> movies = MovieUtil.createMovies();

	private void findMoviesByDirector(String director) {
		movies.stream()
		.filter(m-> m.getDirector().equals("Steven Spielberg")? true:false)
		.map(Movie::getName)
		.distinct()
		.limit(3)
		.forEach(System.out::println);
	}

	public static void main(String[] args) {
		new WorkingWithStreams().findMoviesByDirector("Steven Spielberg");
	}

}
