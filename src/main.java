import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputrole;

        do {
            System.out.println("===== Hello Welcome to FOODFOOD!! ┗(•̀へ •́ ╮ ) =====");
            System.out.println("----- Please select your role first -----");
            System.out.println("Enter types of user : 1 = Customer, 2 = Chef or types 99 to exit.");
            System.out.print("•̀.̫•́✧ >> : ");
            inputrole = sc.nextInt();

            if (inputrole == 1) {
                // Customer area
                Customer ctm = new Customer();
                ctm.control();
                System.out.println("Sorry kub, Not avilable now (TT)");
            } else if (inputrole == 2) {
                Chef ch = new Chef();
                ch.control();
            } else if (inputrole == 99) {
                System.out.println("Thanks, see you later! óò");
            }
        }while(inputrole != 99);



    }
}