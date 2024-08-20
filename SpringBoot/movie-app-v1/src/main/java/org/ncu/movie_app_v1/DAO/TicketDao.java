package org.ncu.movie_app_v1.DAO;

import java.util.List;

import org.ncu.movie_app_v1.Entity.Movie;
import org.ncu.movie_app_v1.Entity.Ticket;

public interface TicketDao {
	public String saveTicket(Ticket ticket);
	public Ticket getTicketById(int ticketId);
	public List<Ticket> getAllTicket();
	

	
	public String deleteTicketById(int ticketId);
	
	List<Ticket> getAvailableTicketsForMovie(Movie movie);

}
