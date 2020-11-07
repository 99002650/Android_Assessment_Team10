package com.example.yummy;

public class RecyclerData {

    private String recipeName;
    private String recipeData;
    private Integer recipeImage;
    private String recipeId;


    public RecyclerData(String recipeName, String recipeData, Integer recipeImage, String recipeId) {
        this.recipeName = recipeName;
        this.recipeData = recipeData;
        this.recipeImage = recipeImage;
        this.recipeId = recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeData() {
        return recipeData;
    }

    public void setRecipeData(String recipeData) {
        this.recipeData = recipeData;
    }

    public Integer getRecipeImage() {
        return recipeImage;
    }

    public void setRecipeImage(Integer recipeImage) {
        this.recipeImage = recipeImage;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }
}

