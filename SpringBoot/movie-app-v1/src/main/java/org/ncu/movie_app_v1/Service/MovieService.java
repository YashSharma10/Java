package org.ncu.movie_app_v1.Service;

import java.util.List;

import org.ncu.movie_app_v1.Entity.Booking;
import org.ncu.movie_app_v1.Entity.Movie;
import org.ncu.movie_app_v1.Entity.Seat;
import org.ncu.movie_app_v1.Entity.Showtime;
import org.ncu.movie_app_v1.Entity.Ticket;
import org.ncu.movie_app_v1.Entity.User;

public interface MovieService {
	
    //Movie Service
	public String createMovie(Movie movie);
	public Movie getMovieById(int movieid);
	public List<Movie> getAllMovie();
	public String updateMovieById(int movieId, Movie updatedMovie);
	public String deleteMovieById(int movieId);
	public List<Movie> getAllMoviesOrdered();
	
	//Ticket Service
	public String createTicket(Ticket ticket);
	public Ticket getTicketById(int ticketId);
	public List<Ticket> getAllTicket();
	public String deleteTicketById(int ticketId);
	public List<Ticket> getAvailableTicketsForMovie(Movie movie);
	
	
	//User Service
	public String saveUser(User user);
	public User getUserById(int userId);
	public List<User> getAllUsers();
	 public String updateUserById(int userId, User updateUser);
	 public String deleteUserById(int userId);
	 
	 
	 
	//Booking Service
	 public String saveBooking(Booking booking);
	 public List<Booking> getAllBooking();
	 Booking getBookingById(int bookingId);
	 void cancelBooking(int bookingId);
	 
	 
	//Showtime Service
	 public String createShowtime(Showtime showtime);
	 public List<Showtime> getAllShowtimes();
	 public Showtime getShowtimeById(int showtimeId); 
	 public String updateShowtimeById(int showtimeId, Showtime showtime);
	 public String deleteShowtimeById(int showtimeId);
	 
	 
	//Seats Service
	 public String addSeat(Seat seat) ;
	 public List<Seat> getAllSeats();
	 public Seat getSeatById(long seatId);
	 public String SeatBooked(long seatId, Seat seat);

	
	
	
	
	
	
	
	
	
	
	
}
