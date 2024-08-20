package BookMyRide;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class booking
 */
public class Booking extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String fullName = request.getParameter("fullName");
		String age = request.getParameter("age");
		String startPlace = request.getParameter("startPlace");
		String destination = request.getParameter("destination");
		String travelClass = request.getParameter("Class");
		String passengerCountStr = request.getParameter("passengerCount");
		if(fullName.isEmpty()||age.isEmpty()||startPlace.isEmpty()||destination.isEmpty()||travelClass.isEmpty()||passengerCountStr.isEmpty()) {
			RequestDispatcher req= request.getRequestDispatcher("Booking.jsp");
			req.include(request, response);
		}
		else {
			RequestDispatcher req= request.getRequestDispatcher("BookingConfirmation.jsp");
			req.forward(request, response);
		}
	}

}
