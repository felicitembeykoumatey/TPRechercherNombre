package fr.eni.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletParametreInitialisation
 */
@WebServlet(urlPatterns="/parametre",
initParams=
{
		@WebInitParam
		(description ="un parametre d'initialisation",
				name="NOM_PARAMETRE",
				value="VALEUR_PARAMETRE")
		}
		
		
		
		)
public class ServletParametreInitialisation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String valeurParametre;
	
	@Override
	public void init() throws ServletException {
	valeurParametre=this.getInitParameter("NOM_PARAMETRE");
		super.init();
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("NOM_PARAMETRE = ").append(this.valeurParametre);
		System.out.println("valeurParametre:"+valeurParametre );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
