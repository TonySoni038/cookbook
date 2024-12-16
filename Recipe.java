import java.util.ArrayList;

public class Recipe {

    //instance variables
    private String name;
    private ArrayList<String> ingredients;
    private ArrayList<String> instructions;
    private String category;

    //constructors
    public Recipe() {}

    public Recipe(String name, ArrayList<String> ingredients,
                ArrayList<String> instructions, String category) {
        
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.category = category;
    }

    //getters
    public String getName() {
        return name;
    }
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    public ArrayList<String> getInstructions() {
        return instructions;
    }
    public String getCategory() {
        return category;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setIngrents(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }
    public void setInstructions(ArrayList<String> instructions) {
        this.instructions = instructions;
    }
    public void setCategory(String category) {
        this.category = category;
    }

}