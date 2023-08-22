package java8_lambdas_streams.streams.lazyeager;

import java.util.List;
import java.util.stream.Stream;

import java8_lambdas_streams.domain.Movie;
import java8_lambdas_streams.util.MovieUtil;

// Lazy and eager operations
public class LazyAndEagerStreams {
	List<Movie> movies = MovieUtil.createMovies();

	private void testLazy() {
		movies.stream().filter(m -> {
			System.out.println("Inside lazy operation");
			return m.isClassic() ? true : false;
		}).count();
	}

	private void testEager() {
		Stream<Movie> moviesStream = 
			movies.stream()
				.filter(m -> {
			System.out.println("Fitering");
			return m.isClassic() ? true : false;
		}).map(s -> {
			System.out.println("Mapping");
			return s;
		});

		System.out.println("" + moviesStream.count());
	}

	public static void main(String[] args) {
		new LazyAndEagerStreams().testLazy();
		new LazyAndEagerStreams().testEager();
	}

}
