package org.ncu.recipe_app.controller;

import org.ncu.recipe_app.entities.Recipe;
import org.ncu.recipe_app.service.RecipeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/app")
public class RecipeController {

	@Autowired
	private RecipeServiceImpl recipeService;

	@GetMapping("/recipes")
	public List<Recipe> fetchRecipes() {
		return recipeService.getAllRecipes();
	}

	@GetMapping("/recipes/{id}")
	public Recipe fetchRecipe(@PathVariable String id) {
		return recipeService.getRecipeById(id);
	}

	@PostMapping("/recipes")
	public Recipe createRecipe(@RequestBody Recipe recipe) {
		return recipeService.createRecipe(recipe);
	}

	@PutMapping("/recipes/{id}")
	public Recipe updateRecipe(@PathVariable String id, @RequestBody Recipe recipe) {
		return recipeService.updateRecipe(id, recipe);
	}

	@DeleteMapping("/recipes/{id}")
	public void deleteRecipe(@PathVariable String id) {
		recipeService.deleteRecipe(id);
	}
}
