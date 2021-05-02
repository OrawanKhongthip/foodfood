public class Food{
    private String name;        //name of item
    private double price;       //price of item
    private String description; //description of item

    
    public Food(String name, double price,String description){
        this.name = name;
        this.price = price;
        this.description = description;

    }
    
    public Food(Food foodItem){
        this.name = name;
        this.price = price;
        this.description = description;
    }
        
    
    public String getInfo(){ //used in the menu's search method to find item based on key word
        return name + " " + price + " " + description;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    }
