package fr.imie.MyRecipeProject.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import fr.imie.MyRecipeProject.entity.Ingredient;
import fr.imie.MyRecipeProject.service.IngredientService;

@WebServlet(urlPatterns="/listIngredient")
public class ListIngredientServlet  extends HttpServlet{
	
	@Autowired
	private IngredientService ingredientService;
	
	public void init(ServletConfig config) {
//	    super.init(config);
	    SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
	      config.getServletContext());
	  }
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Ingredient> ingredients = ingredientService.getAllIngredient();
		req.setAttribute("ingredients", ingredients);
		
		RequestDispatcher rd = req.getRequestDispatcher("/listIngredient.jsp");
		rd.forward(req, resp);
		
	}

}
