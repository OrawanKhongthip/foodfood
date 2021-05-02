import java.util.ArrayList;

public class Order {
    private static int numberOfOrders = 0;  //keeps track of how many orders have been processed
    private int orderNumber;            //prioritizes when orders are sent out
    private ArrayList<OrderedFoodItem> orderedFoodItems;
    
    public Order(){
        orderNumber = numberOfOrders;
        numberOfOrders++;
        orderedFoodItems = new ArrayList<OrderedFoodItem>();
    }
    
    public void addFoodItem(Food fooditem){
        OrderedFoodItem orderedFoodItem = new OrderedFoodItem(fooditem, orderNumber);
        orderedFoodItems.add(orderedFoodItem);
    }
    
    public void removeFoodItem(OrderedFoodItem orderedFoodItem){
        orderedFoodItems.remove(orderedFoodItem);
    }
    
    public ArrayList<OrderedFoodItem> getOrder(){
        return orderedFoodItems;
    }
    
    public int getOrderNumber(){
        return orderNumber;
    }
}
 