package Day16_NestedLoops;

import java.util.Scanner;

public class CydeoLogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String username = input.next();

        System.out.println("Enter your password: ");
        String password = input.next();

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("You are now logged in.");
        }else{

            for (int i = 0; i < 3; i++) {
                System.err.println("Incorrect username or password. Please re-enter: ");
                System.out.println("Enter your username: ");
                username = input.next();
                System.out.println("Enter your password: ");
                password = input.next();

                if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
                    System.out.println("You are now logged in");
                    break;
                }
                if (! (username.equals("Cydeo") && password.equals("WoodenSpoon")) ){
                    System.err.println("Your account now is locked. Please contact the support team.");
                    break;
                }
            }
        }




    }
}
