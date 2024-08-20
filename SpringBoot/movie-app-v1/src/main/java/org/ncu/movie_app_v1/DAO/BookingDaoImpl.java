package org.ncu.movie_app_v1.DAO;

import java.util.List;

import org.ncu.movie_app_v1.Entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class BookingDaoImpl implements BookingDao{

	@Autowired
    private EntityManager entityManager;
	
	@Override
	@Transactional
	public String saveBooking(Booking booking) {
		entityManager.persist(booking);
		return null;
	}

	@Override
	@Transactional
    public Booking getBookingById(int bookingId) {
        return entityManager.find(Booking.class, bookingId);
    }

    @Override
    @Transactional
    public void cancelBooking(int bookingId) {
        Booking booking = entityManager.find(Booking.class, bookingId);
        if (booking != null) {
            entityManager.remove(booking);
        } else {
            // Handle case where booking with given ID does not exist
        }
    }
    @Override
	@Transactional
	public List<Booking> getAllBooking() {
		
		  TypedQuery<Booking> query = entityManager.createQuery("SELECT m FROM Booking m", Booking.class);
	        return query.getResultList();
	}

}
