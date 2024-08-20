package org.ncu.movie_app_v1.DAO;

import java.util.List;

import org.ncu.movie_app_v1.Entity.Showtime;

public interface ShowtimeDao {
	void saveShowtime(Showtime showtime);

	List<Showtime> getAllShowtimes();

	Showtime getShowtimeById(int showtimeId);

	void updateShowtimeById(int showtimeId , Showtime showtime);

	void deleteShowtimeById(int showtimeId);
}
