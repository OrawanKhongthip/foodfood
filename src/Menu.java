import java.util.ArrayList;

public class Menu{
    private ArrayList<Food> menuItems;
    private ArrayList<Food> results; //search results from searchMenu method
    
    public Menu(){
        menuItems = new ArrayList<Food>();
        results = new ArrayList<Food>();
    }
    
    public Menu(ArrayList<Food> existingMenu){
        for(Food item : existingMenu){
            menuItems.add(item);
        }
        results = new ArrayList<Food>();
    }
    
    public void addItem(Food food){
        menuItems.add(food);
    }
    
    public void removeItem(String name){
        for(Food food : menuItems){
            if(name.equals(food.getName())){
                System.out.println(food.getName() + " has been removed from the menu.");
                menuItems.remove(food);
                break;
            }
        }
        System.out.println("No item found");
    }
    
    public Food getItem(String name){
        for(Food food : menuItems){
            if(name.equals(food.getName())){
                return food;
            }
        }
        return null;
    }
    
    public ArrayList<Food> searchMenu(String str){
        results.clear();
        for(Food food : menuItems){
            if(food.getInfo().contains(str)){
                results.add(food);
            }
        }
        return results;
    }
    
    public ArrayList<Food> getMenu(){
        return menuItems;
    }   
    
    public int getMenuSize(){
        return menuItems.size();
    }
}