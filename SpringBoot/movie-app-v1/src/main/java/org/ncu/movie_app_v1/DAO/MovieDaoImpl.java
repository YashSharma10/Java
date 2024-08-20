package org.ncu.movie_app_v1.DAO;

import java.util.List;

import org.ncu.movie_app_v1.Entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class MovieDaoImpl implements MovieDao {
	@Autowired
	EntityManager entityManager;
	
	@Override
	@Transactional
	public String saveMovie(Movie movie) {
		
		entityManager.persist(movie);
		return null;}
	@Override
	@Transactional
	public Movie getMovieById(int movieId) {
		 return entityManager.find(Movie.class, movieId);}
	@Override
	@Transactional
	public List<Movie> getAllMovie(){
		   TypedQuery<Movie> query = entityManager.createQuery("SELECT m FROM Movie m", Movie.class);
	        return query.getResultList();
		}
	@Override
	@Transactional
	public String updateMovieById(int movieId, Movie updatedMovie) {
		  Movie existingMovie = entityManager.find(Movie.class, movieId);
	        if (existingMovie != null) {
	            existingMovie.setMovieName(updatedMovie.getMovieName());
	            existingMovie.setMovieRating(updatedMovie.getMovieRating());
	            existingMovie.setGenre(updatedMovie.getGenre());
	            existingMovie.setMovieDetail(updatedMovie.getMovieDetail());
	            existingMovie.setReleaseYear(updatedMovie.getReleaseYear());
	            entityManager.merge(existingMovie);
	            return "Movie updated successfully!";
	        } else {
	            return "Movie with ID " + movieId + " not found.";
	        }
		}
	@Override
	@Transactional
	public String deleteMovieById(int movieId) {
		Movie movie = entityManager.find(Movie.class, movieId);
        if (movie != null) {
            entityManager.remove(movie);
            return "Movie deleted successfully!";
        } else {
            return "Movie with ID " + movieId + " not found.";
        }
	}

}
