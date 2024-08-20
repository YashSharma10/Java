package BookMyRide;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Login() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if (login.isEmpty() || password.isEmpty()) {
            RequestDispatcher req = request.getRequestDispatcher("Login.jsp");
            req.include(request, response);
        } else {
            // Set a cookie with the username
            Cookie usernameCookie = new Cookie("username", login);
            response.addCookie(usernameCookie);

            RequestDispatcher req = request.getRequestDispatcher("Home.jsp");
            req.forward(request, response);
        }
    }
}
