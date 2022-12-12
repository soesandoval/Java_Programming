package Day09_Switch_And_Scanner;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = input.nextInt();

        String day= "Invalid";

        if(num%2==0){
            System.out.println(" Your number is even");
        }else{
            System.out.println("Your number is odd");
        }
input.close();




    }
}
