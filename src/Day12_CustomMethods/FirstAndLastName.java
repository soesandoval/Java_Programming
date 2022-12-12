package Day12_CustomMethods;
import java.util.Scanner;
public class FirstAndLastName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name? ");
        String first = input.nextLine().trim().replace("   ", "");


        System.out.println("What is your last name?");
        String last = input.nextLine().trim().replace("   ", "");

        input.close();

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase() ;
        //      getting first character of first name + the remaining characters of the first name
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase() ;

       String fullName = first + " " + last;

        System.out.println("Your full name is: " + fullName);




    }
}
