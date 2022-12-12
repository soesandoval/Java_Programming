package Day11_StringPart2;
import java.util.Scanner;
public class LogIn {
    public static void main(String[] args){

        String correctUserName= "Cydeo", // literal
                correctPassword= "WoodenSpoon" ; // literal

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String userName= input.nextLine(); // new

        System.out.println("Enter your password: ");
        String password = input.nextLine();

        input.close();

        if(userName.equals(correctUserName)   && password.equals(correctPassword)     ){
            System.out.println("You are now logged in");
        }else {
            System.out.println("Incorrect Username or Password. Please try again.");
        }






    }
}
