public class Food{
    private String name;        //name of item
    private double price;       //price of item


    
    public Food(String name, double price){
        this.name = name;
        this.price = price;

    }
        
    
    public String getInfo(){ //used in the menu's search method to find item based on key word
        return name + " " + price + " ";
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price ) {
        this.price = price;
    }

    }
