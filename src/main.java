import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputrole;

        do {
            System.out.println("===== Hello Welcome to FOODFOOD!! ┗(•̀へ •́ ╮ ) =====");
            System.out.println("----- Please select your role first -----");
            System.out.println("Enter types of user : 1 = Customer, 2 = Chef or types 98 to exit.");
            System.out.print("•̀.̫•́✧ >> : ");
            inputrole = sc.nextInt();
            Users user[] = new Users[2];
            if (inputrole == 1) {
                // Customer area
                user[0] = new Customer();
                user[0].control();
                
            } else if (inputrole == 2) {
                user[1] = new Chef();
                user[1].control();
            } else if (inputrole == 98) {
                System.out.println("Thanks, see you later! óò");
            }
        }while(inputrole != 98);



    }
}