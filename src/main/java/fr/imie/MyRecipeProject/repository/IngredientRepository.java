package fr.imie.MyRecipeProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.imie.MyRecipeProject.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
	

}
