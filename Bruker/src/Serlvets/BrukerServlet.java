package Serlvets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BrukerServlet")
public class BrukerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Henter fra database > g�r inn i dao
		
		//lagrer fra databasen inn i verdi
		
		//sender informasjonen vidre
		
		
		request.getRequestDispatcher("WEB-INF/LoggInn.jsp").forward(request, response);
	
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	
	}

}
