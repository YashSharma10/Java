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
@Table(name = "booking_table")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int bookingId;
	
	@Column(length = 20 , nullable = false)
	int showtimeId;
	@Column(length = 20 , nullable = false)
	int noOfSeats;
	
	@ManyToOne
	@JoinColumn( name="userId" , nullable=false)
	@JsonBackReference
	private User user;

	public Booking(int bookingId, int showtimeId, int noOfSeats, User user) {
		super();
		this.bookingId = bookingId;
		this.showtimeId = showtimeId;
		this.noOfSeats = noOfSeats;
		this.user = user;
	}

	public Booking() {
		super();
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", showtimeId=" + showtimeId + ", noOfSeats=" + noOfSeats + ", user="
				+ user + "]";
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getShowtimeId() {
		return showtimeId;
	}

	public void setShowtimeId(int showtimeId) {
		this.showtimeId = showtimeId;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void assignUser(User user) {
	    this.user = user;
	    user.getBookings().add(this);
	}

	public void unassignUser() {
	    if (user != null) {
	        user.getBookings().remove(this);
	        user = null;
	    }
	}
	
	
	
	
	

}
