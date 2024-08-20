package org.ncu.movie_app_v1.DAO;

import java.util.List;

import org.ncu.movie_app_v1.Entity.Movie;
import org.ncu.movie_app_v1.Entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository

public class TicketDaoImpl implements TicketDao {
	@Autowired
	EntityManager entityManager;
	
	@Override
	@Transactional
	public String saveTicket(Ticket ticket) {
		entityManager.persist(ticket);
		return null;
	}

	@Override
	@Transactional
	public Ticket getTicketById(int ticketId) {
		
		 return entityManager.find(Ticket.class, ticketId);
	}

	@Override
	@Transactional
	public List<Ticket> getAllTicket() {
		
		  TypedQuery<Ticket> query = entityManager.createQuery("SELECT m FROM Movie m", Ticket.class);
	        return query.getResultList();
	}
	

	@Override
	@Transactional
	public String deleteTicketById(int ticketId) {
		
		Ticket ticket = entityManager.find(Ticket.class, ticketId);
        if (ticket != null) {
            entityManager.remove(ticket);
            return "Movie deleted successfully!";
        } else {
            return "Movie with ID " + ticketId + " not found.";
        }
	}
	
	
	
	public List<Ticket> getAvailableTicketsForMovie(Movie movie) {
        TypedQuery<Ticket> query = entityManager.createQuery(
            "SELECT t FROM Ticket t WHERE t.movie = :movie AND t.bookingStatus = true", 
            Ticket.class
        );
        query.setParameter("movie", movie);
        return query.getResultList();
    }
    
	
	}


