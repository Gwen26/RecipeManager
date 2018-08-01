package fr.imie.MyRecipeProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.imie.MyRecipeProject.entity.Ingredient;
import fr.imie.MyRecipeProject.repository.IngredientRepository;

@Service
public class IngredientService {
	
	@Autowired
	private IngredientRepository ingredientRepository;

	public List<Ingredient> getAllIngredient(){
		return ingredientRepository.findAll();
	}
	
	

}
