package org.ncu.movie_app_v1.DAO;

import java.util.List;

import org.ncu.movie_app_v1.Entity.Movie;

public interface MovieDao {
	public String saveMovie(Movie movie);
	public Movie getMovieById(int movieid);
	public List<Movie> getAllMovie();
	public String updateMovieById(int movieId, Movie updatedMovie);
	public String deleteMovieById(int movieId);

}
