public class OrderedFoodItem extends Food{
    private int orderNumber;

    
    public OrderedFoodItem(Food foodItem, int orderNumber){
        super(foodItem);
        this.orderNumber = orderNumber;
    }   
    
    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
}