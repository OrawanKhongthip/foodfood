import java.util.ArrayList;

public class Order {
    // private static int numberOfOrders = 0;  //keeps track of how many orders have been processed
    // private int orderNumber;            //prioritizes when orders are sent out
    // private ArrayList<OrderedFoodItem> orderedFoodItems;
    private String orderName = "";
    private int orderNumber;     
    private ArrayList<Food> food = new ArrayList<Food>();
    
    
    public Order(String name) {
        // this.orderNumber = ordernum;
        this.orderName = name;
    }

    public void addFood(Food selectedFood) {
        food.add(selectedFood);
    }
    
    // public void addFoodItem(Food fooditem){
    //     OrderedFoodItem orderedFoodItem = new OrderedFoodItem(fooditem, orderNumber);
    //     orderedFoodItems.add(orderedFoodItem);
    // }
    
    public void removeFood(int foodId){
        food.remove(foodId);
    }
    
    // public ArrayList<OrderedFoodItem> getOrder(){
    //     return orderedFoodItems;
    // }

    public Food getFood(int foodId) {
        return food.get(foodId);
    }
    
    public ArrayList<Food> getAllFood() {
        return this.food;
    }
}
 