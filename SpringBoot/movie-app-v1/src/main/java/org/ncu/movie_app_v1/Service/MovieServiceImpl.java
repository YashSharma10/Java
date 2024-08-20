package org.ncu.movie_app_v1.Service;

import java.util.Comparator;
import java.util.List;

import org.ncu.movie_app_v1.DAO.BookingDao;
import org.ncu.movie_app_v1.DAO.MovieDao;
import org.ncu.movie_app_v1.DAO.SeatDao;
import org.ncu.movie_app_v1.DAO.ShowtimeDao;
import org.ncu.movie_app_v1.DAO.TicketDao;
import org.ncu.movie_app_v1.DAO.UserDao;
import org.ncu.movie_app_v1.Entity.Booking;
import org.ncu.movie_app_v1.Entity.Movie;
import org.ncu.movie_app_v1.Entity.Seat;
import org.ncu.movie_app_v1.Entity.Showtime;
import org.ncu.movie_app_v1.Entity.Ticket;
import org.ncu.movie_app_v1.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    
	 @Autowired
	 MovieDao movieDao;
	 @Autowired
	 TicketDao ticketDao;
	 @Autowired
	 UserDao userDao;
	 @Autowired
	 BookingDao bookingDao;
	 @Autowired
	 ShowtimeDao showtimeDao;
     @Autowired
	 SeatDao seatDao;

	 
	//Movie Service
	@Override
	public String createMovie(Movie movie) {
		 this.movieDao.saveMovie(movie);
	        return "Movie save successfully!!!";
	}
	public Movie getMovieById(int movieid) {
		
		 return movieDao.getMovieById(movieid);
	}
	public List<Movie> getAllMovie(){
		
		 return movieDao.getAllMovie();
	}
	public String updateMovieById(int movieId, Movie updatedMovie) {
		this.movieDao.updateMovieById( movieId, updatedMovie);
		 return "Movie updated successfully!!!";
	}
	public String deleteMovieById(int movieId) {
		this.movieDao.deleteMovieById(movieId);
		 return "Movie Deleted successfully!!!";
	}
	
	 @Override
	    public List<Movie> getAllMoviesOrdered() {
	        List<Movie> movies = movieDao.getAllMovie();
	        movies.sort(Comparator.comparing(Movie::getMovieName));
	        return movies;
	    }
	 
	//Ticket Service
	 
	 @Override
		public String createTicket(Ticket ticket) {
			this.ticketDao.saveTicket(ticket);
	        return "Ticket save successfully!!!";
			
		}

		@Override
		public Ticket getTicketById(int ticketId) {
			
			
			return ticketDao.getTicketById(ticketId);
		}

		@Override
		public List<Ticket> getAllTicket() {
			
			return ticketDao.getAllTicket();
		}



		@Override
		public String deleteTicketById(int ticketId) {
			
			this.ticketDao.deleteTicketById(ticketId);
			 return "Movie Deleted successfully!!!";
		}
		public List<Ticket> getAvailableTicketsForMovie(Movie movie) {
	        return ticketDao.getAvailableTicketsForMovie(movie);


	}
		
		
		//User Service
		@Override
	    public String saveUser(User user) {
	        return userDao.saveUser(user);
	    }

	    @Override
	    public User getUserById(int userId) {
	        return userDao.getUserById(userId);
	    }

	    @Override
	    public List<User> getAllUsers() {
	        return userDao.getAllUsers();
	    }

	    @Override
	    public String updateUserById(int userId, User updateUser) {
	        return userDao.updateUserById(userId, updateUser);
	    }
	    @Override
		public String deleteUserById(int userId) {
			
			this.userDao.deleteUserById(userId);
			 return "user Deleted successfully!!!";
		}

	    
	    
	    
		//Booking Service
	    @Override
	    public String saveBooking(Booking booking) {
	        return bookingDao.saveBooking(booking);
	    }
	    @Override
		public List<Booking> getAllBooking() {
			
			return bookingDao.getAllBooking();
		}
	    @Override
	    public Booking getBookingById(int bookingId) {
	        return bookingDao.getBookingById(bookingId);
	    }

	    @Override
	    public void cancelBooking(int bookingId) {
	        bookingDao.cancelBooking(bookingId);
	    }
	    
	    
	    
	    
		//Showtime Service
	    @Override
		public String createShowtime(Showtime showtime) {
			showtimeDao.saveShowtime(showtime);
			return "Showtime saved successfully!!!";
		}

		@Override
		public List<Showtime> getAllShowtimes() {
			return showtimeDao.getAllShowtimes();
		}

		@Override
		public Showtime getShowtimeById(int showtimeId) {
			Showtime showtime = showtimeDao.getShowtimeById(showtimeId);
			return showtime;
		}
		@Override
		public String updateShowtimeById(int showtimeID, Showtime showtime) {
			Showtime existingShowtime = showtimeDao.getShowtimeById(showtimeID);
			if (existingShowtime == null) {
				return "Movie with ID " + showtimeID + " not found!";
			}
			existingShowtime.setShowtimeId(showtime.getShowtimeId());
			existingShowtime.setName(showtime.getName());
			existingShowtime.setStartTime(showtime.getStartTime());
			existingShowtime.setEndTime(showtime.getEndTime());
			existingShowtime.setTheater(showtime.getTheater());
			showtimeDao.saveShowtime(existingShowtime);
			return "Showtime updated successfully!";
		}

		@Override
		public String deleteShowtimeById(int showtimeId) {
			Showtime existingShowtime = showtimeDao.getShowtimeById(showtimeId);
			if (existingShowtime == null) {
				return "Showtime with ID " + showtimeId + " not found!";
			}
			showtimeDao.deleteShowtimeById(showtimeId);
			return "Movie deleted successfully!";

		}


	    
	    
	    
	    
	    
		//Seats Service
	    @Override
		public String addSeat(Seat seat) {
			seatDao.addSeat(seat);
			return "Seat saved successfully!!!";
		}

		@Override
		public List<Seat> getAllSeats() {
			return seatDao.getAllSeats();
		}

		@Override
		public Seat getSeatById(long seatId) {
			return seatDao.getSeatById(seatId);
		}

		@Override
		public String SeatBooked(long seatId, Seat seat) {
			return seatDao.SeatBooked(seatId,seat);
		}


}
