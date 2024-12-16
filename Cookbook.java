import java.util.ArrayList;

public class Cookbook {

    private ArrayList<Recipe> recipes;

    //Constructors
    public Cookbook() {
        recipes = new ArrayList<Recipe>();
    }

    public Cookbook(ArrayList<Recipe> recipes) {
        this.recipes = new ArrayList<Recipe>();
        
        for (Recipe i : recipes) {
            this.recipes.add(i);
        }
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public ArrayList<Recipe> getRecipeByCategory(String category) {
        ArrayList<Recipe> recipesByCategory = new ArrayList<Recipe>();

        for (Recipe recipe : recipes) {
            if (recipe.getCategory().equals(category)) {
                recipesByCategory.add(recipe);
            }
        }
        return recipesByCategory;
    }

    public ArrayList<Recipe> searchRecipe(String keyword) {
        ArrayList<Recipe> RecipesByKeyword = new ArrayList<Recipe>();

        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(keyword)) {
                RecipesByKeyword.add(recipe);
            }
        }

        return RecipesByKeyword;
    }
}
