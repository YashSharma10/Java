package org.ncu.recipe_app.service;

import java.util.List;

import org.ncu.recipe_app.entities.Recipe;

public interface RecipeService {
    List<Recipe> getAllRecipes();
    Recipe getRecipeById(String id);
    Recipe createRecipe(Recipe recipe);
    Recipe updateRecipe(String id, Recipe recipe);
    void deleteRecipe(String id);
}
