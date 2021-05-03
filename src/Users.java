import java.util.ArrayList;
public abstract class Users {
    protected final String chef_username = "chef";
    protected final String chef_password = "1234";
    
    private static String customer_name = "customer";
    protected static InfiniteCircularArrayQueue queue = new InfiniteCircularArrayQueue();
    
    protected static ArrayList<Food> totalFoodMenu = new ArrayList<Food>();
    
    public abstract void control();

    public String getChef_username() {
        return chef_username;
    }

    public String getChef_password() {
        return chef_password;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String name) {
        Users.customer_name = name;
    }

    public void floodScreen() {
        int floodRange = 100;
        for (int i = 0; i < floodRange ; i++) {
            System.out.println(" ");
        }
    }
 
    
    
}
