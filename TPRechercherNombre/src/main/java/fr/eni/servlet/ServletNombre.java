package fr.eni.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletNombre
 */
@WebServlet("/nombre")
public class ServletNombre extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int nbre = 0;
		if(request.getParameter("nbre")!=null) {
		//Lire le paramètre 'nbre'(nombre)
		nbre = Integer.parseInt(request.getParameter("nbre"));
		}
		RequestDispatcher reqD = null; // pour la portée de la variable à l'extérieure des conditions if
		
		if(nbre > 10) {
			//si nbre >10 on se dirige vers victoire.html
		reqD = request.getRequestDispatcher("echec.html");	
			
		}else {
		
		//sinon , on se dirige vers echec.html
		reqD = request.getRequestDispatcher("victoire.html");	
		}
		reqD.forward(request, response);
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
