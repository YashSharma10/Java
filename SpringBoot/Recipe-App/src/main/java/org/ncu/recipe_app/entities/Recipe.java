package org.ncu.recipe_app.entities;

import java.util.List;

public class Recipe {
    private String id;
    private String name;
    private String description;
    private List<String> ingredients;
    private double price;
    private int calories;
    private char recipeType;

    public Recipe() {
    	
    }

    public Recipe(String id, String name, String description, List<String> ingredients, double price, int calories, char recipeType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.price = price;
        this.calories = calories;
        this.recipeType = recipeType;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public char getRecipeType() {
        return recipeType;
    }

    public void setRecipeType(char recipeType) {
        this.recipeType = recipeType;
    }

    
    @Override
    public String toString() {
        return "Recipe{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ingredients=" + ingredients +
                ", price=" + price +
                ", calories=" + calories +
                ", recipeType=" + recipeType +
                '}';
    }
}
