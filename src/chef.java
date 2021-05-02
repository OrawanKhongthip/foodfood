
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class chef extends Users {

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

                //Add new menu 
                if (chose == 1) {
                    System.out.println("------ Add new menu to your collection! (/◕ヮ◕)/ ------");
                    System.out.println("waiting for chef karnny");

                } //List all avaliable menus
                else if (chose == 2) {
                    System.out.println("waiting for chef karnny");
                } //manage order 
                else if (chose == 3) {
                    int fin;
                    do {
                        System.out.println("--- Customer Orders Management ---");
                        System.out.println("( ︶︿︶) or Type 99 to go back");
                        System.out.println(">> Type 1 to show your current order!");
                        System.out.print("•̀.̫•́✧ >> : ");
                        fin = sc.nextInt();
                        
                        if (fin == 1) {

                            //get order number from class Order
                            Order order = new Order();
                            int orderNumber = order.getOrderNumber();

                            //get arrayList value
                            ArrayList<OrderedFoodItem> orderList = order.getOrder();
                            //orderList.get(0);
                            
                            //set Queue size
                            InfiniteCircularArrayQueue queue = new InfiniteCircularArrayQueue(orderList.size());
                            //queue.enqueue(9);
                           for(int i=0; i< orderList.size(); i++){
                               queue.enqueue(orderList.get(i).getOrderNumber());
                           }
                            queue.printQueue();

                        } else {
                            System.out.println("Please select the option ̴⃙̀˘︷˘⁼̴⃙́");
                        }
                    } while (fin != 99);

                }

            } catch (InputMismatchException e) {
                System.out.println("Please type number to select!!");
            }

        } while (chose != 99);

    }


}
