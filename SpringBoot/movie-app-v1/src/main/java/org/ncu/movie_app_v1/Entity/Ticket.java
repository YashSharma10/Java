package org.ncu.movie_app_v1.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ticket_table")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ticketId;
	@Column(length = 20 , nullable = false)
	private String seatNumber;
	@Column( length = 20 ,nullable = false)
	private double  ticketPrice;
	@Column(length = 10 , nullable = false)
	private Boolean bookingStatus;
	
	@ManyToOne
	@JoinColumn(name="movieId",nullable=false)
	@JsonBackReference
	private Movie movie;

	public Ticket(int ticketId, String seatNumber, double ticketPrice, Boolean bookingStatus, Movie movie) {
		super();
		this.ticketId = ticketId;
		this.seatNumber = seatNumber;
		this.ticketPrice = ticketPrice;
		this.bookingStatus = bookingStatus;
		this.movie = movie;
	}

	public Ticket() {
		super();
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", seatNumber=" + seatNumber + ", ticketPrice=" + ticketPrice
				+ ", bookingStatus=" + bookingStatus + ", movie=" + movie + "]";
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Boolean getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(Boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public void assignMovie(Movie movie) {
	    this.movie = movie;
	    movie.getTickets().add(this);
	}

	public void unassignMovie() {
	    if (movie != null) {
	        movie.getTickets().remove(this);
	        movie = null;
	    }
	}
	
	
	
	
	
	
	
	

}
