package org.ncu.movie_app_v1.DAO;

import java.util.List;

import org.ncu.movie_app_v1.Entity.Seat;

public interface SeatDao {
	
	public String addSeat(Seat seat) ;
	public List<Seat> getAllSeats();
	public Seat getSeatById(long seatId);
	public String SeatBooked(long seatId, Seat seat);

}
