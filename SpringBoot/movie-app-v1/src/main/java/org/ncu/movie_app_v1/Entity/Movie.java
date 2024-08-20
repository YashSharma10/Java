package org.ncu.movie_app_v1.Entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie_table")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int movieId;
	@Column(length = 20 , nullable = false)
	private String movieName;
	@Column( nullable = false)
	private double  movieRating;
	@Column(length = 10 , nullable = false)
	private String genre;
	@Column(length = 50 , nullable = true)
	private String movieDetail;
	@Column(length = 50 , nullable = true)
	private LocalDate releaseYear;
	
	@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL )
	@JsonManagedReference
    private List<Ticket> tickets;
	
	
	
	 public Movie(int movieId, String movieName, double movieRating, String genre, String movieDetail,
			LocalDate releaseYear, List<Ticket> tickets) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieRating = movieRating;
		this.genre = genre;
		this.movieDetail = movieDetail;
		this.releaseYear = releaseYear;
		this.tickets = tickets;
	}
	 
	 
    public Movie() {
		super();
	}
	
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieRating=" + movieRating + ", genre="
				+ genre + ", movieDetail=" + movieDetail + ", releaseYear=" + releaseYear + ", tickets=" + tickets
				+ "]";
	}
	
	




	public int getMovieId() {
		return movieId;
	}


	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public double getMovieRating() {
		return movieRating;
	}


	public void setMovieRating(double movieRating) {
		this.movieRating = movieRating;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getMovieDetail() {
		return movieDetail;
	}


	public void setMovieDetail(String movieDetail) {
		this.movieDetail = movieDetail;
	}


	public LocalDate getReleaseYear() {
		return releaseYear;
	}


	public void setReleaseYear(LocalDate releaseYear) {
		this.releaseYear = releaseYear;
	}


	public List<Ticket> getTickets() {
		return tickets;
	}


	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}


	public int compareTo(Movie o) {
		  return Double.compare(o.movieRating, this.movieRating);
	    }
	 
	 
	 public void addTicket(Ticket ticket) {
		    tickets.add(ticket);
		    ticket.setMovie(this);
		}

		public void removeTicket(Ticket ticket) {
		    tickets.remove(ticket);
		    ticket.setMovie(null);
		}
	
	
	
	
	
	
	

}
