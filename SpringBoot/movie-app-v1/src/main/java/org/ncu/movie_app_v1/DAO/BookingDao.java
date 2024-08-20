package org.ncu.movie_app_v1.DAO;

import java.util.List;

import org.ncu.movie_app_v1.Entity.Booking;

public interface BookingDao {
	public String saveBooking(Booking booking);

	Booking getBookingById(int bookingId);

	void cancelBooking(int bookingId);

	public List<Booking> getAllBooking();

}
