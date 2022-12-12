package Day09_Switch_And_Scanner;
import java.util.Scanner;
public class EligibleToBuy {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int num = input.nextInt();

        String age = "Not eligible to buy alcohol";

        if(num>=21 && num<=100){
            System.out.println("Eligible to buy alcohol");
        }
input.close();

    }
}
