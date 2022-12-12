package Day15_LoopsContinue;
import java.util.Scanner;
public class MinimumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min = 2147483647;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num1 = input.nextInt();

            if(num1 <min){
                min = num1;
            }
        }
        input.close();

        System.out.println("Minimum number is: " + min);

    }
}
