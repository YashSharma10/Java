package org.ncu.recipe_app.dao;

import org.ncu.recipe_app.entities.Recipe;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RecipeDAOImpl implements RecipeDAO {

    private List<Recipe> recipeList = new ArrayList<>();

    @Override
    public List<Recipe> getAllRecipes() {
        return recipeList;
    }

    @Override
    public Recipe getRecipeById(String id) {
        for (Recipe recipe : recipeList) {
            if (recipe.getId().equals(id)) {
                return recipe;
            }
        }
        return null;
    }

    @Override
    public Recipe createRecipe(Recipe recipe) {
        recipeList.add(recipe);
        return recipe;
    }

    @Override
    public Recipe updateRecipe(String id, Recipe recipe) {
        for (Recipe r : recipeList) {
            if (r.getId().equals(id)) {
                r.setName(recipe.getName());
                r.setDescription(recipe.getDescription());
                r.setIngredients(recipe.getIngredients());
                r.setPrice(recipe.getPrice());
                r.setCalories(recipe.getCalories());
                r.setRecipeType(recipe.getRecipeType());
                return r;
            }
        }
        return null;
    }

    @Override
    public void deleteRecipe(String id) {
        recipeList.removeIf(recipe -> recipe.getId().equals(id));
    }
}
