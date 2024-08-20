package org.ncu.recipe_app.service;

import org.ncu.recipe_app.dao.RecipeDAO;
import org.ncu.recipe_app.entities.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeDAO recipeDao;

    @Override
    public List<Recipe> getAllRecipes() {
        return recipeDao.getAllRecipes();
    }

    @Override
    public Recipe getRecipeById(String id) {
        return recipeDao.getRecipeById(id);
    }

    @Override
    public Recipe createRecipe(Recipe recipe) {
        return recipeDao.createRecipe(recipe);
    }

    @Override
    public Recipe updateRecipe(String id, Recipe recipe) {
        return recipeDao.updateRecipe(id, recipe);
    }

    @Override
    public void deleteRecipe(String id) {
        recipeDao.deleteRecipe(id);
    }
}
