package Day09_Switch_And_Scanner;
import java.util.Scanner;
public class NextLine_Vs_Next {
    public static void main(String[] args ){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine(); //VERY IMPORTANT STEP

        System.out.println("Enter your full name");
        String fullName= input.nextLine();

        System.out.println("Age= " + age);
        System.out.println("Full name= " + fullName);

    }
}
