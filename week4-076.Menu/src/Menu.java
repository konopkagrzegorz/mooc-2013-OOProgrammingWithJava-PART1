
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }
    
    public void addMeal(String meal) {
        while (!this.meals.contains(meal)) {
        this.meals.add(meal);
        }
    }
    
    public void printMeals() {
        for (int i = 0; i < this.meals.size(); i++) {
            System.out.println(this.meals.get(i));
        }
    }
    public void clearMenu() {
        this.meals.clear();
    }
    // add the methods here
}
