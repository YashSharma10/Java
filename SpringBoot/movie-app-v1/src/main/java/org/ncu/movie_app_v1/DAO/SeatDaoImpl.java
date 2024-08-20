package org.ncu.movie_app_v1.DAO;

import java.util.List;

import org.ncu.movie_app_v1.Entity.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class SeatDaoImpl implements SeatDao {

	@Autowired
    private EntityManager entityManager;

	@Override
	@Transactional
	public String addSeat(Seat seat) {
		entityManager.persist(seat);
		return null;

	}

	@Override
	@Transactional
	public List<Seat> getAllSeats() {
		return entityManager.createQuery("SELECT t FROM Seat t", Seat.class).getResultList();
	}

	@Override
	@Transactional
	public Seat getSeatById(long seatId) {
		return entityManager.find(Seat.class, seatId);
	}

	@Override
	@Transactional
	public String SeatBooked(long seatId, Seat seat) {
		Seat existingSeat = entityManager.find(Seat.class, seatId);
        if (existingSeat != null) {
        	existingSeat.setSeatRow(seat.getSeatRow());
        	existingSeat.setSeatNumber(seat.getSeatNumber());
        
            entityManager.merge(existingSeat);
            return "User updated successfully!";

        }else {
            return "User with ID " + seatId + " not found.";
        }
	}
	

}
