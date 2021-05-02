import java.util.*;
import java.util.InputMismatchException;

public class Customer extends Users {
    // String[][] foodmenu = { {"1.Egg fired rice","45 bath"}, {"2.Omlet","20 bath"} };
    String username = "";
    Order order = null;
    ArrayList<Food> basket = new ArrayList<Food>();
    
    Scanner sc = new Scanner(System.in);;

    public void control() {
        

        do {
            System.out.println("---- Welcome to FOODFOOD Customer's page ----");
            System.out.println("<< Type 99 to go back");
            System.out.print("Enter your name: ");
            username = sc.next();
            order = new Order(username);

            if (!"99".equals(username)) {
                super.setCustomer_name(username);
                CustomerPanal();
            } else {

            }

        } while ((!"99".equals(username)));
    }

    private void CustomerPanal() {
        System.out.println("---- Customer's Panel ----");

        int choose = 0;

        do {
            try {
                
                System.out.println(
                        "1. List all available menus\n2. List all items from your basket\n3. Select menu\n4. Purchase order\n5. Cancel order");
                System.out.println("<< Type 99 to go back");
                System.out.print(">>> : ");
                choose = sc.nextInt();
           
                // 1. List all available menu
                if (choose == 1) {
                    System.out.println("------ 1. List all available menu ------");
                    for(int i = 0; i < totalFoodMenu.size(); i++){
                        System.out.println("Food ID: " + i);
                        System.out.println("Food Name: " + totalFoodMenu.get(i).getName());
                        System.out.println("Food Price: " + totalFoodMenu.get(i).getPrice());
                        System.out.println("----------------------------");
                    }
                    

                } // 2. List all items from your basket
                else if (choose == 2) {
                    System.out.println("------- 2. List all items from from your basket -------");
                    
                    if (basket.size() == 0) {
                        System.out.println("=== There are no item in your basket! ===");
                    } else {
                        for (int i =0 ; i < basket.size() ;i++ ){
                            //show basket list !!!
                            System.out.println("----- Item #" + i + " -----");
                            System.out.println("-"+ basket.get(i).getName());
                            System.out.println("-"+ basket.get(i).getPrice());
                        }
                    }

                    
                } // 3. Select menu
                else if (choose == 3) {
                    
                    int selectMenu;
                    int choice;
                    boolean finish = false;
                    
                    while (!finish) {
                        System.out.println("------- 3. Select menu -------");
                        System.out.println("<< Type 99 to go finish >>");
                        choice = sc.nextInt();

                        switch (choice) {
                            case 99:
                                finish = true;
                                break;
                            
                            default:
                                System.out.println("You have selected " + totalFoodMenu.get(choice).getName());
                                order.addFood(totalFoodMenu.get(choice));

                        }
                        
                    }

                    
                }//  4. Purchase order
                else if (choose == 4) {
                    System.out.println("------- 4. Purchase order -------");
                    
                    double totalPrice = 0;

                    for (int i = 0; i < basket.size() ; i++) {
                        totalPrice += basket.get(i).getPrice();
                    }
                    System.out.println("Total Price :"+ totalPrice);
                    System.out.println(" ** Are you sure want to purchase order now !!! ** ");
                    System.out.println("** Type 1 = yes, 2 = no **");
                    int conf = sc.nextInt();
                    if(conf == 1){
                        for (int i = 0; i < basket.size(); i++) {
                            order.addFood(basket.get(i));
                        }

                        queue.enqueue(order);
                        System.out.println(" --- Purchase successfull !!! --- ");
                    }else{
                        
                    }
                }//  5. Cancel order
                else if (choose == 5) {
                    System.out.println("------- 5. Remove basket item -------");

                    System.out.println(" !!! Are you sure you want to delete all item? !!! ");
                    System.out.println("** Type 1 = yes, 2 = no **");
                    int conf = sc.nextInt();

                    if(conf == 1) {
                        basket.clear();
                    } else {

                    }
                    
                }

            } catch (InputMismatchException e) {
                System.out.println("Please type number to select!!");
            }

         } while (choose != 99);

    }
}
