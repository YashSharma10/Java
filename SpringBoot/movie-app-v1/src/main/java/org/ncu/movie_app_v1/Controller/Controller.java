package org.ncu.movie_app_v1.Controller;

import java.util.List;

import org.ncu.movie_app_v1.Entity.Booking;
import org.ncu.movie_app_v1.Entity.Movie;
import org.ncu.movie_app_v1.Entity.Seat;
import org.ncu.movie_app_v1.Entity.Showtime;
import org.ncu.movie_app_v1.Entity.Ticket;
import org.ncu.movie_app_v1.Entity.User;
import org.ncu.movie_app_v1.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieapp-v2")
public class Controller {
	
	@Autowired
    private MovieService movieService;

	
    // Movie Endpoints
    @PostMapping("/movies")
    public String saveMovie(@RequestBody Movie movie) {
        movieService.createMovie(movie);
        return "Movie saved successfully!";
    }

    
    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovie();
    }

    @GetMapping("/movies/{movieId}")
    public Movie getMovieById(@PathVariable int movieId) {
        return movieService.getMovieById(movieId);
    }
    
    @PutMapping("/movies/{movieId}")
    public String updateMovie(@PathVariable int movieId, @RequestBody Movie updatedMovie) {
        movieService.updateMovieById(movieId, updatedMovie);
        return "Movie updated successfully!";
    }

    @DeleteMapping("/movies/{movieId}")
    public String deleteMovieByID(@PathVariable int movieId) {
        movieService.deleteMovieById(movieId);
        return "Movie deleted successfully!";
    }
    
    

    // Ticket Endpoints
    @GetMapping("/tickets")
    public List<Ticket> getAllTickets() {
        return movieService.getAllTicket();
    }

    @GetMapping("/tickets/{ticketId}")
    public Ticket getTicketById(@PathVariable int ticketId) {
        return movieService.getTicketById(ticketId);
    }

    @PostMapping("/tickets")
    public String saveTicket(@RequestBody Ticket ticket) {
    	movieService.createTicket(ticket);
        return "Ticket saved successfully!";
    }

   @DeleteMapping("/tickets/{ticketId}")
    public String deleteTicket(@PathVariable int ticketId) {
    	movieService.deleteTicketById(ticketId);
        return "Ticket deleted successfully!";
    }
   
   //User Endpoints
   @PostMapping("/users")
   public String saveUser(@RequestBody User user) {
	   movieService.saveUser(user);
	   return "User saved Successfully";
   }

   @GetMapping("/users/{userId}")
   public User getUserById(@PathVariable int userId) {
       return movieService.getUserById(userId);
   }

   @GetMapping("/users")
   public List<User> getAllUsers() {
       return movieService.getAllUsers();
   }

   @PostMapping("/users/{userId}")
   public String updateUserById(@PathVariable int userId, @RequestBody User updateUser) {
       return movieService.updateUserById(userId, updateUser);
   }
   @DeleteMapping("/users/{userId}")
   public String deleteUserById(@PathVariable int userId) {
   	movieService.deleteUserById(userId);
       return "User deleted successfully!";
   }
      
   
   
   //Booking Endpoints
   @PostMapping("/bookings")
   public String saveBooking(@RequestBody Booking booking) {
	   movieService.saveBooking(booking);
	   return "Booking saved Successfully";
   }
   @GetMapping("/bookings")
   public List<Booking> getAllBookings() {
       return movieService.getAllBooking();
   }
   @GetMapping("/bookings/{bookingId}")
   public Booking getBookingById(@PathVariable int bookingId) {
       return movieService.getBookingById(bookingId);
   }
   @DeleteMapping("/users/{userId}/bookings/{bookingId}")
   public String cancelBooking(@PathVariable int userId, @PathVariable int bookingId) {
	   movieService.cancelBooking(bookingId);
       return "Booking canceled successfully.";
   }

   
   
   
   //Showtime EndPoints
   @PostMapping("/showtimes")
   public String createShowtime(@RequestBody Showtime showtime) {
       return movieService.createShowtime(showtime);
   }
   
   
   @GetMapping("/showtimes")
   public List<Showtime> getAllShowtimes() {
       return movieService.getAllShowtimes();
   }
   
   @GetMapping("/showtimes/{showtimeId}")
   public Showtime getShowtimeById(@PathVariable int showtimeId) {
       return movieService.getShowtimeById(showtimeId);
   }
   
   @PutMapping("/showtimes/{showtimeId}")
   public String updateShowtimeById(@PathVariable int showtimeId, @RequestBody Showtime showtime) {
       return movieService.updateShowtimeById(showtimeId, showtime);
   }
   
   @DeleteMapping("/showtimes/{showtimeId}")
   public String deleteShowtimeById(@PathVariable int showtimeId) {
       return movieService.deleteShowtimeById(showtimeId);
   }
   
   // Endpoints for Seat
   
   @PostMapping("/seats")
   public String addSeat(@RequestBody Seat seat) {
       return movieService.addSeat(seat);
   }
   
   @GetMapping("/seats")
   public List<Seat> getAllSeats() {
       return movieService.getAllSeats();
   }
   
   @GetMapping("/seats/{seatId}")
   public Seat getSeatById(@PathVariable long seatId) {
       return movieService.getSeatById(seatId);
   }
   
//   @PutMapping("/seats/{seatId}")
//   public String seatBooked(@PathVariable long seatId, @RequestBody Seat seat) {
//       return movieService.seatBooked(seatId, seat);
//   }
    
    
    
    
    

}