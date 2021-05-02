
import java.util.InputMismatchException;
import java.util.Scanner;


import java.util.ArrayList;

public class Chef extends Users {

    Scanner sc;

    @Override
    public void control() {
        sc = new Scanner(System.in);

        System.out.println("----- Please Login to Chef's System -----");
        String username;
        String password;
        do {
            System.out.print("Enter Username: ");
            username = sc.next();
            System.out.print("Enter Password: ");
            password = sc.next();

            if (username.equals(getChef_username()) && password.equals(getChef_password())) {
                System.out.println("Login Successful!");
                chefPanel();
            } else {
                System.out.println("username or password incorrect, please try again ᕙ(⇀‸↼‶)ᕗ");
            }
        } while ((!"99".equals(username)) || (!"99".equals(password)));

    }

    private void chefPanel() {
        System.out.println("****** Chef Panel ******");

        int chose = 0;
        do {
            try {
                System.out.println("1. Add new menu\n2. List all available menus. \n3. Manage orders from customer");
                System.out.println("( ︶︿︶) or Type 99 to go back");
                System.out.print("•̀.̫•́✧ >> : ");
                chose = sc.nextInt();

                // Add new menu
                if (chose == 1) {
                    System.out.println("------ Add new menu to your collection! (/◕ヮ◕)/ ------");
                    System.out.println("waiting for chef karnny");
                    int addAmount = 0;
                    System.out.print("How many food to add? : ");
                    addAmount = sc.nextInt();

                    for (int i = 0; i < addAmount; i++) {
                        String foodName = "";
                        double foodPrice = 0;
                        System.out.println("Food number #" + (i + 1));
                        System.out.print("Enter food name: ");
                        foodName = sc.next();
                        System.out.print("Enter food price: ");
                        foodPrice = sc.nextInt();

                        Food food = new Food(foodName, foodPrice);
                        totalFoodMenu.add(food);
                    }



                } // List all avaliable menus
                else if (chose == 2) {
                    System.out.println("------- Your available menus -------");

                    // ArrayList<Food> totalFoodMenu = new ArrayList<Food>();
                    for(int i = 0; i < totalFoodMenu.size(); i++){
                        System.out.println("--------------------------");
                        System.out.println("Food Number : " + i);
                        System.out.println("Food Name : " + totalFoodMenu.get(i).getName());
                        System.out.println("Food Price: " + totalFoodMenu.get(i).getPrice());
                    }
                    
                } // manage order
                else if (chose == 3) {
                    int fin;
                    do {
                        System.out.println("--- Customer Orders Management ---");
                        // System.out.println(">> Type 1 to show your current order!");
                        System.out.println("Type 99 to go back <<");
                        System.out.print("•̀.̫•́✧ >> : ");
                        fin = sc.nextInt();

                        if (fin == 1) {
                            // get order number from class Order
                            // Order order = new Order();

                            // get arrayList value
                            // ArrayList<Food> orderList = order.getAllFood();

                            // set Queue size
                            // InfiniteCircularArrayQueue queue = new InfiniteCircularArrayQueue(orderList.size());
                            // queue.enqueue(9);
                            for (int i = 0; i < orderList.size(); i++) {
                                queue.enqueue(orderList.getFood(i));
                                queue.printQueue();

                                System.out.println(">> Type 1 to finish this order ლ(´ڡ`ლ)");
                                int select = sc.nextInt();

                                if (select == 1) {
                                    queue.dequeue(orderList.getFood(i));
                                    System.out.println("Hope our customer enjoy their meal!");
                                    System.out.println("◕‿◕");
                                } else {
                                    System.out.println("Please select some option ̴(T_T)");
                                }
                            }

                        } else {
                            System.out.println("Please select some option ̴(T_T)");
                        }
                    } while (fin != 99);

                }

            } catch (InputMismatchException e) {
                System.out.println("Please type number to select!!");
            }

        } while (chose != 99);

    }

}
