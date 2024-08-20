package org.ncu.movie_app_v1.DAO;

import java.util.List;

import org.ncu.movie_app_v1.Entity.Showtime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
public class ShowtimeDaoImpl implements ShowtimeDao {

	@Autowired
	EntityManager entityManager;

	@Override
	@Transactional
	public void saveShowtime(Showtime showtime) {
		entityManager.persist(showtime);

	}

	@Override
	@Transactional
	public List<Showtime> getAllShowtimes() {
		return entityManager.createQuery("SELECT m FROM Showtime m", Showtime.class).getResultList();
	}

	@Override
	@Transactional
	public Showtime getShowtimeById(int showtimeId) {
		return entityManager.find(Showtime.class, showtimeId);
	}

	@Override
	@Transactional
	public void updateShowtimeById(int showtimeId, Showtime showtime) {
		entityManager.merge(showtime);

	}

	@Override
	@Transactional
	public void deleteShowtimeById(int showtimeId) {
		Showtime showtime = entityManager.find(Showtime.class, showtimeId);
		if (showtime != null) {
			entityManager.remove(showtime);
		}

	}

}
