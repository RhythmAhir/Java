package fdmwebapp.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/pokemonMaker")
public class myFirstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("makeyourpokemon.html").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		System.out.println("Received: " +name+ " and Type: "+type);
		Pokemon pokemon = new Pokemon(name, type);
		
		
		HttpSession session = req.getSession();
		List<Pokemon> listPokemon = (List<Pokemon>) session.getAttribute("listPokemon");
		if(listPokemon == null) {
			listPokemon = new ArrayList<>();
			session.setAttribute("listPokemon", listPokemon);
			
		}
		
		listPokemon.add(pokemon);
		
		req.getRequestDispatcher("WEB-INF/views/ListOfPokemon.jsp").forward(req, resp);
	
	}
	
}
