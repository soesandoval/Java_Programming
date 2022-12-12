package Day09_Switch_And_Scanner;
import java.util.Scanner;
public class Scanner_Intro3 {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        System.out.println("Enter a character");
        char ch= input.next().charAt(0);

       // System.out.println("You have entered: " + ch);

        System.out.println("Would you like to continue");
         String answer= input.next();// One word input
           // String answer = input.nextLine();


        System.out.println("You have entered: " + answer);

input.close();
    }
}
