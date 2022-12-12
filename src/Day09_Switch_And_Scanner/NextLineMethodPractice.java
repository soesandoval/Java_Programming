package Day09_Switch_And_Scanner;
import java.util.Scanner;
public class NextLineMethodPractice {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName= input.nextLine();

        System.out.println("Enter your School name: ");
        String schoolName= input.nextLine();

        System.out.println("Enter your gender: ");
        String gender= input.next();

        System.out.println("Enter your age: ");
        int age= input.nextInt();

         input.nextLine();// ADDITIONAL NEXT LINE IF ANOTHER METHOD IS USED BEFORE...

        System.out.println("Enter your street name: ");
        String streetName= input.nextLine();
    }
}
