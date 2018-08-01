package fr.imie.MyRecipeProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.imie.MyRecipeProject.entity.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
	

}
